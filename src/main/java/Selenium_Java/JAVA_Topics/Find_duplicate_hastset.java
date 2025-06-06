package Selenium_Java.JAVA_Topics;

import java.util.HashSet;

public class Find_duplicate_hastset {

	public static void main(String[] args) {
		
		String name [] = {"java","c","C#","java","ruby","selenium","core"};
		
		
		HashSet<String> st  = new HashSet<String>();
		
		for ( String names : name ) {
			
			if (st.add(names)) {
				System.out.println("single names : "+names);
				
			}
			
			
			else  {System.out.println("duplicate:   "+names);
				
			}
		}
		

	}

}
