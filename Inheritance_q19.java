package multilevel_inheritance;
class Animal{
	void eat() {
		System.out.println("Animal is eating");
	}
}
class Dog extends Animal{
	void bark() {
		System.out.println("The dog is barking");
	}
}

class Puppy extends Dog{
	void weep() {
		System.out.println("The puppy is weeping");
	}
}

public class Inheritance_q19 {

	public static void main(String[] args) {
		Puppy mypuppy=new Puppy();
		mypuppy.eat();
		mypuppy.bark();
		mypuppy.weep();
				

	}

}
