package javaControlStatements;

public class LoopControlClass {

	public static void main(String[] args) {
		int x = 5;

		//Example of while loop
		while(x < 8) {
			System.out.print("Value of x: " + x);
			x++;
			System.out.println("\n");
		}


		//Example of do while loop
		int z = 8;
		//int z = 11; //execute the statement at least once even if the condition is not true
		do {
			System.out.print("Value of z: " + z);
			System.out.println("\n");
			z++;
		} while(z <= 10);


		//Example of for loop
		for(int y =10; y < 13; y=y+1) {
			System.out.print("Value of y: " + y);
			System.out.println("\n");
		}


		//Example 1 of break statement
		for(int i = 5; i > 0; i=i-1) {
			if(i == 3) {
				break;
			}
			System.out.print("Value of i: " + i);
			System.out.println("\n");
		}


		//Example 2 of break statement with enhanced for loop
		int [] number = {10, 20, 30, 40, 50};
		for(int a : number) {
			if(a == 30) {
				break;
			}
			System.out.print("Value of a: " + a);
			System.out.println("\n");


			//Example 1 of continue statement
			for(int b = 5; b > 0; b=b-1) {
				if(b == 3) {
					continue;
				}
				System.out.print("Value of b: " + b);
				System.out.println("\n");
			}
		}


		//Example 2 of continue statement with enhanced for loop
		int [] numbers = {10, 20, 30, 40, 50};
		for(int c : numbers) {
			if(c == 30) {
				continue;
			}
			System.out.print("Value of c: " + c);
			System.out.println("\n");

		}


		//Example of enhanced for loop
		String [] names = {"james", "Mike", "Arther", "Andrey", "Ann"};
		for (String d : names){
			System.out.print(d);
			System.out.print(", ");
		}
	}

}
