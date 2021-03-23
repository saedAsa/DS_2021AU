package Lecture2;

import java.util.Arrays;
import java.util.Collections;

/**
 * DS 2021 lecture codes v 0.1
 *  Merge Sort Algorithm + Binary Search 
 * @author asalysaed, Ariel University
 *
 */
public class MergeSortAlgo {
	// suppose that arr is already sorted
	public static int BinarySearch(int[] arr, int k) {
		int low, mid, high;
		low = 0;
		high = arr.length;
		if (k > arr[arr.length - 1] || k < arr[0]) {
			return -1;
		}
		while (low <= high) {
			mid = (low + high) / 2;
			if (arr[mid] == k)
				return mid;
			else if (arr[mid] > k)
				high = mid - 1;
			else
				low = mid + 1;
		}
		return -1;
	}

	public static int BinarySearch(int[] arr, int k, int low, int high) {
		if (k > arr[arr.length - 1] || k < arr[0]) {
			return -1;
		}
		if (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == k)
				return mid;
			else if (arr[mid] > k) {
				return BinarySearch(arr, k, low, mid - 1);
			} else {
				return BinarySearch(arr, k, mid + 1, high);
			}
		}
		return -1;
	}

	// Merge:
	public static int[] Merge(int[] A, int[] B) {
		int i, j, k;
		i = j = k = 0;
		int[] res = new int[A.length + B.length];
		while ((i < A.length) && (j < B.length)) {
			if (A[i] < B[j]) {
				res[k++] = A[i++];
			} else {
				res[k++] = B[j++];
			}
		}
		while (i < A.length) {
			res[k++] = A[i++];
		}
		while (j < B.length) {
			res[k++] = B[j++];
		}
		return res;
	}

	// MergeSort
	public static void MergeSort(int[] arr) {
		MergeSort(arr, 0, arr.length);
	}
	public static void MergeSort(int[] arr, int low, int high) {
		int n = high - low;
		if (n <= 1)
			return;
		int mid = (low + high) / 2;
		MergeSort(arr, low, mid);
		MergeSort(arr, mid, high);
		// Merge the sorted sub-arrays: arr[low,mid),arr[mid,high);
		int[] temp = new int[n];
		int i = low, j = mid, k = 0;
		while (i < mid && j < high) {
			if (arr[j] < arr[i]) {
				temp[k++] = arr[j++];
			} else {
				temp[k++] = arr[i++];
			}
		}
		while (i < mid)
			temp[k++] = arr[i++];
		while (j < high)
			temp[k++] = arr[j++];
		for (int p = 0; p < n; p++) {
			arr[p + low] = temp[p];
		}
	}


	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		int[] arr = { 4, 8, 15, 23, 38, 49, 65, 70, 80 };
//		int k = -9;
//		System.out.println(BinarySearch(arr, k));
//		System.out.println(BinarySearch(arr, k, 0, arr.length));
//		int[] A = { 1, 2, 4, 5, 8, 9 };
//		int[] B = { 0, 3, 6, 7, 10 };
//		System.out.println(Arrays.toString(Merge(A, B)));
//		int n = 20;
//		int[] arr2 = new int[n];
//		for (int i = 0; i < n; i++) {
//			if (Math.random() > 0.3) {
//				arr2[i] = (int) (Math.random() * n);
//			} else
//				arr2[i] = -1 * (int) (Math.random() * n);
//		}
//		System.out.println(Arrays.toString(arr2));
//		boolean flag=true;
//		for(int i=0;i<arr2.length-1;i++) {
//			if(arr2[i]>arr2[i+1]) {
//				flag=false;
//			}
//		}
//		System.out.println("The array arr2 is "+(flag?" sorted.":" not sorted."));
//		MergeSort(arr2);
//		 flag=true;
//		for(int i=0;i<arr2.length-1;i++) {
//			if(arr2[i]>arr2[i+1]) {
//				flag=false;
//			}
//		}
//		System.out.println(Arrays.toString(arr2));
//		System.out.println("The array arr2 is "+(flag?" sorted.":" not sorted."));
//		
	}

}
