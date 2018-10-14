package com.quickSelect;
import java.util.Scanner;

/*---------QUICK SELECT--------
 * it is the selection algo to find the kth smallest/ largest item in an unordered array
 *
 * Average time O(n)
 * Worst case time O(n^2):- finding the max in the sorted element and we choose the first element as the pivot 
 * 
 * Inplace algorithm
 * we choose the pivot element at random 
 * this selection algoritm is similar to the quick sort algo
 * this also partitions the array 
 * we only take one side and discard the other side 
 * if the element is the largest then the item is in the right array so we discard the left array 
 * and if the element is smallest then it is in the left subArray and we discard the right subArray
 * 
 */


public class Main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the kth largest element u want to find :- ");
		int k = scan.nextInt();
		int[] nums = {1,5,4,8,-2};
		
		QuickSelect quickSelect = new QuickSelect(nums);
		System.out.println("The kth:- "+k+" largest element is:- "+quickSelect.select(k));  // this will return the kth largest element in the array 
	}
}
