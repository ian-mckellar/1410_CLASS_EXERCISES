package recursion;

public class DemoEucledianAlgorithm {

	public static void main(String[] args) {

		int n1 = 12;
		int n2 = 9;
		
		System.out.printf("gcd(%d, %d) = %d%n", n1, n2, gcd(n1, n2));
		
		
	}

	private static int gcd(int n1, int n2) {
		// TODO Auto-generated method stub
		if (n2 == 0) {
			return n1;
		}
		return gcd(n2, n1 % n2);
		
	}

}
