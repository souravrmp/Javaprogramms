package NumberSystem;

import java.util.Scanner;

public class first1 {

	public static void main(String[] args) {
//		int a= 20, b=30;
//		if(a>=b){
//			System.out.println("Bigger no is :" +a);
//		}
//		else{
//			System.out.println("Bigger no is :" + b);
//		}
//	}
		int n,n1,big;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter first no:-");
		n=scan.nextInt();
		System.out.println("enter second no:-");
	    n1= scan.nextInt();
		
		if (n>n1){
		    big=n;
			
		}
		  else
		  {
			big=n1;
		        
				System.out.println("Bigger no is:-"+big);
				scan.close();
		  }	     
		 }
	 }
	

		  
		  
	

		
	
		  
//}
