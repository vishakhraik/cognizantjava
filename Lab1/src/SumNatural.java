import java.util.Scanner;

public class SumNatural {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a limit: ");
		int num=sc.nextInt();
		System.out.println("Sum ="+calculateSum(num));;

	}

	public static int calculateSum(int num) {
		int sum=0;
		for(int i=0;i<=num;i++) {
			if(i%3==0||i%5==0)
			sum=sum+i;
		}
		return sum;
	}

}
