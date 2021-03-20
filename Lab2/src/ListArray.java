
import java.util.ArrayList;

public class ListArray {

	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>(); 
        num.add(10); 
        num.add(20); 
        num.add(30); 
        num.add(40); 
        Object[] objects = num.toArray();  
        for (Object obj : objects) 
            System.out.print(obj + " ");

	}

}
