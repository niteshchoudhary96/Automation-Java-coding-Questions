package Selenium_Java.JAVA_Topics;

import java.util.Scanner;

public class Reverse_String_Inbuild_method {

	public static void main(String[] args) {
		System.out.println("Enter Text :  ");
		
		Scanner scanner = new Scanner(System.in);    // External inputs
				
		String InputText =scanner.nextLine();            // String value
		
		
		StringBuffer SB = new StringBuffer(InputText);	    
	   System.out.println("Reverse text:  "+ SB.reverse());
		
		    
	    StringBuilder SB1 = new StringBuilder(InputText);   
		 System.out.println("Reverse text1:  "+ SB1.reverse());
		 
		 scanner.close();  

	}
	
	
	
	
}
