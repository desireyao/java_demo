package main.e;

public class e2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String string = "You areah$$ gre%at!";
		char defaultChar = ' ';
		String newString = null;
		int size = string.length();
		
		int count = 0;
		for (int i = 0; i < string.length(); i++) {
			if(string.charAt(i) == '$'){
				count ++;
			}
		}
		
		for(int j = 0; j < count; j++){
		 
		  for (int i = 1; i < size; i++) {
			  
             if(string.charAt(i) == '%'){
            	 
            	 newString = string.substring(i + 1 ,size);
            	 size = newString.length();
            	 
             }else if(string.charAt(i) == '$'){
				newString = string.substring(0,i - 1) + string.substring(i + 1 ,size);
				string = newString;
				size = newString.length();
			 }
 		  }
		}
		
		System.out.println("newString: " + newString);
	}

}
