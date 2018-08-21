package StringPractice;

public class ReverseStr {
static String str= "sourav";

	public static void main(String[] args) {
		String reverse= new StringBuffer(str).reverse().toString();
        System.out.println("string:-"+ reverse);
	}

}
