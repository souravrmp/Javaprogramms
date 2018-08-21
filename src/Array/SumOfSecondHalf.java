package Array;

public class SumOfSecondHalf {

	public static void main(String[] args) {
		int arr[]={4,5,6,7,8,9};
		int sum= 0;
		System.out.println(arr.length);
		int len = arr.length/2;
		for (int i = len; i < arr.length; i++) {
			sum= sum+arr[i];
		}
		  System.out.println("sum of second half:--"+sum);
	}

}
