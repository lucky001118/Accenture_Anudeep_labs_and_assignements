package StudentManagementSystem.exception;

public class StudentException extends RuntimeException{
    public StudentException(){
    }
    public StudentException(String msg){
        super(msg);
    }
}
