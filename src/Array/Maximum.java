package Array;

public class Maximum {

	public static void main(String[] args) {
		int arr[]={4,1,9,7};
		int max=arr[0];
		for (int i = 1; i < arr.length; i++) 
		{
	
				if(max<arr[i]){
				 max=arr[i];
			   }
		}
		System.out.println(max);
	}

}
