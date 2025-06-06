package Selenium_Java.JAVA_Topics;

import java.util.Scanner;

public class Reverse_interger_While_loop {

	public static void main(String[] args) {
		
		
		System.out.println("Enter num:  ");
		Scanner scanner  = new Scanner(System.in);
		
		int num = scanner.nextInt();
		int Revnum =0;
		
		while (num!=0) {
			
			Revnum = Revnum*10 + num%10;
			num = num/10;
			
		}
System.out.println("Revnum :  "+Revnum);


scanner.close();








	}

}
