package com.SortingAlgoPractice;

// this is the bubble sort 
// time complexity = O(n^2)
// it is a stable sorting algo as it takes care of the duplicate elements in the array

public class MainAlgoLoader {

	public static void swap(int[]array, int i, int j) {
		
		if(i==j) {
			return;
		}
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	public static void main(String args[]) {
		
		int[] intArray = {21,45,63,-54,1,-22};
		
		// now we mark the index of the last sorted elemet in the array that is the last element at the first of the algo
		
		for(int lastunsortedindex = intArray.length-1;lastunsortedindex>0; lastunsortedindex--) {
			
			for(int i=0; i<lastunsortedindex;i++) {
				if(intArray[i]>=intArray[i+1]) {
					swap(intArray, i , i+1);
					
				}
			}
			
		}
		// now to print the array we always need a loop
			for(int i =0; i<intArray.length;i++) {
				System.out.println(intArray[i]);
			}
	}
	
	
	
}
