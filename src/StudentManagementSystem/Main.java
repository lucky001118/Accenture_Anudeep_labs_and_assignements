package StudentManagementSystem;

import StudentManagementSystem.useCase.StudentAllOperation;

public class Main {
    public static void main(String[] args) {

        // here all the students all opearations are presents
        StudentAllOperation stusentAllOperation = new StudentAllOperation();

        stusentAllOperation.allOps();
    }
}
