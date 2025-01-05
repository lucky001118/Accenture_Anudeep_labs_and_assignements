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
        return null;
    }

    @Override
    public String deleteStudent(Integer rollNumber) throws StudentException {
        return null;
    }

    @Override
    public String updateStudent(Student student) throws StudentException {
        return null;
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
}
