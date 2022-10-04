package helloworld;
import java.util.Scanner;
public class Printnumber {
public static void main(String args[]) {
	Scanner reader = new Scanner(System.in);
	System.out.println("Enter a number");
	int number = reader.nextInt();
	reader.close();
	System.out.println(+number);
}
}
