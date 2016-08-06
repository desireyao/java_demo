package main.e;

import java.util.InputMismatchException;
import java.util.Scanner;

public class e1 {

	public static Scanner scanner;
	public boolean isTypeRight = true;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		TEST1();
		scanner = new Scanner(System.in);
		
		for (int i = 0; i < 100; i++) {
			
			if(TEST2() == 0){
				continue;
			}
		}

	}
	
	public static void TEST1(){
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入： ");
		int year = scanner.nextInt();
		System.out.println("year： " + year);
		
		Object obj = scanner.hasNextLine();
		System.out.println("obj: " + obj);
	}
	
	public static int TEST2(){
		
		int abs = 0;
		System.out.println("请输入：");
		
		try {
			abs = scanner.nextInt();
			return abs;
		} catch (Exception e) {
			return 0;
		}
	}

}
