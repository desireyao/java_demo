package main;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		for (int i = 0; i < 10; i++) {
			list.add("data"+i);
		}
        list.add(5, "hehe");
        System.out.println(list);
		
	}

}
