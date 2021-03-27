package Lecture4;

import java.util.Arrays;
/**
 * DS 2021 lecture codes v 0.1
 *  Radix Sort Algorithm (linked list based).
 * @author asalysaed, Ariel University
 *
 */
public class RadixSortAlgo {
	
	public static void reSort(int[] arr, LinkedList[] buckets) {
		int k = 0;
		for (int i = 0; i < 10; i++) {
			Node p = buckets[i].head;
			while (p != null) {
				arr[k++] = p.getData();
				p = p.getNext();
			}
			buckets[i] = new LinkedList();
		}
	}



	public static void RadixSort(int[] arr) {
		int max = max(arr);
		int div=1;
		LinkedList[] buckets=new LinkedList[10];
		for(int i=0;i<10;i++) {
			buckets[i]=new LinkedList();
		}
		
		while(max!=0) {
			max=max/10;
			for(int i=0;i<arr.length;i++) {
				//div = 10 , arr[i]=83045 =>arr[i]/10 => 8304%10=>4
				buckets[(arr[i]/div)%10].Append(arr[i]);
			}
			reSort(arr,buckets);
			div*=10;
		}

	}

	private static int max(int[] arr) {
		int ans = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > ans)
				ans = arr[i];
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {345,1320,9821,132,11,234,137};
		System.out.println(Arrays.toString(arr));
		RadixSort(arr);
		System.out.println(Arrays.toString(arr));

	}

}
