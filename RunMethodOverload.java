package test.overload;

public class RunMethodOverload {

	public static void main(String[] args) {
		MethodOverloadTest ot = new MethodOverloadTest();
		int n1 = 5, n2 = 7;
		System.out.printf("%d + %d = %d\n", n1, n2, ot.calc(n1, n2));
		
		double n3 = 12.5, n4 = 21.3;
		System.out.printf("%.1f * %.1f = %.3f\n", n3, n4, ot.calc(n3, n4));
	}

}
