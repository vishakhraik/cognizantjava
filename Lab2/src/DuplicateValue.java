
public class DuplicateValue {

	public static void main(String[] args) {
	int[] arr=new int[6];
	arr[0]=10;
	arr[1]=20;
	arr[2]=10;
	arr[3]=40;
	arr[4]=50;
	arr[5]=20;
	System.out.println("Duplicate Values are :");
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				System.out.println(arr[j]);
			}
		}
	}
	

	}

}
