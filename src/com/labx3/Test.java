package com.labx3;

public class Test {
    public static void main(String[] args) {
        //creating the instance of the hillStation class
        HillStation hillStations;

        //now, using this reference we will call manali's methods
        hillStations = new Manali();
        System.out.println("The reference: "+hillStations);
        hillStations.location();
        hillStations.famousFor();

        //now, using this reference we will call masoori's methods
        System.out.println();
        hillStations = new Mussoorie();
        System.out.println("The reference: "+hillStations);
        hillStations.location();
        hillStations.famousFor();

        //now, using this reference we will call gulmarg's methods
        System.out.println();
        hillStations = new Gulmarg();
        System.out.println("The reference: "+hillStations);
        hillStations.location();
        hillStations.famousFor();
    }
}
