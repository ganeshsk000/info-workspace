package com.project.mapdemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class App {
	public static void main(String[] args) {
		Map<Code, String> lecture=new HashMap<Code, String>();
		lecture.put(new Code("S01", "L03"), "Datatypes");
		lecture.put(new Code("S03", "L05"), "Variables");
		lecture.put(new Code("S05", "L02"), "String");
		lecture.put(new Code("S07", "L06"), "Exceptions");
	    lecture.put(new Code("S10", "Lo1"), "Arrays");
	    lecture.put(new Code("S09", "L07"), "Collections");
	    lecture.put(new Code("S02", "L04"), "Blocks");
	    lecture.put(new Code("S11", "L10"), "Type casting");
	    lecture.put(new Code("S11", "L10"), "Wrapper Class");
	    lecture.put(new Code("S01", "L03"), "gdgffd");
//	    lecture.put(new Code(null,null), null);
	    
	    
	    
//	    System.out.println(lecture);
//	    System.out.println("iterating over for each loop,,,,,,,,,,,");
//	    for(Map.Entry<Code, String> entry:lecture.entrySet()) {
//	    	System.out.println("Keys: "+entry.getKey()+" values: "+entry.getValue());
//	    }
	    
	    System.out.println("iterating over an iterator interface,,,,,,,,,,,,,,,");
	    Iterator<Entry<Code, String>> itr=lecture.entrySet().iterator();
	    while(itr.hasNext()) {
	    	System.out.println(itr.next());
	    }
	}

}
