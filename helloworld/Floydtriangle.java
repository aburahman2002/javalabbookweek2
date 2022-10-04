package helloworld;

import java.util.Scanner;

public class Floydtriangle {
	public static void main(String[] args) {
		int rows,number=1,counter,j;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the number of rows of floyd triangle:");
		rows=obj.nextInt();
		System.out.println("Floyds's triangle");
		System.out.println("**********");
		for(counter=1;counter<=rows;counter++) {
			for(j=1;j<=counter;j++) {
				System.out.print(number+"");
			}
			System.out.println();
		}
	}

}
