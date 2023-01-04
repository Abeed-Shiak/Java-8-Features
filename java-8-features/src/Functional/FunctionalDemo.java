package Functional;

import java.util.function.Function;

class FunctionalImpl implements Function<String, Integer>{

	@Override
	public Integer apply(String s) {
		// TODO Auto-generated method stub
		return s.length();
	}

	
}
public class FunctionalDemo  {
	public static void main(String[] args) {
//		Function<String, Integer>function = new FunctionalImpl();
//		System.out.println(function.apply("king"));
//		
		
		Function<String, Integer>functional=(String s)-> s.length();
		System.out.println(functional.apply("always keep smiiling bee hapap Happy neW year"));	
		
		
	}

}
