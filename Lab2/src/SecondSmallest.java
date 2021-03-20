import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallest {
	public static void main(String[] args) {
		int[] arr = new int[5];  
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter the integers: ");  
		for(int i=0; i<arr.length; i++)
		{     
		arr[i]=sc.nextInt();
		}
		System.out.println("Second Smallest element in the array : ");
		getSecondSmallest(arr);

	}

	private static int getSecondSmallest(int[] arr) {
		Arrays.sort(arr);
		System.out.println(""+arr[1]);
		return 0;

		
	}
	
	

}
