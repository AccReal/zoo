import java.util.*;

interface Animal {
    void makeSound();
    void eat();
}

abstract class AbstractAnimal implements Animal {
    protected String name;

    public AbstractAnimal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }
}

class Lion extends AbstractAnimal {
    public Lion(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " roars.");
    }
}

class Parrot extends AbstractAnimal {
    public Parrot(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Squawk!");
    }
}

class Snake extends AbstractAnimal {
    public Snake(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " hisses.");
    }
}

public class Main {
    public static void main(String[] args) {
        Lion lion = new Lion("Leo");
        Parrot parrot = new Parrot("Polly");
        Snake snake = new Snake("Slytherin");

        lion.makeSound();
        lion.eat();

        parrot.makeSound();
        parrot.eat();

        snake.makeSound();
        snake.eat();
    }
}
