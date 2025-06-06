package Selenium_Java.JAVA_Topics;

public class Find_duplicate_in_Array_for_loop {

	public static void main(String[] args) {
		String name [] = {"java","c","C#","java","ruby","selenium","core"};
		
		
		
		for (int j = 0;j<name.length;j++) {
			
//			System.out.println(names);
			
			for(int i =j+1;i<name.length;i++) {
				//System.out.println(namess);
				
				
				if (name[j].equals(name[i])) {
					
					System.out.println("duplicate:    "+name[j]);
				}
			}
		}

	}

}
