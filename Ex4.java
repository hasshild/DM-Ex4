//File:Ex4.java
import java.util.Random;
import java.util.Scanner;

class Ex4{
	public static void main(String[] args){
		//名前を聞くパート
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = scan.next();
		System.out.println("Hello, " +name +"!");
		
		//サイコロパート
		Random rand = new Random();
		int x1 = rand.nextInt(5) + 1;
		int x2 = rand.nextInt(5) + 1;
		int total = x1 + x2;

		System.out.println("Roling the dice...");
		System.out.println("Die 1: " +x1);
		System.out.println("Die 2: " +x2);
		System.out.println("Total value: " +total);
	}
}
