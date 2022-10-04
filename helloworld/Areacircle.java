package helloworld;

import java.util.Scanner;

public class Areacircle {
	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter the RAdius of the Circe:");
		double radius=reader.nextDouble();
		reader.close();
		double area=Math.PI*(radius*radius);
		System.out.println("The Area of the circle is :"+area);
	}

}
