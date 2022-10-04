package helloworld;

public class Swap2numbers {
	public static void main(String[] args) {
		float first=2.5f,second=3.5f;
		System.out.println("=====Before swap====");
		System.out.println("first number="+first);
		System.out.println("\nsecond number="+second);
		float temporary=first;
		first=second;
		second=temporary;
		System.out.println("=====After swapping====");
		System.out.println("first number="+first);
		System.out.println("\nsecond number="+second);
		
	}

	

}
