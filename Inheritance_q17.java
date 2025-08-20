package single_inheritance;
// Parent class
class Animal {
    void eat() {
        System.out.println("This animal is eating.");
    }

    void sleep() {
        System.out.println("This animal is sleeping.");
    }
}

// Child class (Single Inheritance)
class Lion extends Animal {
    void roar() {
        System.out.println("The lion is roaring!");
    }
}

// Main class
public class Inheritance_q17 {
    public static void main(String[] args) {
        // Create a Lion object
        Lion mylion = new Lion();

        // Common behaviors (inherited from Animal)
        mylion.eat();
        mylion.sleep();

        // Species-specific behavior
        mylion.roar();
    }
}
