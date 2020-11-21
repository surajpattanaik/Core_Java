package FuctionalInterfaces.PredefinedFI.Function;

import java.util.function.Function;

public class FunctionJoin {

	
	public static void main(String[] args) {
		Function<Integer,Integer> fn1=n->n*2;
		
		Function<Integer,Integer> fn2=n->n*n*n;
		
		//FunctionChaining
		//andThen
		System.out.println(fn1.andThen(fn2).apply(2));
		//Compose
		System.out.println(fn1.compose(fn2).apply(2));
		
	}
}
