package NumberSystem;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		int n;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the no:-");
        n= scan.nextInt();
        int count=0;
         for (int i=1;i<=n;i++)
         {
        	
        	 if(n%i==0)
        	 {
			 count++;		
			 }      
     	 }
          if(count==2)
          {
        	 System.out.println("prime"); 
          }
          else
          {
        	  System.out.println("not prime");
          }
            scan.close();
			}
               

}
