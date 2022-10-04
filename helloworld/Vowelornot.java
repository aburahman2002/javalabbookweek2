package helloworld;
import java.util.Scanner;
public class Vowelornot {
public static void main(String[] args) {
	Scanner obj=new Scanner(System.in);
	System.out.println("enter a charcter:\n");
	char ch=obj.next().charAt(0);
	obj.close();
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
	System.out.println(ch+"\nit is a vowel");
	else
		System.out.println(ch+"it is a consonant");
}
}
