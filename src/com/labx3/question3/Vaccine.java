package com.labx3.question3;

import java.util.Scanner;

// Abstract class Vaccine
public abstract class Vaccine {
    int age;
    String nationality;
    public Vaccine(){
    }
    public Vaccine(int age, String nationality) {
        this.age = age;
        this.nationality = nationality;
    }

    // Concrete method for first dose

    /*
    implementing the scenario:1
    Scenario 1:user can take the first dose if the user is Indian and age is 18.
    After vaccination the user has to pay 250rs(which will be displayed on the console).
     */
    public void firstDose() {
        if (age >= 18 && this.nationality.equalsIgnoreCase("Indian")) {
            System.out.println("First dose successfully administered.");
            System.out.println("Please pay 250 Rs for the vaccination.");
        } else {
            System.out.println("You are not eligible for the first dose. Must be Indian and 18 or older.");
        }
    }

    // Concrete method for second dose
    /*
    implementing scenario:2
    Scenario 2: Users are eligible to take the second dose only after completing the first dose.
     */
    public void secondDose(boolean firstDoseCompleted) {
        if (firstDoseCompleted) {
            System.out.println("Second dose successfully administered.");
        } else {
            System.out.println("You are not eligible for the second dose. You must complete the first dose first.");
        }
    }

    // Abstract method for booster dose
    /*
    scenario:3
    --> 3.1: create abstract method boosterDose() in abstract class Vaccine.
     */
    public abstract void boosterDose(boolean secondDoseCompleted);
}

// Concrete implementation class for vaccination
class VaccinationSuccessful extends Vaccine {

    // Constructor to initialize age and nationality

    public VaccinationSuccessful(){

    }
    public VaccinationSuccessful(int age, String nationality) {
        super(age, nationality);
    }

    // Implementation of abstract method boosterDose
    /*
    scenario:3
    --> 3..: .Create one implementation class vaccinationSuccessful, where implement boosterDose() method.
     */
    @Override
    public void boosterDose(boolean secondDoseCompleted) {
        if (secondDoseCompleted) {
            System.out.println("Booster dose successfully administered.");
        } else {
            System.out.println("You are not eligible for the booster dose. You must complete the second dose first.");
        }
    }
}

// Main class to invoke methods
 class Vaccination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age and nationality respectivily: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character after nextInt()
        String nationality = scanner.nextLine();
        // Create a user who is eligible
        VaccinationSuccessful user1 = new VaccinationSuccessful(age, nationality);

        // Scenario 1: First dose
        System.out.println("Scenario 1: First Dose");
        user1.firstDose();
        boolean firstDoseCompleted = true;

        // Scenario 2: Second dose
        System.out.println("\nScenario 2: Second Dose");
        user1.secondDose(firstDoseCompleted);
        boolean secondDoseCompleted = true;

        // Scenario 3: Booster dose
        System.out.println("\nScenario 3: Booster Dose");
        user1.boosterDose(secondDoseCompleted);
    }
}
