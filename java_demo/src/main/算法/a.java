package main.算法;

public class a {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();
	}
	
	public static void test1(){
		
		int[] array = new int[]{5,4,3,2,1};
		
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				int temp = 0;
				
				if(array[j] < array[i]){
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		
		for (int i : array) {
			System.out.print(i);
		}
	}

}
