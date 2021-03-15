package Lecture3;

import java.util.Arrays;

public class QuickSortAlgo {

	public static void QuickSort(int[]arr) {
		QuickSort(arr,0,arr.length-1);
	}
	private static void QuickSort(int[]arr,int start,int end) {
		if(start<end) {
			int pivotIndx=Partition(arr,start,end);
			QuickSort(arr,start,pivotIndx-1);
			QuickSort(arr,pivotIndx+1,end);
		}
	}
	
	
	private static int Partition(int[]arr,int start,int end) {
		int pivot=arr[end],currIndx=start;
		for(int i=start;i<end;i++) {
			if(arr[i]<=pivot) {
				swap(arr,i,currIndx);
				currIndx++;
			}
		}
		swap(arr,currIndx,end);
		return currIndx;
	}
	
	private static void swap(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int tmp=arr[i];
		arr[i]=arr[j];
		arr[j]=tmp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=20;
		int[] arr2 = new int[n];
		for (int i = 0; i < n; i++) {
			if (Math.random() > 0.3) {
				arr2[i] = (int) (Math.random() * n);
			} else
				arr2[i] = -1 * (int) (Math.random() * n);
		}
		System.out.println(Arrays.toString(arr2));
		boolean flag=true;
		for(int i=0;i<arr2.length-1;i++) {
			if(arr2[i]>arr2[i+1]) {
				flag=false;
			}
		}
		System.out.println("The array arr2 is "+(flag?" sorted.":" not sorted."));
		QuickSort(arr2);
		 flag=true;
		for(int i=0;i<arr2.length-1;i++) {
			if(arr2[i]>arr2[i+1]) {
				flag=false;
			}
		}
		System.out.println(Arrays.toString(arr2));
		System.out.println("The array arr2 is "+(flag?" sorted.":" not sorted."));
		
		
	}

}
