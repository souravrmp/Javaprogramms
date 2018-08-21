package Array;

public class SumOfHalf {

	public static void main(String[] args) {
		int arr[]={2,3,4,5,6,7};
		int sum=0;
		
		for (int i = 0; i <arr.length/2; i++) {
			sum= sum+arr[i];
			 
		}
		   System.out.println("sum of first half:-"+sum);
	}

}
