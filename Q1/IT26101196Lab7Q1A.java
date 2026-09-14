import java.util.Scanner;

public class IT26101196Lab7Q1A {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		//Declare variables 
	    int mark1 , mark2 , mark3 , mark4;
		double avrg;
		String Grade;
		
		//User inputs 
		System.out.print("Enter 1st mark:");
		mark1 = input.nextInt();
		
		System.out.print("Enter 2st mark:");
		mark2 = input.nextInt();
		
		System.out.print("Enter 3st mark:");
		mark3 = input.nextInt();
		
		System.out.print("Enter 4st mark:");
		mark4 = input.nextInt();
	
		//Calculation and print avarage
		avrg = (mark1 + mark2 + mark3 + mark4) / 4.0;
		System.out.println();
		System.out.println("Avarage:" +avrg);
		
		//Overal grade
		if(avrg <= 100 && avrg >= 75) {
			Grade = "Distinction" ;
		}
		else if(avrg <= 74 && avrg >= 50) {
			Grade = "Credit";
		}
		else {
			Grade = "Fail";
		}
		
		//Print garde of styudents 
		System.out.println();
		System.out.println("Grade:" +Grade );
		
	}
}
			
		
		
		
			
		
		