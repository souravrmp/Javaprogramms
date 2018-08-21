
public class pattern6 {

	public static void main(String[] args) {
		String str="java";
		char[] ch=str.toCharArray();
		for (int i = 1; i <= ch.length; i++) {
			for (int j = 0; j <i; j++) {
				System.out.print(ch[j]);
			}
			System.out.println();
		}
	}

}
