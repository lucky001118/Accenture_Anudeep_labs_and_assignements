package com.day3.homework;

public class Test{

    static {
        System.out.println("mai hu static block ");
    }



    public static void main(String[] args) {
        Student.busfeeS();
		Student s  = new Student()  ;
        s.setName("Lucky Manikpuri");
        s.setAdhar("451643446813");
        Address ad = new Address(1,"Rajnandgaon","Chhattishgarh");
        s.setAddress(ad);



		System.out.println(s.getAddress());
		System.out.println(s.getName());
		System.out.println(s.getAdhar());
        System.out.println("--------------------------------");

        //we have to set city raj to durg

        ad.setCity("Durg");
//        s.setAddress(ad);
        System.out.println(s.getName());
        System.out.println(s.getAddress());
        System.out.println(s.getAdhar());

        s.getAddress().setCity("Bhilai");





    }


}
