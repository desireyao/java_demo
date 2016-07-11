package main;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("index++");
		
		List<String> list2 = new ArrayList<String>();
		for (int i = 0; i < 10; i++) {
			list2.add("data"+i);
		}
		list = list2;
		
		List<String> list3 = new ArrayList<String>();
		for (int i = 10; i < 20; i++) {
			list3.add("data"+i);
		}
		list = list3;
        System.out.println(list);
	}
}
