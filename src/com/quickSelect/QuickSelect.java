package com.quickSelect;

import java.util.Random;

/*
 * this implementation is to find the kth largest item in the array 
 * i.e we will partition the larger items in the left array 
 * 
 * if we need to get the smallest element we just need to change the partition 
 */
public class QuickSelect {

	private int[] nums;

	public QuickSelect(int[] nums) {
		this.nums = nums;
	}

	public int select(int k) {
		return select(0, nums.length - 1, k - 1);
	}

	private int partition(int firstIndex, int lastIndex) {

		int pivot = new Random().nextInt(lastIndex - firstIndex + 1) + firstIndex;
		swap(lastIndex, pivot);

		for (int i = firstIndex; i < lastIndex; i++) {
			if (nums[i] > nums[lastIndex]) {
				swap(i, firstIndex);
				firstIndex++;
			}
		}

		swap(firstIndex, lastIndex);
		return firstIndex;

	}

	private int select(int firstIndex, int lastIndex, int k) {
		int pivot = partition(firstIndex, lastIndex);

		if (pivot > k) {
			return select(firstIndex, pivot - 1, k);
		} else if (pivot < k) {
			return select(pivot + 1, lastIndex, k);
		}
		return nums[k];
	}

	private void swap(int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}
