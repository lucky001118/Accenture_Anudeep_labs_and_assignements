package com.day4;

public class CarFactory  extends Car {


    // it is must that this carFactory have to give implementation of all abstract method

    @Override
    public void carBreak() {

        System.out.println("yaha bbreak oil ki help se lagata hai ");

    }

    @Override
    public void carAccelerate() {

        System.out.println("depends on combustion");

    }

}
