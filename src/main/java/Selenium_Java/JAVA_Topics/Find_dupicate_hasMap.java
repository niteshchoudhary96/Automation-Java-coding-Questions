package Selenium_Java.JAVA_Topics;

import java.util.HashMap;
import java.util.Map;

public class Find_dupicate_hasMap {

	public static void main(String[] args) {
		
		
		String name [] = {"java","c","C#","java","ruby","selenium","core"};
		
		
		
		Map<String, Integer> st  = new HashMap<String, Integer>() ;
		
		for(String names : name)
		{ Integer  values =   st.get(names);
		
		if(values==null) {
			
			st.put(names, 1);
		}else {
			
			st.put(names,++values);
		}

	}
		 System.out.println("Duplicate strings:");
	        for (Map.Entry<String, Integer> entry : st.entrySet()) {
	            if (entry.getValue() > 1) {
	                System.out.println(entry.getKey() + " → " + entry.getValue() + " times");
	            }
	        }


}
}
