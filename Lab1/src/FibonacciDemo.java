import java.util.Scanner;

/**
 * Description : Demo of Fibonacci Series
 * @author vishakhraik
 * Date: 14/03/2021
 */
public class FibonacciDemo {

	public static void main(String[] args) {
		int num1=0,num2=1,num3;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the limit: ");
		int limit=sc.nextInt();
		System.out.println(num1+" "+num2);
		for(int i=2;i<limit;i++) {
			num3=num1+num2;
			System.out.println(" "+num3);
			num1=num2;
			num2=num3;
		}
	}
}
