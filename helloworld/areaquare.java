package helloworld;

import java.util.Scanner;

public class areaquare {
public static void main(String[] args) {
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter the area of the triangle:");
	double side=obj.nextDouble();
	obj.close();
	double area=side*side;
	System.out.println("The area of the square is "+area);
}
}
