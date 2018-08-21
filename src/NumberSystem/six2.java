package NumberSystem;

import java.util.Scanner;

public class six2 {

	public static void main(String[] args) {
		int a,b,c;
		Scanner scan= new Scanner(System.in);
		System.out.println("enter first no:-");
		a= scan.nextInt();
		System.out.println("enter second no:-");
		b=scan.nextInt();
		System.out.println("eneter third no:-");
		c=scan.nextInt();
		if(a*a+b*b==c){
			System.out.println("true");
		}
		else{
			  System.out.println("false");
			  scan.close();
		}
			
	}

}
