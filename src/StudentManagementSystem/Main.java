package StudentManagementSystem;

import StudentManagementSystem.useCase.StudentAllOperation;

public class Main {
    public static void main(String[] args) {
        StudentAllOperation stusentAllOperation = new StudentAllOperation();

        stusentAllOperation.allOps();
    }
}
