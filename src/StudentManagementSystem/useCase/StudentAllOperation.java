package StudentManagementSystem.useCase;

import StudentManagementSystem.model.Student;
import StudentManagementSystem.service.StudentService;
import StudentManagementSystem.serviceImpl.StudentServiceImpl;

import java.util.Scanner;

public class StudentAllOperation {

    public Scanner sc = new Scanner(System.in);
    private StudentService studentService = new StudentServiceImpl();

    public void allOps(){
        System.out.println("click 1 for register student \n "+"click 2 for all student \n "+" click 3 for delete particular student \n "+" click 4 for update the student ");
        int choise = sc.nextInt();

        switch (choise){
            case 1:
                System.out.println("Enter the student' roll number: ");
                int roll = sc.nextInt();
                sc.nextLine(); // Consume the newline character after nextInt()
                System.out.println("Enter the student's Name: ");
                String name = sc.nextLine();
                sc.nextLine(); // Consume the newline character after nextInt()
                System.out.println("Enter the student's Address: ");
                String address = sc.nextLine();

                Student student = new Student();
                student.setRollNo(roll);
                student.setName(name);
                student.setAddress(address);

                studentService.registerStudent(student);
                break;
            case 2:
                studentService.getAllStudents();
                break;
            case 3:
                System.out.println("Enter the roll number of the student whose you want to delete: ");
                int deleteStudentRoll = sc.nextInt();
                studentService.deleteStudent(deleteStudentRoll);
                break;
            case 4:
                System.out.println("Enter the student's roll number: ");
                int updateStRoll = sc.nextInt();
                sc.nextLine(); // Consume the newline character after nextInt()
                System.out.println("Enter the student's Name: ");
                String updateStName = sc.nextLine();
                sc.nextLine(); // Consume the newline character after nextInt()
                System.out.println("Enter the student's Address: ");
                String updateStAddress = sc.nextLine();

                Student updatestudent = new Student();
                updatestudent.setRollNo(updateStRoll);
                updatestudent.setName(updateStName);
                updatestudent.setAddress(updateStAddress);

                studentService.updateStudent(updatestudent);
                break;

            default:
                System.out.println("you have entered the wrong option please retry...");
                break;
        }
    }
}
