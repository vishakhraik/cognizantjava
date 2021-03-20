import java.util.Scanner;

public class PrintTheNumbers {

	public static void main(String[] args) {
		int n=5;
		int countpos=0,countneg=0,countodd=0,counteven=0,countzero=0;
		int[] arr = new int[20];  
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter the integers: ");  
		for(int i=0; i<n; i++)
		{     
		arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(arr[i]<0) {
				countneg++;
			}
			if(arr[i]>0){
				countpos++;
			}
			if(arr[i]%2==0) {
				counteven++;
			}
			if(arr[i]%2!=0) {
				countodd++;
			}
			if(arr[i]==0){
				countzero++;
			}
		}
		System.out.println("Number of positive numbers: "+countpos);
		System.out.println("Number of negative numbers: "+countneg);
		System.out.println("Number of even numbers: "+counteven);
		System.out.println("Number of odd numbers: "+countodd);
		System.out.println("Number of 0s: "+countzero);
		
	}

}
