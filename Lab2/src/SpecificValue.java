
public class SpecificValue {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50,60};
		int value=60;
		for(int i=0;i<arr.length;i++) {
			if(value==arr[i]) {
				System.out.println("Value "+value+" is present in the array");
				System.exit(0);
			}
		}
		System.out.println("Value "+value+" is not present in the array");
	
		
		

	}

}
