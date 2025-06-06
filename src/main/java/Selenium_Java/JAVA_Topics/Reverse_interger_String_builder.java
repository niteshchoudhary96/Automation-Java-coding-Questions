package Selenium_Java.JAVA_Topics;

import java.util.Scanner;

public class Reverse_interger_String_builder {

	public static void main(String[] args) {
		
		
		System.out.println("Enter num:  ");
		Scanner scanner  = new Scanner(System.in);
		
		int num = scanner.nextInt();
	
		
	StringBuilder sb = new StringBuilder(String.valueOf(num));
	
	
    // Reverse the string and convert back to integer
    int Revnum = Integer.parseInt(sb.reverse().toString());

		
		
System.out.println("Revnum :  "+Revnum);


scanner.close();








	}

}
