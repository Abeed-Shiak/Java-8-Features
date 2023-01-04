package Lambda.exp;


interface Shape{
	void Draw();
}
class Rectangle implements Shape{

	@Override
	public void Draw() {
         System.out.println("Recatnle class : Draw method");
	}
	
}
class Squre implements Shape{

	@Override
	public void Draw() {
          System.out.println("Squre class : Draw method");		
	}
	
}
class Circle implements Shape{

	@Override
	public void Draw() {
         System.out.println("Circle class : Draw method");		
	}
	
}

public class LambdaExample {
	public static void main(String[] args) {
		 String s1 = "Hellow";
		 
//		 Shape rectanle = ()-> System.out.println("Recatnle class : Draw method");
////		 rectanle.Draw();
//		
//		 Shape  squre =()-> System.out.println("Squre class : Draw method");
////		 squre.Draw();
//		 
//		 Shape Circle = ()-> System.out.println("Circle class : Draw method");
////		 Circle.Draw();
//			
		 
		 Print(()->System.out.println("Recatnle class : Draw method"));
		 Print(()->System.out.println("Squre class : Draw method"));
		 Print(()-> System.out.println("Circle class : Draw method"));
	}

	private static void Print(Shape shpe) {
		shpe.Draw();
		
		
	}

}
