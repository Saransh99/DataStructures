package com.ShellSort;

/* SHELL SORT
 
 the shell sort is just an advancement of the inseriton sort in the shell sort we take into account what is 
 called as the gap, there are diff ways of calculating the gap but we use the array.length/2 to find the
 gap
 
  time complexity = O(n^2) in the worst case
 
 Shell sort can improve the working of the insertion and the bubble sort
 implement the shell sort with the pen and a paper
 */


public class MainShellSortLoader {

	
	public static void main(String args[]) {
		
		int[] intArray = {32,53,-12,1,89,-22,2,67};

		/* the first for loop is simple here we are defining the gap and then in the third argument we are
		  essentialy further dividing the gap by 2 thus on the next iteration the gap will be reduced
		  
		  the Shell sort is implemented until the gap is 1 as when the gap is 1 then that is basicaly the 
		  insertion sort 
		 
		 */
		
		for(int gap=intArray.length/2; gap>0; gap/=2) {
			
			for(int i=gap; i<intArray.length;i++) {
				int new_element = intArray[i];
				// we use j for the traversing in the array
				int j=i;
				
				/*
				 in the below while loop we are just checking if the element at the j-gap is greater than 
				 the j th element if it is then we change the j th element to the j-gap element
				 if not then we break out of the loop
				 */
				
				while(j>=gap && intArray[j-gap]>new_element) {
					intArray[j] = intArray[j-gap];
					/*
					 now here we want to compare the j that is in its new postion to the element behind it
					 therefore the j will now be j-gap
					 */
					j = j-gap;
					
				}
				intArray[j] = new_element;
				
			}
		}
		
		// always need a loop to traverse through the array
		
		for(int i=0; i<intArray.length;i++) {
			System.out.println(intArray[i]);
			
		}
		
	}
	
}
