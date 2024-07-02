package help;

public class Fibonacci {

	public static void main(String[] args) {
		int n = 10; // number of Fibonacci numbers to print
	    long[] fib = new long[n];
	    fib[0] = 0;
	    fib[1] = 1;

	    for (int i = 2; i < n; i++) {
	      fib[i] = fib[i - 1] + fib[i - 2];
	    }

	    // print out the first 10 Fibonacci numbers
	    for (int i = 0; i < n; i++) {
	      System.out.println(fib[i]);
	    }
	}

}
