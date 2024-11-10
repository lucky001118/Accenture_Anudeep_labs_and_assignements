package com.nov07;

import java.util.*;

public class Basic {
    public static void main(String[] args) {
//        Set interface
//        set do not allows any duplicate values
//        it will not allow any insertion order
//        it will not allows more than one null values

        Set<String> set = new HashSet<>();
        set.add("Sankalp");
        set.add("Sankalp");
        set.add("Sankalp");
        set.add("samar");
        set.add("Lucky");
        set.add(null);
        set.add(null);

        System.out.println(set);

        //LinkedHasSet
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(155);
        linkedHashSet.add(5);
        linkedHashSet.add(55);
        linkedHashSet.add(55);
        linkedHashSet.add(null);
        linkedHashSet.add(null);
        linkedHashSet.add(789);
        linkedHashSet.add(582);
        System.out.println(linkedHashSet);

//        TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(5824);
        treeSet.add(12);
        treeSet.add(12);
        treeSet.add(45);
        treeSet.add(475);
//        treeSet.add(null);
//        treeSet.add(null);
        treeSet.add(45852);
        treeSet.add(452);
        System.out.println(treeSet);


        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(new Student(1,"Lucky Manikpuri","Advance Java"));
        arrayList.add(new Student(1,"Lucky Manikpuri","Advance Java"));
        arrayList.add(new Student(2,"Code with harry","Advance Java"));
        arrayList.add(new Student(3,"Ritika sahu","Advance Java"));
        arrayList.add(new Student(4,"Saurabh Dewangan","Advance Java"));
        arrayList.add(new Student(5,"Kush Kumar singh","Advance Java"));

        System.out.println("ArrayList: "+arrayList);
        Set<Student> studentSet = new HashSet<>();
        studentSet.addAll(arrayList);

        System.out.println("Set with Student has a relation: "+studentSet);

        TreeSet<Student> studentTreeSet = new TreeSet<>();
        //The TreeSet will take only that object which is implementing Compaireable inteface
    }
}
