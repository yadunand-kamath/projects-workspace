package PredicateInterface;

import java.util.function.Predicate;

public class PredicateJoining {

	public static void main(String[] args) {
		
		int[] x = {0, 5, 10, 15, 20, 25, 30};
		Predicate<Integer> p1 = i -> i>10;
		Predicate<Integer> p2 = i-> i%2==0;
		System.out.println("Numbers greater than 10: ");
		m1(p1,x);
		System.out.println("Even numbers: ");
		m1(p2,x);
		System.out.println("Numbers not greater than 10: ");
		m1(p1.negate(),x);
		System.out.println("Numbers greater than 10 and even: ");
		m1(p1.and(p2),x);
		System.out.println("Numbers greater than 10 or even: ");
		m1(p1.or(p2),x);

	}
	
	public static void m1(Predicate<Integer> p, int[] x) {
		
		for(int j:x) {
			if(p.test(j)) {
				System.out.println(j);
			}
		}
	}

}
