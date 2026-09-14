import java.util.Scanner;

public class IT26101196Lab7Q1B {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		//Declare variables 
	    int mark1 , mark2 , mark3 , mark4;
		double avrg;
		String Grade;
		int counter = 1;
		
		while (counter <= 3) {
			
			System.out.println("Student" + counter);
			
			//User inputs
			System.out.print("Enter marks:");
		    mark1 = input.nextInt();
		    mark2 = input.nextInt();
		    mark3 = input.nextInt();
		    mark4 = input.nextInt();
			
			//Avarage calculation
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
			System.out.println();
			
			counter++;
			
		}
	}
}
		
			