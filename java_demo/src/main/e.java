package main;

/**
 * 测试Stirng
 * @author yaoh
 *
 */

public class e {
	
	public static void main(String[] args) {
		
		int a = 19;
		System.out.println(String.valueOf(a));
		String b = null;
		System.out.println("".equals(b));
		//------------------------------------------
		
		String name = "abc.apk";
		String apkName = name.substring(0, name.length() - 4);
		System.out.println(apkName);
		
		
	}

}
