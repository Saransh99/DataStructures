package com.MergeSort;
/*
 the merge Sort
 
 this is a divide and conquer method algo in this algo we divide the array into two parts 
 the divide technique is inplace while the merge process in not inplace
 this algo is better applied with the recursion technique
 Time COmplexitiy = O(nlogn)
 this is a stable algo
  
 
 */

public class MainMergeSortLoader {

	public static void main(String args[]) {
		
		int[] intArray = {34,56,-5,1,89,-22,9,10,-6};
		
		mergeSort(intArray, 0 , intArray.length);
		
		
		for(int i=0; i<intArray.length;i++) {
			System.out.println(intArray[i]);
			
		}
		
	}
	
	
	// the mergesort method willl be the recursive method as it is going to call itself
	public static void mergeSort(int[] input, int start, int end) {
		
		// this is break or the method that is used to return all the recursive calls of the method
		//if the array is consisting of only one element then we return as the array is sorted itself
		
		if(end-start<2) {
			return;
		}
		// this is the partition
		int mid = (start+end)/2;
		/*
		 in this we have taken the end index as mid and not mid-1 as we are taking the end index one more
		 the below is the method for the left partiotin array
		 so basically when the below method is called then the left side of the array would have been partioned
		 and sorted
		 */
		
		mergeSort(input,start,mid);
		
		// this is for the right array
		mergeSort(input,mid, end);
		
		/*
		 so by the time the merge method is called both the left and the right side has been partioned
		 sorted and then merged back again 
		 
		 */
		merge(input,start,mid,end);
	}
	
	public static void merge(int[] input, int start, int mid , int end) {
		
	   /*below is an merge optimized step
	    
	    we check if the last element of the left array is smaller than the first elemnet of the 
	    right array then we got the sorted array as all the left and the right arrays are already in a
	    sorted manner so if the end element of the left array is samller than the right elament
	    therefore we get the sorted array and we dont need to do anything so we return
	    
	    */
		
		
		if(input[mid-1]<=input[mid]) {
			return;
		}
		int i=start;
		int j=mid;
		int tempIndex = 0;
		
		int[] temp = new int[end-start];
		// here we traverse both the left and the right array till their respective end index
		while(i<mid && j<end) {
			/*
			 in the below line of cod we are going to check if the ith element is smaller than the jth 
			 element if yes then we copy that to the temp array and then we increment the i th array and
			 we also increamtne the temp index same applies to the jth elemnts
			
			 */
			
			temp[tempIndex++] = input[i] <= input[j] ?input[i++] :input[j++];
			
		}
		
		/*now we need to handle the case where the some elements are left in the left or the right array
		 * if there are elements in the left array then we copy than in the temp array 
		 * if there are elements left in the right array then we dont need to copy them as they are already 
		 * in their correct position so we will be doing extra work to copy and pasting these element again and again
		 */
		
		/*
		 The java.lang.System.arraycopy() method is used to copy certain elements from one array to the anotherarray for a specified length
		 Parameters:-
		 1.Source arr 
		 2.Source pos:- the starting pos from where u need to copy the elements 
		 3.Destinaation arr;
		 4.Destination pos:- the stating pos in the destination arr where to copy the elemnets
		 5.length:= the length or the no. of elements to copy from the source
		 
		 */
		System.arraycopy(input, i, input, start+tempIndex,mid-i);
		System.arraycopy(temp, 0, input, start, tempIndex);
	}
}
