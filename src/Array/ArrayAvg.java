package Array;

public class ArrayAvg {

	public static void main(String[] args) {
		int arr[]={5,5,8,6};
		int sum=0, avg=0;
		for (int i = 0; i < arr.length; i++) {
			sum=sum+arr[i];
			if(sum>0){
			avg=sum/4;
			}
			
		}
		  System.out.println(avg);
	}

}
