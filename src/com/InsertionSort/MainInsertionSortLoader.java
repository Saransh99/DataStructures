package com.InsertionSort;

/*INSERTION SORT
 in the insertion sort we maintain a sorted part in the left of the array and the unsorted at the right of the array
 
 so here the unsortedindex starts at the index =1 as the index 0 element is already in a sorted partion of the array
 this algo does not have a swap function as we are shifing the elemnets rather than swappting 
 
 
 */

public class MainInsertionSortLoader {

	public static void main(String args[]) {
		
		int[] intArray = {34,56,-2,78,90,2,6,1};
		
		/* here we take the first unsorted index as we are taking the 1th elemnt as the starting point
		  of the unsorted array here 56 will be the first unsorted index and we will go till the last element
		 
		 */
		
		for(int firstUnsortedIndex=1;firstUnsortedIndex<intArray.length; firstUnsortedIndex++) {
			
			// here we store the first unstorted elemtn in a temp var so that we can compare it 
			int new_element= intArray[firstUnsortedIndex];
			
			/*now for the second loop we traverse the sorted array from right to left and we \
			  compare the the current elemtn at the unsored array with the first element of the sorted array
			  and see if the i-1 > i then we move the unsorted element in the sorted array 
			  and then we keep the loop until the element has found its correct position of the insertion
			 here we iterate from the right to hte left therefor we are decrementing the i
			 in this for loop we need to make the index of the sorted array as the firstunsortedindex and then
			 we loop till from the right side to the left side 
			 the array elemt that we have pointed to the new ele,ent is then compared to the intArray[i-1] if the i-1
			 element is greatr than the nwe elemmt than we iterate towards the front of the array till we find the right 
			 place to insert the element  
			 
			 */
			
			
			
			
			int i;
			for(i=firstUnsortedIndex;i>0 && intArray[i-1]>new_element;i--) {
				
				intArray[i] = intArray[i-1];
			}
			intArray[i] = new_element;
		}
		
		
		
		// loop to print the array, no matter what the algo is we always need a loop to traverse the array
		
		for(int i=0;i<intArray.length;i++) {
			System.out.println(intArray[i]);
		}
	}
	
}
