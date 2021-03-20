
public class SortedList {

	public static void main(String[] args) {
		String[] products= {"Banana","Mango","Apple","Orange"};
		for(int i=0;i<products.length;i++) {
			for(int j=i+1;j<products.length;j++) {
				if(products[i].compareTo(products[j])>0) {
					String temp=products[i];
					products[i]=products[j];
					products[j]=temp;
				}
			}
		}
		System.out.println("Sorted List of Products :");
		for(int i=0;i<products.length;i++)
		System.out.println(products[i]);

	}

}
