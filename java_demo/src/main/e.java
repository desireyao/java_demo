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
		
		//---比较String 大小
		
		String str_a = "3.10.0"; 
		String str_b = "3.9.101";
		
        System.out.println("string2Number(str_a): " + appVersion2Int(str_a));
        
        System.out.println(VersionComparison(str_a,str_b));
	}

	
    public static int appVersion2Int(String str){  
		
		   String string = "";
		   char point = '.';
		   
		   for(int i = 0; i < str.length(); i++){  
			   
			   char _ch = str.charAt(i);
			   if(point != _ch){
				   string += _ch;
			   }
			   
			   /** 只去版本号前4位 */
			   if(string.length() >= 4){
				   break;
			   }
		   }
		   
		   int data = Integer.parseInt(string);
		   return data ;
	}   
    
    public static int VersionComparison(String versionServer, String versionLocal) {  
        String version1 = versionServer;  
        String version2 = versionLocal;  
        if (version1 == null || version1.length() == 0 || version2 == null || version2.length() == 0)  
            throw new IllegalArgumentException("Invalid parameter!");  
  
        int index1 = 0;  
        int index2 = 0;  
        while (index1 < version1.length() && index2 < version2.length()) {  
            int[] number1 = getValue(version1, index1);  
            
//            ZozoLog.i(TAG," ===== number1 ====" + Arrays.toString(number1));
            
            int[] number2 = getValue(version2, index2);  
//            ZozoLog.i(TAG," ===== number2 ====" + Arrays.toString(number2));  
  
            if (number1[0] < number2[0]){  
                
//            	ZozoLog.i(TAG," ===== number1[0] ====" + number1[0]);  
//                ZozoLog.i(TAG," ===== number2[0] ====" + number2[0]); 
                
                return -1;  
            }  
            else if (number1[0] > number2[0]){  
            	
//                ZozoLog.i(TAG," ===== number1[0] ====" + number1[0]);  
//                ZozoLog.i(TAG," ===== number2[0] ====" + number2[0]);
                
                return 1;  
            }  
            else {  
                index1 = number1[1] + 1;  
                index2 = number2[1] + 1;  
            }  
        }  
        if (index1 == version1.length() && index2 == version2.length())  
            return 0;  
        if (index1 < version1.length())  
            return 1;  
        else  
            return -1;  
    } 
    
    /** 
     *  
     * @param version 
     * @param index 
     *            the starting point 
     * @return the number between two dots, and the index of the dot 
     */  
    public static int[] getValue(String version, int index) {
 
        int[] value_index = new int[2];  
        StringBuilder sb = new StringBuilder();  
        while (index < version.length() && version.charAt(index) != '.') {  
            sb.append(version.charAt(index));  
            index++;  
        }  
        value_index[0] = Integer.parseInt(sb.toString());  
        value_index[1] = index;  
  
        return value_index;  
    }  
  
}
