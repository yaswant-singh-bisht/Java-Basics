package javaBasicsControlStatements;

public class ConditionalStatementsClass {

	public static void main(String[] args) {
		int x = 10;

		//Example of if... statement
		if (x < 20)
		{
			System.out.println("Examle of if statement");
		}

		
		
		//Example of if..., else... statement
		if (x < 5)
		{
			System.out.println("Printed when if statement is true");
		}else{
			System.out.println("Printed when if statement is not true");

		}

		
		
		//Example of if..., else if..., else statement
		if (x < 5)
		{
			System.out.println("Printed when if statement is true");
		} else if (x < 8) {
			System.out.println("Printed when else if statement is true");
		} else {
			System.out.println("Printed when if and else if statements are not true");
		}

		
		
		//Example of nested if statement
		if (x < 11)
		{
			System.out.println("Printed when if statement is true");
			if (x == 10)
			{
				System.out.println("Printed when nested if statement is true");	
			}
		}


		
		//Example of case statement
		//char grade = 'D';
		char grade = 'B';

		switch (grade) {
		case 'A':
			System.out.println("Excellent");
			break;
		case 'B':
			System.out.println("Well done");
			//break; //if no break statement then the control moves to next case
		case 'C':
			System.out.println("Poor");
			break;
		default:
			System.out.println("Invalid grade");
		}



	}
}
