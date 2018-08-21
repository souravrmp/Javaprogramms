package StringPrac;

public class First1 {

	public static void main(String[] args) {
		String s="hello";
		int len = s.length()-1;
		//System.out.println(len);
		while(len>=0){
		char rev = s.charAt(len);
			       len--;
		
		   System.out.print(rev);
		
		}
	}
		}

	


