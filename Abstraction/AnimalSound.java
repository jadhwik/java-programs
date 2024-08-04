package Abstraction;

import java.util.*;

abstract class Animal {
    abstract void makeSound();

    void sleep() {
        System.out.println("sleeps at 10 pm");
    }
}

class Dog extends Animal {
    double time;

    public Dog(double time) {
        this.time = time;
    }

    public void makeSound() {
        System.out.println("Bow Bow..... :)");
    }

    public void sleep() {
        System.out.println("Dog sleeps at " + time + " PM");

    }
}

class Cat extends Animal {
    double time;

    public Cat(double time) {
        this.time = time;
    }

    public void makeSound() {
        System.out.println("Cat meows.......");
    }

    public void sleep() {
        System.out.println("Cat sleeps at " + time + " PM");
    }
}

class Birds extends Animal {
    double time;

    public Birds(double time) {
        this.time = time;
    }

    public void makeSound() {
        System.out.println("Chip Chip.......");
    }

    public void sleep() {
        System.out.println("Birds sleeps at " + time + " PM");
    }
}

public class AnimalSound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Select the animal type: 1.Bird  2. Dog  3.Cat  4.exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("enter the time of your pet bird's sleep");
                    double time = sc.nextDouble();
                    Birds bird = new Birds(time);
                    bird.makeSound();
                    bird.sleep();

                    break;
                case 2:
                    System.out.println("enter the time of your pet Dog's sleep");
                    double time1 = sc.nextDouble();
                    Dog dogs = new Dog(time1);
                    dogs.makeSound();
                    dogs.sleep();

                    break;

                case 3:
                    System.out.println("enter the time of your pet Dog's sleep");
                    double time2 = sc.nextDouble();
                    Cat cats = new Cat(time2);
                    cats.makeSound();
                    cats.sleep();
                    break;

                case 4:
                    System.out.println("Exiting the choices :)........");
                    sc.close();
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }

    }

}
