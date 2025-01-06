package StudentManagementSystem.model;

public class Student {

    private int RollNo;
    private String Name;
    private String address;

    public Student(int rollNo, String name, String address) {
        RollNo = rollNo;
        Name = name;
        this.address = address;
    }

    public Student(){

    }

    public int getRollNo() {
        return RollNo;
    }

    public Student setRollNo(int rollNo) {
        RollNo = rollNo;
        return this;
    }

    public String getName() {
        return Name;
    }

    public Student setName(String name) {
        Name = name;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Student setAddress(String address) {
        this.address = address;
        return this;
    }

    @Override
    public String toString() {
        return "Student{" +
                "RollNo=" + RollNo +
                ", Name='" + Name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
