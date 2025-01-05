package StudentManagementSystem.dao;

import StudentManagementSystem.exception.StudentException;
import StudentManagementSystem.model.Student;

import java.util.List;

public interface StudentDao {

    //register
    public String registerStudent(Student student) throws StudentException;

    //delete the student
    public String deleteStudent(Integer rollNumber) throws StudentException;

    //update the student
    public String updateStudent(Student student) throws StudentException;

    //get the all the student
    public List<Student> getAllStudents() throws StudentException;

}
