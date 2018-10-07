package com.countingSort;

/*the past algos dont take the assumptions about the data typ
 * 
 * COutning sort takes the assumption about the data
 * this can make the time complexity of these algo better than the previous algo
 * works only with non negative discrete values 
 * dont work with floats, Strings 
 * this is basically used for the whole numbers
 * it counts the no. of occurences of each value
 * values must be within a specific range
 * the range has to resonable and cant be so huge
 * this is not inplace algo
 * this algo is best when the no. of values that we want to sort is roughly equal to the range of values we can have
 * example let us say that we have an array of 1,2,3,10000 then we have to create a counting array to hold 10000 values for just sorting 4 values
 * 
 * this can achieve O(n) linear time
 */



public class MainCoutningSort {

	public static void main(String args[]) {
		
		
		/*
		 * let us say we have an array of 2,3,6,7,2,5,6,4,10,8
		 * now we take another array called the counting array to store the occurences of the values of the array
		 * here we can see that the max value of the array is 10 so we can take the counting array of 10 index
		 * now we start writig the no. of occurences of these values in the counting array 
		 * so we start with 1 as there are no occurrnces of 1 we write 0
		 * 0,2,1,1,1,2,1,1,0,1
		 * the above array is the no. of occurernces of each value of the elements
		 * 2 has occured 2 times therfore we write 2 and so on
		 * now using this counting array we write the values back to the input array
		 * this algo doesnot require any comparisions to be made
		 */
		
		
		int[] intArray = {2,5,6,2,3,8,9,3,4,10,7,4};
		
		countingSort(intArray, 1, 10);
		
		for(int i=0; i<intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		
			
	}
	
	public static void countingSort(int[] input, int min, int max) {
		
		int[] countArray = new int[(max-min)+1];
		
		for(int i=0; i<input.length; i++) {
			
			/*the below line of code is incrementing the position of the values in the array 
			 * eg i=5 then min =1 sp we increment the countArray index 4
			 * another example i=10 and min =1 then we increment the countArray index =9
			 */
			countArray[input[i]-min]++;
		}
		
		// this j is used to iterate through the input arrray 
		int j=0;
		
		// the i is used to iterate through the counting array
		for (int i=min; i<max; i++) {
			
			/*let us take an example to understand what is going on in here
			 * say i =2 and say 2 occurs 2 times in the array then the countArray[2-1]>0
			 */
			
			while(countArray[i-min]>0) {
				
				// then we write the 2 to the input array
				input[j++] = i;
				// and after writing the first 2 we need to decement the count of the 2
				countArray[i-min]--;
			}
		}
	}
}
