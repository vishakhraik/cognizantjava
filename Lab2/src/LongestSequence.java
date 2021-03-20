import java.util.ArrayList;
import java.util.Arrays;

public class LongestSequence {

	public static void main(String[] args) {
		int arr[] = {49,1,3,200,2,4,70,5 };
        int n = arr.length;
        System.out.println("Length of longest consecutive sequence ="+findLongest(arr,n));
        
		

	}
	
	public static int findLongest(int arr[],int n){
		Arrays.sort(arr);
		int ans = 0, count = 0;
		ArrayList<Integer> v = new ArrayList<Integer>();
		v.add(10);
		for (int i = 1; i < n; i++) {
			if (arr[i] != arr[i - 1])
			v.add(arr[i]);
			}
		for (int i = 0; i < v.size(); i++){
			if (i > 0 &&v.get(i) == v.get(i - 1) + 1)
				count++;
			else
				count = 1;
		ans = Math.max(ans, count);
		}
		return ans;
}

}
