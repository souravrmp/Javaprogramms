package Array;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[]={4,3,6,1,2,5};

		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-i-1; j++) {
				if(arr[j]>arr[j+1]){
					int temp=0;
				    temp= arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
						
				}
				  
				
			}

		}
		 for (int k = 0; k <= arr.length-1; k++) 
		 {
			System.out.print(arr[k]);
		}
	}

}
