package com.quickSort;

// ---------QUICK SORT--------

/*the quick sort is also a divide and conquer technique
 * this uses a pivot element to divide the array into two parts
 * it puts the elements in the left half that are smaller than the pivot element and in the right half it puts the 
 * element that are greater than the pivot element
 * after the partioning is done then the pivot will be at its correct position but the left and the right sub arrays are not necessrily sorted
 * then we do the same thing again on the left and the right arrays that is choosing a pivot point in the left and in the right array
 * eventually every element will be the pivot element and thus the array will be sorted
 * unlike the merge sort the quick sort is an inplace algo that is there is no need of the extra array to store the temp array
 */

public class MainQuickSort {

	// in this impkementation we are going to choose the first element as the pivot element
	public static void main(String args[]) {
		
		int[] intArray = {12,9,-5,8,1,-55,78,2};
		
		quickSort(intArray, 0 , intArray.length);
		/*
		 * we set the start of the array as i and the end of the array as j
		 * now we move from right to the left looking for the element that is less than the pivaot element 
		 * when we find the first element that is smaller than the pivot element we will assign that to the pivot element 
		 * then we switch to the i and we move from left to the right side then we look at the first element and if the element is greater thaan the pivot then we change thet element to the j th element 
		 * j moves from right to left looking for the values smaller than pivot 
		 * i moves from left to right looking for the values larger than the pivot
		 * we check this until i<j that is i has not crossed j yet
		 */
		
		for(int i=0; i<intArray.length; i++) {
			System.out.println(intArray[i]);
		}
	}
	
	
	public static void quickSort(int[] input, int start, int end) {
		
		// this condition is same as the merge sort if the array is only of one element
		if(end-start<2) {
			return;
		}
		
		// now the below will return the position of the pivot element when the array is partioned that is the elements the left of the 
		// pivot element will be less and the elements to the right will be greater
		// finally all the elements  will be pivot elements and they will be sorted
		
		int pivotIndex = partition(input, start, end);
		
		// now we will call the quicksort recursively for the left and the right side of the partiton for further partion
		/*
		 * this is recursive call remember the left subArray will be handled first completely and than 
		 * the right subArray will be called
		 */
		quickSort(input,start,pivotIndex);
		quickSort(input,pivotIndex+1,end);
		
		
	}
	
	public static int partition(int[] input, int start, int end) {
		
		// now as mentioned we are using the first element as the pivot element
		
		int pivot = input[start];
		int i = start;
		int j = end;
		
		// i will traverse from left to right and j will traverse from right to left
		// we will stop when i has crossed j
		
		while(i<j) {
			
			/*
			 * this is an empty loop this will run till the conditions inside the loop is met
			 * when the conditions inside the loop will not be valid the loop will break and the below code will get executed
			  example of an empty while loop
			  
			  int i =100;
			  int j=200;
			  
			  while(++i < --j);
			  System.out.println(i);
			  System.out.println(j);
			  
			  output = 150 
			           150
			           
			  the loop will check till i<j as soon  as i=j then the loop will break and the below statements will get executed         
			  
			 */
			
			// so this condition will continue until i<j and 
			// when the jth element is less than the pivot element then assign that to the i
			// after that we are going to switch to i and we go from left to right then we look for the element greater than the pivot element 
			
						
			while(i<j && input[--j] >= pivot);
			if(i<j) {
				input[i] = input[j];
			}
			
			while(i<j && input[++i] <=pivot);
			if(i<j) {
				input[j] = input[i];
			}
		}
		
		input[j] = pivot;
		return j;
		
	}
	
	
}
