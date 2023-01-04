package FunctionalInteface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionDemo {

	
	
public static void main(String[] args) {
	
	BiFunction<Integer, Integer, Integer> bifunction =( t, u)->  t+u;
	BiFunction<Integer, Integer, Integer> substraction =( t, u)->  t-u;
	BiFunction<Integer, Integer, Integer> multiplication =( t, u)->  t+u;
	BiFunction<Integer, Integer, Integer> division  =( t, u)->  t+u;
	
	Function<Integer, Integer>function =(number)-> number* number;
	Integer integer = bifunction.andThen(function).apply(47, 10);
	System.out.println(integer);
	
	System.out.println(bifunction.apply(74, 10));
	System.out.println(substraction.apply(45, 65));
	System.out.println(multiplication.apply(52, 65));
	System.out.println(division.apply(89, 65));

	
}
	
}
