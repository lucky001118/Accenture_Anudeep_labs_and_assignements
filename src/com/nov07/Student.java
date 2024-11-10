package com.nov07;

public class Student {
    private int id;
    private String name;
    private String corse;

    public Student(int id, String name, String corse) {
        this.id = id;
        this.name = name;
        this.corse = corse;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", corse='" + corse + '\'' +
                '}';
    }
}
