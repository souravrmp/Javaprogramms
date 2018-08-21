package StringPrac;

public class String6 {

	public static void main(String[] args) {
		String str="Hello sourav saini";
		 
		int len = str.length()-1;
		String[] words = str.split(" "); 
		System.out.println("total word count:--"+words.length );
		while(len>=0){
			char ch = str.charAt(len);
			len--;
			System.out.print(ch);
		}
		
		     
		
		         

	}

}
