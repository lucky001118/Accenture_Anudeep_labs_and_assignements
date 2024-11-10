package com.labx3.question2;

import java.util.Scanner;

// Superclass Animal
public class Animal {
    // Method to be overridden by subclasses
    void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

// Subclass Dog
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("The dog barks.");
    }
}

// Subclass Cat
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("The cat meows.");
    }
}

class AnimalSounds{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Creating objects for Dog and Cat
        Animal animal;
        System.out.println("With user choose: ");
        System.out.print("Choose an animal (dog/cat): ");
        String choice = scanner.nextLine().toLowerCase();

        // User input determines which animal to create
        switch (choice) {
            case "dog":
                animal = new Dog();  // Create Dog object
                break;
            case "cat":
                animal = new Cat();  // Create Cat object
                break;
            default:
                animal = new Animal();  // Default to Animal object
                System.out.println("Unknown animal, using generic Animal.");
        }

        // Call the overridden makeSound() method
        animal.makeSound();

        scanner.close();

        //without user choose default calling both dog and cat
        System.out.println();
        System.out.println("without user choose default calling both dog and cat");
        animal = new Dog();
        animal.makeSound();
        animal= new Cat();
        animal.makeSound();
    }
}