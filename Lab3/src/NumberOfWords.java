
public class NumberOfWords {

	public static void main(String[] args) {           
        String s="This is a cow. A cow is a animal.";
        int countword=0,countchar=0,countline=0;  
        char ch[]= new char[s.length()];     
        for(int i=0;i<s.length();i++)  
        {  
            ch[i]= s.charAt(i);  
            if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
                countword++;
            if((s.charAt(i) != ' ')&&(s.charAt(i) !='.'))    
                countchar++;
            if((s.charAt(i) =='.'))    
                countline++;
        }  
        System.out.println(countword+ " number of words.");
        System.out.println(countchar+ " number of characters.");
        System.out.println(countline+ " number of lines.");
        
	}

}
