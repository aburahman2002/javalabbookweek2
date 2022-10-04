package helloworld;

import java.util.Scanner;

public class Reversenumber {
	public static void main(String[] args) {
		int num=0,reversenum=0;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter your number and then press enter:");
		num=obj.nextInt();
		while(num!=0) {
			reversenum=reversenum*10;
			reversenum=reversenum+num%10;
			num=num/10;
		}
		System.out.println("Reverse of the number is\t"+reversenum);
		
	}

}
