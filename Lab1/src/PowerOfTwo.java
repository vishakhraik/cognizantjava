
public class PowerOfTwo {

	public static void main(String[] args) {
		int num=8;
		if(checkNumber(num)) {
			System.out.println(num+" is power of 2");
		}else {
			System.out.println(num+" is not power of 2");
		}
			

	}

	private static boolean checkNumber(int num) {
		if (num == 0)
            return false;
         
        while (num != 1)
        {
            if (num % 2 != 0)
                return false;
            num = num / 2;
        }
        return true;
		
		
		
	}

}
