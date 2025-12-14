class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Overriding the parent method
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class OverridingDemo {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound();  // parent version

        Dog d = new Dog();
        d.sound();  // overridden version
    }
}