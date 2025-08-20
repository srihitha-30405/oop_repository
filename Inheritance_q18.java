package single_inheritance;

class Vehicle{
	void move() {
		System.out.println("The vehicle is moving");
	}
}
class Car extends Vehicle{
	void fueltype() {
		System.out.println("It runs on petrol or diesel");
	}
}


public class Inheritance_q18 {

	public static void main(String[] args) {
		Car mycar=new Car();
		mycar.move();
		mycar.fueltype();
	}

}
