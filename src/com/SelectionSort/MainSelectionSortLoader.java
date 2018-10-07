package com.SelectionSort;

/* this is the selection sort
 in the selection sort we find the largest element in the array and then we move that to the last index of the array
 we inittaly set the largest element to the 0 we then see if the array element is largest than the previous element then we change that elemetn to be the latgest elemetn
 time complexity = O(n^2)
 this is an unstable algorithm as the duplicate elements can change their places
 */
public class MainSelectionSortLoader {

	// this swap method is common in both the bubble and the selection sort
	public static void swap(int[]array, int i, int j) {
		
		if(i==j) {
			return;
		}
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	
	public static void main(String args[]) {
		
		
		int[] intArray = {34,67,84,-5,1,6,90};
		
		for(int lastUnsortedIndex= intArray.length-1;lastUnsortedIndex>0;lastUnsortedIndex--) {
			// we set the largest element to be the first element of the array as we still dont know the largest of all the elements

			int largest= 0;
			// here we take the less than or equaal to as we need to find the largest element by comparing all the elemenst 
			
			for(int i=0; i<=lastUnsortedIndex;i++) {
				
				if(intArray[i]>intArray[largest]) {
					largest=i;
				}
			}
			// we are swapping the largest with the last unsorted as we want to move the largest element to the last of the array
			
			swap(intArray, largest, lastUnsortedIndex);
		}
		
		// always need a for loop to traverse the array
		
		for(int i=0; i<intArray.length;i++) {
			
			System.out.println(intArray[i]);
		}
	}
}
