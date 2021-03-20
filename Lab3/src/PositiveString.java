
public class PositiveString {

	public static void main(String[] args) {
		String s="ANT";
		System.out.println(checkString(s)+"---Given String is positive---");
		

	}
	
	public static boolean checkString(String s) {
	    for (int i = 0; i != s.length(); ++i) {
	        if (!Character.isLetter(s.charAt(i))) {
	            return false;
	        }
	    }

	    return true;
	}

}
