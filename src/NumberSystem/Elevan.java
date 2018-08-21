package NumberSystem;

import java.util.Scanner;

public class Elevan {

	public static void main(String[] args) {
		int n;
		Scanner scan= new Scanner(System.in);
		System.out.println("enter the no");
        n= scan.nextInt();
        
			
		
          if(n%4==0&&n%5==0){
  		  System.out.println("LARA");
		  
        	
        }
        	else 
        	{
        		if(n%5==0){
        			System.out.println("j2ee");
        		}
        	          else{
        	        	     if(n%4==0){ 

        	        	    System.out.println("java");
        	        	  }
        	        	  scan.close();
        	          }
        	}
        }
	}


