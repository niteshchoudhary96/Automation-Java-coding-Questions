package Selenium_Java.JAVA_Topics;

import java.util.Scanner;

public class palindrome_Check {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter text to check palindrome :   ");
		String name =sc.next();
		String palindrome_text ="";
		for (int i = name.length()-1; i>=0;i--) {
			palindrome_text+=name.charAt(i);
			
		}
		System.out.println(palindrome_text);
		
		if(name.equals(palindrome_text)) {
			System.out.println("Given text is palindrom");
		}
		else
		{
			System.out.println("given text is not palindrom");
		}
	}
	}
	





