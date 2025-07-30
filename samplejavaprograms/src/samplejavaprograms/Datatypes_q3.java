package samplejavaprograms;

public class Datatypes_q3 {

	public static void main(String[] args) {
		 int intValue = 123456789;
	        System.out.println("Original int value: " + intValue);

	        long longValue = intValue;
	        System.out.println("After widening to long: " + longValue);

	        float floatValue = longValue;
	        System.out.println("After widening to float: " + floatValue);

	        System.out.println("\nComparison:");
	        System.out.println("int == long? " + (intValue == longValue));
	        System.out.println("int == float? " + (intValue == floatValue));

	}

}