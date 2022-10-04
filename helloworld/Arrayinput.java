package helloworld;

import java.util.Scanner;

public class Arrayinput {
public static void main(String[] args) {
	Scanner reader=new Scanner(System.in);
	int[] array=new int[10];
	int sum=0;
	System.out.println("Enter the elements:");
	for(int i=0;i<10;i++) {
		array[i]=reader.nextInt();
	}
	for(int num:array) {
		sum=sum+num;
	}
	System.out.println("sum of array elements is :"+sum);
}
}
