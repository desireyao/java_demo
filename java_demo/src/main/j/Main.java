package main.j;

public class Main {

//	static String[] s = "abc";
	static char c = 'a';
	
	static String[] s = new String[]{"a","b","c"};
	static char[] ch = new char[]{'a','b','c'};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		change0(c);
//		System.out.println("c: " + c);
		
		
//		String s = "abs";
//		change1(s);
//		System.out.println("s: " + s);
		
//		TestChar tc = new TestChar();
//		System.out.println(tc.getS() + "");
		
//		change2(s);
//		System.out.println("s: " + s[0]);
		
//		change3(ch);
//		System.out.println("s: " + ch[0]);
		
		
//		TestString testString = new TestString();
//		change4(testString);
//		System.out.println("testString: " + testString.getString());
		
//		TestString testString = new TestString();
//		change5(testString.getString());
//		System.out.println("testString: " + testString.getString());
		
	}
	
	private static void change0(char ch){
		
		ch = 'c';
	}
	
	private static void change1(String s){
		s = "ok";
	}
	
	private static void change2(String[] s){
		
		s[0] = "ok";
	}
	
    private static void change3(char[] s){
		
		s[0] = 'o';
	}
    
    private static void change4(TestString TS){
		
//  		s[0] = 'o';
    	    TS.setString("OK");
  	}
    
    
    private static void change5(String string){
    	string = "ok";
  	}
}
