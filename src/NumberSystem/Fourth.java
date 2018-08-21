package NumberSystem;

public class Fourth {

	public static void main(String[] args) {
		int n1=20,n2=40,n3=10;
         if(n1>n2&&n2>n3){
    	  
    	   System.out.println("sorted no are" +n3+" "+n2  +" "+n1);
       }
       else{
    	     
       
        if(n2>n3&&n3>n1){
        	System.out.println("sorted no are"+n1+" "+n3+" "+n2);
        }
       
            if(n3>n2&&n2>n1){
        	
            	System.out.println("sorted no are"+n1+" "+n2+" "+n3);
        }
	}

}}
