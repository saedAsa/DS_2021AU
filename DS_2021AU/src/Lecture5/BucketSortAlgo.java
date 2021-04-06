package Lecture5;
/**
 * DS 2021 lecture codes v 0.1
 *  Bucket sort, bounded sort, and counting sort. 
 * @author asalysaed, Ariel University
 *
 */
import java.util.Arrays;

import Lecture4_SortedLL.Node;
import Lecture4_SortedLL.SortedLL;

public class BucketSortAlgo {

	
	public static void BucketSort(double[] arr) {
		int n = arr.length;
		SortedLL[] buckets = new SortedLL[n];
		for (int i = 0; i < n; i++) {
			buckets[i] = new SortedLL();
		}
		for (int i = 0; i < arr.length; i++) {
			buckets[(int) (n * arr[i])].Add(arr[i]);
		}
		resort(arr, buckets);
	}

	private static void resort(double[] arr, SortedLL[] buckets) {
		int k = 0;
		for (int i = 0; i < buckets.length; i++) {
			Node p = buckets[i].head;
			while (p != null) {
				arr[k++] = p.getData();
				p = p.getNext();
			}
		}
	}
	public static int[] minMax(int[] arr) {
		int[] res = new int[2];// res: res[0]:= min, res[1]:= max
		for (int x : arr) {
			if (x > res[1])
				res[1] = x;
			if (x < res[0])
				res[0] = x;
		}
		return res;
	}

//Assume that arr[i] is in range [0,max]
	public static void BoundedSort(int[] arr) {
		int[] minMax = minMax(arr);// O(n)
		int[] counter = new int[minMax[1] + 1];// O(1)
		for (int i = 0; i < arr.length; i++) {// O(n)
			counter[arr[i]]++;
		}
		int j = 0;
		for (int i = 0; i < counter.length; i++) {// O(n)
			for (int m = 0; m < counter[i]; m++) { 
				arr[j++] = i;
			}
		}
		// O(n)
	}

	public static void countingSort(int[] arr) {
		int[] minMax = minMax(arr);
		int[] counter = new int[minMax[1] - minMax[0] + 1];
		for (int i = 0; i < arr.length; i++) {
			counter[arr[i] - minMax[0]]++;
		}
		int j = 0;
		for (int i = 0; i < counter.length; i++) {
			for (int m = 0; m < counter[i]; m++) {
				arr[j++] = i + minMax[0];
			}
		}
		// O(n)
	}
	public static void main(String[] args) {

		double[] arr = { 0.78, 0.17, 0.39, 0.26, 0.72, 0.94, .21, .12, .23, .68 };
		System.out.println(Arrays.toString(arr));
		BucketSort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("Counting sort");
		int[] arr1 = { 33, 10, 30, 9, 8, 21, 15, 6, 4, 7, 24, 7, 8 };
		System.out.println(Arrays.toString(arr1));
		countingSort(arr1);
		System.out.println(Arrays.toString(arr1));
		System.out.println();
		
	}

}
