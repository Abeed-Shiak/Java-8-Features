package Lambda.exp;

class ThredDemo implements Runnable{

	@Override
	public void run() {
        System.out.println("run method called");		
	}
	
}

public class RunnableLambdaExample {
	
	public static void main(String[] args) {
		
      Thread thread  = new Thread(new ThredDemo());
      thread.start();
      
      Thread threadlambda = new Thread(()->System.out.println("run method called using lambda"));
	   threadlambda.start();
				
}
}