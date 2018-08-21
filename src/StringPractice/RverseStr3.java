package StringPractice;


public class RverseStr3 {

	public static void main(String[] args) {
		String str="hello sourav saini";
	int totallength = str.length();
	 System.out.println("total lengt"+ totallength);
	 String[] str1 = str.split(" ");
	    System.out.println("total words" +  str1.length);
	     int space = str1.length-1;
	     System.out.println("total space" +  space);
	     for (int i = str1.length-1; i>=0; i--) {
			System.out.print(str1[i] +" ");
		}
	
	
	}
}