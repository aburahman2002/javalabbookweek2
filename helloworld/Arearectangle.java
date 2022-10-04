package helloworld;

import java.util.Scanner;

public class Arearectangle {
	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter the lenghth of the Reactangle:");
		double length=reader.nextDouble();
		System.out.println("Enter the breadth of the rectangle:");
		double breadth=reader.nextDouble();
		reader.close();
		double area=length*breadth;
		System.out.println("The Area of the Reactangle is :"+area);
	}

}
