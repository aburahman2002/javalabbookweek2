package helloworld;
import java.util.Scanner;
public class Oddoreven {
public static void main(String[] args) {
	Scanner obj=new Scanner(System.in);
	System.out.println("enter a number:");
	int i=obj.nextInt();
	obj.close();
	if (i%2==0)
		System.out.println("the number is even");
		else
			System.out.println("the number is odd");
}
}
