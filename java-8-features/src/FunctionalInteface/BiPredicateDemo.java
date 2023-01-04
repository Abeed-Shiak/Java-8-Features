package FunctionalInteface;

import java.util.function.BiPredicate;

public class BiPredicateDemo  {
	public static void main(String[] args) {
		
		 BiPredicate<String, String> biPredicate =( s1, s2)-> s1.equals(s2);
		 System.out.println(biPredicate.test("king", "kong"));
		 System.out.println(biPredicate.test("raja", "DOLL"));
		 
		  BiPredicate<Integer, Integer>bipredicate2  = (x, y)-> x>y;
		  BiPredicate<Integer, Integer>bipredicate3  = (x, y)-> x==y;
		 
		  boolean result =  bipredicate2.and(bipredicate3).test(20, 30);
		  System.out.println(result); 
		
		  boolean result1 =  bipredicate2.or(bipredicate3).test(20, 30);
		  System.out.println(result1);
 
 
    
	}

	
	

}
