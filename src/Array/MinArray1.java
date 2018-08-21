package Array;

import java.util.Arrays;

public class MinArray1 {

	public static void main(String[] args) {
		int arr[]={40,8,10,2,18,9};
		int min=arr[0];
		for (int i =1 ; i < arr.length; i++) {
			
			if(min>arr[i]){
				min=arr[i];	
				}
		}
          System.out.println(min);
}}