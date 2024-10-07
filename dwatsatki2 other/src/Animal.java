interface Animel {
    void makeSound();
}

class Dog implements Animel {
    @Override
    public void makeSound() {
        System.out.println("Dog says: Woof!");
    }
}

class Cat implements Animel {
    @Override
    public void makeSound() {
        System.out.println("Cat says: Meow!");
    }
}

class Cow implements Animel {
    @Override
    public void makeSound() {
        System.out.println("Cow says: Moo!");
    }
}

public class Animal {
    public static void main(String[] args) {
        Animel[] animals = new Animel[3];
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Cow();

        for (Animel i : animals) {
            i.makeSound();
        }
    }
}