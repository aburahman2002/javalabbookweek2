package helloworld;

import java.util.Scanner;

public class Whiledemo {
	public static void main(String[] args) {
		int number,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter any digit below value 10:");
		number=sc.nextInt();
		sc.close();
		while(number<10) {
			sum=sum+number;
			number++;
		}
		System.out.format("sum of the numbers in while loop is :%d",sum);
	}

}
