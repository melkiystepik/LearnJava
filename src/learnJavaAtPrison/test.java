package learnJavaAtPrison;

import java.util.function.Supplier;

public class test {
	public static void main (String [] args) {
	Supplier <Double> randomNumberSupplier = Math::random;
	System.out.println(randomNumberSupplier.get());
	
	Supplier <String> greetingsSupplier = () -> {
		String [] greetings = {"Hello", "Bonjour", "Hola", "Namaste"};
		int randomIndex = ((int) (Math.random()*10) % greetings.length);
		return greetings [randomIndex];
	};
	System.out.println(greetingsSupplier.get());
	}

}
