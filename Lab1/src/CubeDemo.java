import java.util.Scanner;

/**
 * Description: Demo of Sum of Cubes of the number
 * @author vishakhraik
 * Date :14/03/2021
 */
public class CubeDemo {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number=sc.nextInt();
		int sum=cubeNum(number);
		System.out.println("Sum of Cubes of the number ="+sum);

	}

	private static int cubeNum(int num) {
		int sum=0;
		while(num>0)
		{
			int dig=num%10;
			sum=sum+(dig*dig*dig);
			num=num/10;
			
		}
		return sum;
	}

}
