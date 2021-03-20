
public class IncreasingNumber {

	public static void main(String[] args) {
		long num=134468;
		checkNumber(num);

	}

	private static void checkNumber(long num) {
		boolean flag = false;
		long digit = num % 10;
	    num = num/10;
	    while(num>0){
	           
	           if(digit <= num % 10){
	               flag = true;
	               break;
	           }

	           digit = num % 10;
	           num = num/10;
	       }
	        
	       
	       if(flag){
	           System.out.println("Number is not an increasing number.");
	       }else{
	           System.out.println("Number is an increasing number.");
	       }
		
	}

}
