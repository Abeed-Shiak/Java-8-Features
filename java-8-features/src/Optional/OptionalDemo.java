package Optional;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
	   //of,empty,offNullable
		
		String email="abeedshaik997@gmail.com";
		String email1=null;
		
		Optional<Object>emptyoptional = Optional.empty();
		System.out.println(emptyoptional);
		
		Optional<String>optionaloff = Optional.of(email);
		System.out.println(optionaloff);
		
		Optional<String>optionalnullable = Optional.ofNullable(email1);
//		System.out.println(optionalnullable.get());
		String defaultOptional=optionalnullable.orElse("default@gmail.com");
		System.out.println(defaultOptional);
		
		
		
		String defaultoptional2=optionalnullable.orElseGet(()-> "default1@gmail.com");
		System.out.println(defaultoptional2);
		
		
		String optionalObject = optionalnullable.orElseThrow(()-> new IllegalArgumentException("emial is not exits"));
		System.out.println(optionalObject);
		
		 
		Optional<String>gender =Optional.of("Male");
		Optional<String>emptyOptional =Optional.empty();
		
		gender.ifPresent((s)->System.out.println("value is present"));
		emptyOptional.ifPresent((s)->System.out.println("no value present"));
		
		
		String result ="ABC";
		if(result !=null &&result.contains("abc")) {
			System.out.println(result);
		}
		Optional<String>optionalstr =Optional.of(result);
		optionalstr.filter(res->res.contains("abc"))
		.map(String::trim)
		.ifPresent((res)->System.out.println(res));
			
		
		if(optionalnullable.isPresent()) {
			System.out.println(optionalnullable.get());
		}
		else {
			System.out.println("no value present");
		}
		
		

	}

}
