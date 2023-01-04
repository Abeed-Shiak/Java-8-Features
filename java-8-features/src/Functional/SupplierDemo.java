package Functional;

import java.time.LocalDateTime;
import java.util.function.Supplier;

class SuplierImpl implements Supplier<LocalDateTime>{

	@Override
	public LocalDateTime get() {
		return LocalDateTime.now();
	}
	
}

public class SupplierDemo {
	public static void main(String[] args) {
//		Supplier<LocalDateTime>suplier = new SuplierImpl();
//		System.out.println(suplier.get());

	   Supplier<LocalDateTime>supplier = ()-> LocalDateTime.now();
	   System.out.println( supplier.get());
		
		
	}

}
