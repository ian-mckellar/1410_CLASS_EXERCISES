package recursion;

public class DemoSum {

	public static void main(String[] args) {
		int n = -9;
		System.out.printf("sum(%d) = %d%n", n, sum(n));
	}

	private static int sum(int n) {
		if (n <= 0) {
			throw new IllegalArgumentException("n needs to be positive");
		}
		
		if (n == 1) {
			return 1;
		}
		return n + sum(n - 1);
	}
	
}
