package Array;

public class MaxArry {

	public static void main(String[] args) {
		int arr[]= {3,2,8,4};
		for (int i = 0; i < arr.length-1; i++) {
	    for (int j = 0; j < arr.length-i-1; j++) {
			if (arr[j]>arr[j+1]){
			int temp=0;
			temp= arr[j+1];
			arr[j+1]=arr[j];
			arr[j]=temp;
			}
		}
		}
		  for (int k = 0; k <= arr.length-1; k++) {
			
			
		}
		  System.out.print(arr[3]);
	}

}

