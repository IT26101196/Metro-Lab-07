import java.util.Scanner;

public class IT26101196Lab7Q2B {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int rowCount , columnCount;
		
		//Loop through nuumbers 1 to 5
		for (rowCount = 1 ; rowCount <= 5 ; rowCount++) {
			//Print the current number
			System.out.print(rowCount + "-");
			
		//Loop for the stars
		for (columnCount = 0 ; columnCount < rowCount ; columnCount++) {
			System.out.print("* ");
		}
		//Move to next line after printing 
		System.out.println();
		}
		
	}
}
			