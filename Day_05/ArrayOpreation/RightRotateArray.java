package ArrayOpreation;

import java.util.Scanner;

public class RightRotateArray {
	
	public static int[] rightRotate(int[] arr, int k,int n) {
		k = k % n;
		
		reverseArray(arr,0,k);
		reverseArray(arr,k+1,n-1);
		reverseArray(arr,0,n-1);
		return arr;
		
		
	}
	

	public static void reverseArray(int[] arr, int start, int end) {

	
		while(start <= end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		
		
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the Size of the Array : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the Array : ");
		
		for(int i =0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter No of Rotation : ");
		int k = sc.nextInt();
		
		int temp[] = rightRotate(arr,k,n);
		
		System.out.println("The Roatate Array : ");
		for(int i =0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}

	}

	

}
