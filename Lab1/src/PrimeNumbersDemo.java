import java.util.Scanner;

/**
 * Description :Demo of printing prime numbers
 * @author vishakhraik
 * Date:14/03/2021
 */
public class PrimeNumbersDemo {

	public static void main(String[] args) {
		String primeNumber=" ";
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the integer : ");
		int number=sc.nextInt();
		int i=0,num=0;
		for(i=1;i<=number;i++) {
			int count=0;
			for(num=i;num>=1;num--) {
				if(i%num==0) {
					count=count+1;
				}
			}
		    if(count==2) {
			    primeNumber=primeNumber+i+" ";
		    }
		}
		System.out.println("Prime Numbers till"+number+"are :");
		System.out.println(primeNumber);
     }
}