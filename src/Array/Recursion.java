package Array;

public class Recursion {
	   static int x=0;
	public static void testRecursion(){
		System.out.println("hello");
		x++;
	    if(x<12){
		 testRecursion(); 
	  }
	    else{
	    	return;
	    }
	    	
	}
	public static void main(String[] args) {
      
     testRecursion();
		
	}
	
	  

}
