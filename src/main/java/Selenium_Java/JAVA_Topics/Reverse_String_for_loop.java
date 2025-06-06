package Selenium_Java.JAVA_Topics;

import java.util.Scanner;

public class Reverse_String_for_loop {

	public static void main(String[] args) {
		System.out.println("Enter Text :  ");
		
		Scanner scanner = new Scanner(System.in);    // External inputs
				
		String InputText =scanner.next();            // String value
				
	    String ReverseText ="";                      
	
for(int i=InputText.length()-1;i>=0;i--) {
	
	ReverseText += InputText.charAt(i);
	System.out.println(ReverseText);
	
}

System.out.println("OutPut : "+ReverseText);

		scanner.close();

	}
	
	
	
	
}
