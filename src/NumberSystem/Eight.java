package NumberSystem;

import java.util.Scanner;

public class Eight {

	public static void main(String[] args) {
		int n,multi=0;
      Scanner scan = new Scanner(System.in);
      System.out.println("enter the no:-");
      n=scan.nextInt();
      for (int i = 1; i <=5; i++) {
		    multi=n*i;
		    
		System.out.println("multiple of given no:-"+multi);  
		scan.close();
	}
      
      
	}

}
