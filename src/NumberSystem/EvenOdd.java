package NumberSystem;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		int n;
		Scanner scan =new Scanner(System.in);
		System.out.println("enter the no:-");
		n= scan.nextInt();
		if(n%2==0){
			System.out.println("the given no is even");
		}
		else{
			System.out.println("the given no is odd");
			scan.close();
		}
	}

}
