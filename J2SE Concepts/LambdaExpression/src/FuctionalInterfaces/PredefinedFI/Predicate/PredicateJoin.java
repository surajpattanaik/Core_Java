package FuctionalInterfaces.PredefinedFI.Predicate;

import java.util.function.Predicate;

public class PredicateJoin {

	public static void main(String[] args) {
		Predicate<Integer> pr1 = s -> s % 2 == 0;
		Predicate<Integer> pr2 = s -> s > 20;

		int[] e = { 2, 40, 50, 13, 12, 17, 8, 90, 40, 20 };
		// and join
		for (int e1 : e) {
			if (pr1.and(pr2).test(e1)) {
				System.out.print(e1 + " "); // no which are even and greater than 20
			}
		}
		System.out.println();

		// or join
		for (int e1 : e) {
			if (pr1.or(pr2).test(e1)) {
				System.out.print(e1 + " "); // no which are even or greater than 20
			}
		}

		System.out.println();

		// negate join
		for (int e1 : e) {
			if (pr1.negate().test(e1)) {
				System.out.print(e1 + " "); // prints onlyy odd nos
			}
		}
		System.out.println();
		// negate join
		for (int e1 : e) {
			if (pr2.negate().test(e1)) {
				System.out.print(e1 + " "); // prints nos less than/equal To 20
			}
		}

	}
}
