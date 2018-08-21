package StringPractice;

public class ReverseWord {

	public static void main(String[] args) {
		String str="hello sourav saini";
		System.out.println(str.length());
//		System.out.println(str.length());
		String[] words = str.split(" ");
		System.out.println(" Number of words: "+words.length);
		for(int i=words.length-1;i>=0;i--){
			System.out.print(words[i]+" ");
			
		}
		
	}

}
