interface mainAnimal {

    void makeSound();

}

interface Pet extends mainAnimal {
    void play();
}

class Dog implements Pet {
    public void makeSound() {
        System.out.println("Bow Bow....... :)");
    }

    public void play() {
        System.out.println("It plays with ball");
    }
}

public class Animal {
    public static void main(String[] args) {

        Dog obj = new Dog();
        obj.makeSound();
        obj.play();

    }
}
