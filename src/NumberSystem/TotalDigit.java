package NumberSystem;

public class TotalDigit {

	public static void main(String[] args) {
		int n=1354,count=0,sum=0;
		while(n>0){
			n=n/10;
			count=count+1;
			sum= sum+n/10;
			}
		  System.out.println("total digit of no are:-"+count);
		  System.out.println("sum of digit is:-"+sum);
		 
	
		
	}
		
		
	}


