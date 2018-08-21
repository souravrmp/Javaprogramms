package Array;

public class SumEvenArray {

	public static void main(String[] args) {
		int arr[]={1,2,3,4,5,6};
		int esum = 0, osum=0;
		int eavg=0, oavg=0;
		int count=0,count1=0;
		for (int i = 0; i <arr.length; i++) {
			if(arr[i]%2==0){
				count= count+1;
				esum=esum+arr[i];
				eavg=esum/count;
				
			}
			else if(arr[i]%2!=0)
			{
				count1= count1+1;
				osum=osum+arr[i];
				oavg=osum/count1;
				
				}
		}	
		System.out.println("sum of even element in an array:-"+esum);
		System.out.println("avg of even element in an array:-"+eavg);
		System.out.println("sum of odd element in an array:-"+osum);
		System.out.println("avg of odd element in an array:-"+oavg);
	}

}
