package FunctionalInteface;

import java.util.function.BiConsumer;

public class BiConsumerDemo  {
	public static void main(String[] args) {
		BiConsumer<Integer, Integer>biConsumer =( a, b)->System.out.println(a+b);
		BiConsumer<Integer, Integer>multiplication =( a, b)->System.out.println(a-b);
		BiConsumer<Integer, Integer>substraction =( a, b)->System.out.println(a*b);
		BiConsumer<Integer, Integer>division =( a, b)->System.out.println(a/b);
		
         biConsumer.accept(74, 16);
         multiplication.accept(74, 26);
         substraction.accept(64, 16);
         division.accept(44, 19);	

	}

}
