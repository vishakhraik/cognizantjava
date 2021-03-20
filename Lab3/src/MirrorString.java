
public class MirrorString {

	public static void main(String[] args) {
		String s="EARTH";
		getImage(s);

	}

	public static void getImage(String s) {
		String reverse = new StringBuffer(s).reverse().toString();
		System.out.println("-----Mirrored String-----");
		System.out.println(s+"|"+reverse);
		
	}

}
