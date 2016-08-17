package main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class a {

	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
	    List<Integer> linkList = new LinkedList<Integer>();
	    
	   
//	    long startTime = System.currentTimeMillis();
        for (int i = 0; i < 5000000; i++) {
        	list.add(i);
		 }	 
	    long startTime = System.currentTimeMillis();
//	    list.get(499999);
	    list.remove(49999);
	    
        System.out.println("arraylist 所需时间: " + (System.currentTimeMillis() - startTime));
	    
//        startTime = System.currentTimeMillis();
	    for (int i = 0; i < 5000000; i++) {
	    	linkList.add(i);
		}
	    
	    startTime = System.currentTimeMillis();
//	    linkList.get(499999);
	    linkList.remove(49999);
        System.out.println("linkedlist 所需时间: " + (System.currentTimeMillis() - startTime));
	}

}
