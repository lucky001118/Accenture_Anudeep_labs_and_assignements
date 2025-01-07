package StudentManagementSystem.serviceImpl;

import StudentManagementSystem.dao.StudentDao;
import StudentManagementSystem.daoImpl.StudentDaoImpl;
import StudentManagementSystem.exception.StudentException;
import StudentManagementSystem.model.Student;
import StudentManagementSystem.service.StudentService;
import StudentManagementSystem.utility.Dao;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    private StudentDao studentDao = new StudentDaoImpl();
    @Override
    public String registerStudent(Student student) throws StudentException {
        return studentDao.registerStudent(student);
    }

    @Override
    public String deleteStudent(Integer rollNumber) throws StudentException {
        return studentDao.deleteStudent(rollNumber);
    }

    @Override
    public String updateStudent(Student student) throws StudentException {
        return studentDao.updateStudent(student);
    }

    @Override
    public List<Student> getAllStudents() throws StudentException {
        return studentDao.getAllStudents();
    }

    @Override
    public Student getStudentByRollNumber(Integer rollNumber) throws StudentException {
        return studentDao.getStudentByRollNumber(rollNumber);
    }
}
