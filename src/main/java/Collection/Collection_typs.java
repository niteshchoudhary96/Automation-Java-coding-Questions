package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Vector;

public class Collection_typs {

	//public static void main(String[] args)
	
	public void coll (){
		// TODO Auto-generated method stub
		
		
		
		
		// Type safe 
		
		ArrayList <String> list = new ArrayList<String>();
		
		list.add(0, "Khusi");
		list.add("Misti");
		list.add(1, "Choudhary");
		list.addFirst("Nitesh");
		
		System.out.println(list);
		System.out.println(list.size());
		   
		
		LinkedList names = new LinkedList();
		
		names.addAll(list);
		names.add(1234);
		names.add("nitesh");
		
		System.out.println(names);
		
		
		Vector <Double> dd = new Vector<Double>();
		
		dd.addAll(names);
		
		dd.add(12.34);
		System.out.println(dd);
		
		
		
		
		System.out.println("===============================================");
		
		HashSet<String> hs = new HashSet();
		
		
		hs.add("neha");
		hs.add("rudra");
		hs.addAll(names);
		System.out.println(hs);
		
		
		

	}

}
