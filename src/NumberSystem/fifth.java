package NumberSystem;

import java.util.Scanner;

public class fifth {

	public static void main(String[] args) {
		int a,b,c;
 Scanner scan =new Scanner(System.in);
 System.out.print("enter first no:- ");
 a= scan.nextInt();
 System.out.print("enter second no:-");
 b= scan.nextInt();
 System.out.print("enter third no:-");
 c= scan.nextInt();
 System.out.println("the sum of two no:-"+sumOfTwo(a,b,c));
 scan.close();
	}


 public static Boolean sumOfTwo(int a,int b,int c){
	return((a+b==c || b+c==a || c+a==b));
 }
}
	


