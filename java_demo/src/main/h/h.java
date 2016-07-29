package main.h;

public class h {

	
	
	public static void main(String[] args) {

		ServerThreadPool.getInstance().add(new Runnable() {
			
			public void run() {
				// TODO Auto-generated method stub
                System.out.println(Thread.currentThread().getName());				
			}
		});
	}

}
