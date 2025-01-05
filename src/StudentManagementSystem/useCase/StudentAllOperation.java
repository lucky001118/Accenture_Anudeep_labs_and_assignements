package StudentManagementSystem.useCase;

import StudentManagementSystem.service.StudentService;
import StudentManagementSystem.serviceImpl.StudentServiceImpl;

import java.util.Scanner;

public class StudentAllOperation {

    public Scanner sc = new Scanner(System.in);
    private StudentService studentService = new StudentServiceImpl();

    public void allOps(){
        System.out.println("click 1 for register student \n "+"click 2 for all student ");
        int choise = sc.nextInt();

        switch (choise){
            case 1:
                break;
            case 2:
                studentService.getAllStudents();
                break;

            default:
                break;
        }
    }
}
