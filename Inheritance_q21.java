package multilevel_inheritance;
class Appliance {
    void turnOn() {
        System.out.println("Appliance is now ON");
    }

    void turnOff() {
        System.out.println("Appliance is now OFF");
    }
}

// Derived class
class Fan extends Appliance {
    void rotate() {
        System.out.println("Fan is rotating");
    }
}

// Further derived class
class CeilingFan extends Fan {
    void setSpeed(int level) {
        System.out.println("Ceiling fan speed set to: " + level);
    }
}

// Main class to test
public class Inheritance_q21 {
    public static void main(String[] args) {
        CeilingFan cf = new CeilingFan();

        // Inherited from Appliance
        cf.turnOn();

        // Inherited from Fan
        cf.rotate();

        // Specific to CeilingFan
        cf.setSpeed(3);

        cf.turnOff();
    }
}
