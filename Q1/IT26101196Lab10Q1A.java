import java.util.Scanner;

public class IT26101196Lab10Q1A {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//User input 
		System.out.println();
		System.out.print("Enter marks out(0 -100):");
		int mark = input.nextInt();
		
		//First assertion (check if marks are between 0 and 100))
		assert (mark >= 0 && mark <= 100) : "Invalid Marks";
		
		System.out.println();
		System.out.println("Mark Is Validated");
	}
}
