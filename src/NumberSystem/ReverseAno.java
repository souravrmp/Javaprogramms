package NumberSystem;

public class ReverseAno {

	public static void main(String[] args) {
		int n=132,rev=0,temp=0;
		  while(n>0){
	          temp=n%10;
		      rev= rev*10+temp;
	          n=n/10;
			
	        }
			
		           System.out.println(rev);
	       
			
		}
}


