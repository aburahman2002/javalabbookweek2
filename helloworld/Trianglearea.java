package helloworld;

import java.util.Scanner;

public class Trianglearea {
public static void main(String[] args) {
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the length of Rectangle:");
		double length = scanner.nextDouble();
		System.out.println("Enter the width of Rectangle:");
		double width = scanner.nextDouble();
		scanner.close();
		double area = (length*width)/2;
		System.out.println("Area of Rectangle is:"+area);
		}
}
}
