class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Make Some animal sound");
    }
}

class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " is barking..");
    }
}

class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " is meowing..");
    }
}

class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " is chirping..");
    }
}

public class AnimalHeirarchy {
    public static void main(String[] args) {
        Animal dog = new Dog("mark", 3);
        Animal cat = new Cat("bisky", 2);
        Animal bird = new Bird("chirpy", 1);
        dog.makeSound();
        cat.makeSound();;
        bird.makeSound();
    }

}
