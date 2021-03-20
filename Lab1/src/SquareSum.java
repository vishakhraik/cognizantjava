
public class SquareSum {

	public static void main(String[] args) {
		int n = 3;
		System.out.println("Difference = "+squareDiff(n));

	}

	private static int squareDiff(int n) {
		int sumsquare, sum, diff; 
	    sumsquare = (n * (n + 1) * (2 * n + 1)) / 6; 
	    sum = (n * (n + 1)) / 2; 
	    sum = sum * sum; 
	    diff = Math.abs(sumsquare - sum); 
	      
	    return diff; 
		
	}

}
