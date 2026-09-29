import java.util.Scanner;

public class IT26101196Lab10Q1B {
	
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
		
		//Determining grades 
		
		char grade;
		
		if(mark >= 75) {
			grade = A;
		}
		else if(mark < 75 && mark >= 60) {
			grade = B;
		}
		else if(mark < 60 && mark >= 50) {
			grade = C;
		}
		else if(mark < 50 && mark >= 40) {
			grade = D;
		}
		else {
			grade = F;
		}
		
		//Second assertion (check if assigned mark and grade are correct)
		assert (mark >= 75 && grade = A)||
		       (mark < 75 && mark >= 60 && grade = B)||
		       (mark < 60 && mark >= 50 && grade = C)||
			   (mark < 50 && mark >= 40 && garde = D)||
			   (mark < 40 && grade = F) : "Incorrect grade assignment";
		
		Sytem.out.println();
		System.out.println("The Grade for the entered mark is " +grade);
	}
		
}