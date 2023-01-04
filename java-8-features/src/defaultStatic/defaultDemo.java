package defaultStatic;

interface Vechical{
	String getBrand();
	String SpeedUp();
	String SlowDown();
	
	
	default String turnAlaramOn() {
		return "turning vechical alaram on";
	}
	
	default String turnAlaramOff() {
		return "turning vechical alaram off";
	}
	static String  getCompany() {
		return "BMW";
	}
}
class Car implements Vechical{

	@Override
	public String getBrand() {
		// TODO Auto-generated method stub
		return "BMW";
	}

	@Override
	public String SpeedUp() {
		// TODO Auto-generated method stub
		return "THE car is speeding up";
	}

	@Override
	public String SlowDown() {
		// TODO Auto-generated method stub
		return "the car is speeding Down";
	}
	
}





public class defaultDemo {

	public static void main(String[] args) {
		Car vechical =new Car();
		System.out.println(vechical.getBrand());
		vechical.SpeedUp();
		vechical.SlowDown();
		
		vechical.turnAlaramOn();
		vechical.turnAlaramOff();

	}

}
