//File:Ex4.java
import java.util.Random;

class Ex4{
	public static void main(String[] args){
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
