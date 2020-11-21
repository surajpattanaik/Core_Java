package FuctionalInterfaces.PredefinedFI.Consumer;

import java.util.function.Consumer;

public class Example {
	public static void main(String[] args) {
		Consumer<Integer> c=i->System.out.println(i*i);
		
		c.accept(4);
		
		//ConsumerChaining
		Consumer<String> c1=s->System.out.println(s+" is white");
		Consumer<String> c2=s->System.out.println(s+" has four legs");
		Consumer<String> c3=s->System.out.println(s+" eats grass");
		c1.accept("cow");
		c2.accept("cow");
		c3.accept("cow");
		System.out.println();
		//Or
		c1.andThen(c2).andThen(c3).accept("cow");
		System.out.println();
		//Or
		Consumer<String> c4=c1.andThen(c2).andThen(c3);
		c4.accept("cow");
		
	}

}
