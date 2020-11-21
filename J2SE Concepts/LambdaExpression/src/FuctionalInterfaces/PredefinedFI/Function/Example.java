package FuctionalInterfaces.PredefinedFI.Function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Example {

	public static void main(String[] args) {

		Function<String, Integer> fn = i ->i.length();
		
		System.out.println(fn.apply("Lambda Expression is Fun!!"));
		
		Function<Integer,Boolean> fn1 = i ->i%2==0;
		Function<Integer, Integer> fn2 = i ->i+1;
		
		List<Integer> list=new ArrayList<>();
		list.add(2);
		list.add(12);
		list.add(22);
		list.add(23);
		list.add(25);
		list.add(26);
		list.add(30);
		
		for(int element:list) {
			if(fn1.apply(element)) {
				System.out.println("Even no found :"+element);
				int index=list.indexOf(element);
				int newElement=fn2.apply(element);
				list.set(index,newElement);
				System.out.println("Making it odd "+newElement);
			}
		}
		System.out.println("Modified ArrayList :"+list);
		
	}
}
