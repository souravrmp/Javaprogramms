package NumberSystem;

import java.util.Scanner;

public class Allodd {

	public static void main(String[] args) {
		int n,n1, sum=0;
		Scanner scan= new Scanner(System.in);
		System.out.println("enter first no:-");
		n=scan.nextInt();
		System.out.println("enter second no:-");
		n1=scan.nextInt();
		for (int i = n; i<n1; i++) {
			if(i%2!=0){
				
		         System.out.println("all odd no are:-"+i);
		         sum=sum+i;
				 
				
		         scan.close();
			}
			  
		}
		    System.out.println(sum);
	}

}
