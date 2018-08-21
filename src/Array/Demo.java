package Array;

public class Demo {

	public static void main(String[] args) {
		int arr[];
		arr=new int[10];
		System.out.println(arr.length);
		arr[1]=4;
		System.out.println(arr[1]);
		arr[0]=arr[1]+1;
		System.out.println(arr[0]);
	}

}
