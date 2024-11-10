package com.quiz1;

//import java.util.Scanner;
import java.util.regex.*;

import java.util.*;

//enum Students{Suchita, Deepak, Vikash, Charu, Mahtab}
    public class TestQuestion{
    public int tester(String str) {

        if(str == null || str.length() == 0) {

            System.out.println("empty");

            return 0;

        }

        else {

            System.out.println("not empty");

            return 1;

        }

    }

    public static void main(String ar[]) {

        TestQuestion ob = new TestQuestion();

        ob.tester("hi");

        ob.tester("");

    }
}
