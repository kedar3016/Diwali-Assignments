package Coding;

public class MergeArray {
	
	public static int[] mergeArray(int arr[],int brr[],int n,int m) {
		int crr[] = new int[n+m];
		int i =0,j=0,cnt=0;
		while(i<n && j<m) {
			if(arr[i] <= brr[j]) {
				crr[cnt++] = arr[i++];
				
			}
			else {
				crr[cnt++] = brr[j++];
			}
		}
		
		if(i<n) {
			crr[cnt++] = arr[i++];
		}
		if(j<m) {
			crr[cnt++] = arr[j++];
		}
		return crr;
	}

	public static void main(String[] args) {

		int arr[] = {1,3,7};
		int brr[] = {0,2,4,5,6};
		int n = arr.length;
		int m = brr.length;
		
		int crr[] = mergeArray(arr,brr,n,m);
		System.out.println("After Merge : ");
		for (int i : crr) {
			System.out.print(i);
		}

	}

}
