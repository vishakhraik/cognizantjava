
public class ReplaceConsonants {

	public static void main(String[] args) {
		String s="java";
		System.out.println("--------Altered String--------");
		System.out.println(alterString(s.toCharArray())); 

	}

	public static boolean isVowel(char c) {
		if (c!= 'a' && c != 'e' && c != 'i'
                && c != 'o' && c != 'u')  
        { 
            return false; 
        } 
        return true;
		
	}

	public static String alterString(char[] s) {
		for (int i = 0; i < s.length; i++) 
        { 
            if (!isVowel(s[i])) 
            { 
   
                if (s[i] == 'z')  
                { 
                    s[i] = 'b'; 
                } 
                else
                { 
  
                    s[i] = (char) (s[i] + 1); 
  
                    
                    if (isVowel(s[i]))  
                    { 
                        s[i] = (char) (s[i] + 1); 
                    } 
                } 
            } 
        } 
        return String.valueOf(s);
		
		
	}

}
