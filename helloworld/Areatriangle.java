package helloworld;

import java.util.Scanner;

public class Areatriangle {
public static void main(String[] args) {
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter the length of the triangle:");
	double len=obj.nextDouble();
	System.out.println("enter the height of the triangle:");
    double height=obj.nextDouble();
    obj.close();
	double area=(len*height)/2;
	System.out.println("the area of the triangle is :"+area);
}
}
