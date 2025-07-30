package samplejavaprograms;

import java.util.Scanner;

public class Datatypes_q7 {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     
     System.out.println("Enter three numbers: ");
     int a=sc.nextInt();
     int b=sc.nextInt();
     int c=sc.nextInt();
     
     double average=(a+b+c)/3.0;
   
     System.out.println("Average= "+average);
 sc.close();
	}

}
