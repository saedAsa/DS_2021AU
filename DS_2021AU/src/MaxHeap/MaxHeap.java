package MaxHeap;

import java.util.Arrays;

/**
 * 
 * @author Asaly Saed Maximum heap class - Data structures course, Ariel
 *         University - 2020.
 */

public class MaxHeap {
	int[] arr;
	int last;
	int size;

	public MaxHeap(int size) {
		this.size = size;
		arr = new int[size];
		last = -1;
	}

	public boolean Add(int data) {
		if (last == size - 1)
			return false;
		arr[++last] = data;
		Heapify_Up(last);
		return true;
	}

	private void Heapify_Up(int pos) {
		if (pos == 0)
			return;
		int parent = (int) (Math.floor((pos - 1) / 2));
		if (arr[pos] > arr[parent]) {
			swap(arr, pos, parent);
			Heapify_Up(parent);
		}

	}

	private void swap(int[] arr, int from, int to) {
		int tmp = arr[from];
		arr[from] = arr[to];
		arr[to] = tmp;
	}

	public int Delete() {
		if (last != 0) {
			int tmp = arr[0];
			swap(arr, 0, last--);
			Heapify_down(0);
			return tmp;
		} else if (last == 0) {
			int tmp = arr[0];
			last = -1;
			return tmp;
		} else {
			return Integer.MAX_VALUE;
		}
	}

	private void Heapify_down(int pos) {
		int left, right;
		left = 2 * pos + 1;
		right = 2 * pos + 2;
		if ((left == last) && ((arr[pos] < arr[left]))) {
			swap(arr, pos, left);
			return;
		}
		if ((right == last) && (arr[right] > arr[left]) && (arr[pos] < arr[right])) {
			swap(arr, pos, right);
			return;
		} else if ((right == last) && (arr[right] < arr[left]) && (arr[pos] < arr[left])) {
			swap(arr, pos, left);
			return;
		}
		if (left >= last || right >= last) {
			return;
		}
		if ((arr[left] > arr[right]) && (arr[pos] <= arr[left])) {
			swap(arr, pos, left);
			Heapify_down(left);
		} else if (arr[pos] < arr[right]) {
			swap(arr, pos, right);
			Heapify_down(right);
		}
	}

	public static void HeapSort(int[] arr) {
		MaxHeap h = new MaxHeap(arr.length);
		for (int i = 0; i < arr.length; i++) {
			h.Add(arr[i]);
		}
		for (int i = 0; i < arr.length; i++) {
			h.Delete();
			System.out.println(Arrays.toString(h.arr));
		}
		for (int i = 0; i < arr.length; i++)
			arr[i] = h.arr[i];
	}

	public static void main(String[] args) {
		int size = 10;
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = (int) ((Math.random() > 0.5 ? (-1) : 1) * (Math.random() * (size * 10)));
		}
		System.out.println("Original array:" + Arrays.toString(arr));
		HeapSort(arr);
		System.out.println(Arrays.toString(arr));
		boolean flag = true;
		for (int i = 1; i < size; i++)
			if (arr[i - 1] > arr[i])
				flag = false;
		System.out.println(flag ? "array is sorted" : "array is not sorted");
	}
}
