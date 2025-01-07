package StudentManagementSystem.daoImpl;

import StudentManagementSystem.dao.StudentDao;
import StudentManagementSystem.exception.StudentException;
import StudentManagementSystem.model.Student;
import StudentManagementSystem.utility.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {
    @Override
    public String registerStudent(Student student) throws StudentException {
        try {
            String queryString = "INSERT INTO student(RollNo, Name, Address) VALUES (?,?,?)";
            Connection connection = Dao.getInstance().getConnection();
            PreparedStatement ptmt = connection.prepareStatement(queryString);
            ptmt = connection.prepareStatement(queryString);
            ptmt.setInt(1, student.getRollNo());
            ptmt.setString(2, student.getName());
            ptmt.setString(3, student.getAddress());
            ptmt.executeUpdate();
            System.out.println("Data Added Successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "Insertion successfully done!";
    }

    @Override
    public String deleteStudent(Integer rollNumber) throws StudentException {
        try {
            String queryString = "DELETE FROM student WHERE RollNo=?";
            Connection connection = Dao.getInstance().getConnection();
            PreparedStatement ptmt = connection.prepareStatement(queryString);
            ptmt = connection.prepareStatement(queryString);
            ptmt.setInt(1, rollNumber);
            ptmt.executeUpdate();
            System.out.println("Data deleted Successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "Deleted successfully";
    }

    @Override
    public String updateStudent(Student student) throws StudentException {
        try{
            String query = "UPDATE student SET Name=? WHERE RollNo=?";
            Connection connection =  Dao.getInstance().getConnection();
            PreparedStatement ptmt = connection.prepareStatement(query);
            ptmt.setString(1, student.getName());
            ptmt.setInt(2, student.getRollNo());
            int rs = ptmt.executeUpdate();
            System.out.println("Table Updated Successfully");

            //if prepare statement have any istance the we have to close those connections
            if (ptmt != null)
                ptmt.close();
            if (connection != null)
                connection.close();

        }catch (SQLException e){
            e.printStackTrace();
        }
        return "update successfully";
    }

    @Override
    public List<Student> getAllStudents() throws StudentException {
        List<Student> allStudents = new ArrayList<>();

        try(Connection con = Dao.getInstance().getConnection()){
            PreparedStatement ps = con.prepareStatement("Select * from student");
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                System.out.println(rs.getInt(1)+", "+rs.getString(2)+", "+rs.getString(3));
            }

        }catch (SQLException e){
            e.printStackTrace();
            System.out.println(e);
        }

        return allStudents;
    }

    @Override
    public Student getStudentByRollNumber(Integer rollNumber) throws StudentException {
        Student student = new Student();

        try(Connection con = Dao.getInstance().getConnection()){
            String query = "Select * from student WHERE RollNo = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1,rollNumber);
            ResultSet rs = ps.executeQuery();


            while(rs.next()){
                System.out.println(rs.getInt(1)+", "+rs.getString(2)+", "+rs.getString(3));

                student.setRollNo(rs.getInt(1));
                student.setName(rs.getString(2));
                student.setAddress(rs.getString(3));
            }

        }catch (SQLException e){
            e.printStackTrace();
            System.out.println(e);
        }

        return student;
    }
}
