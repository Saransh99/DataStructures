package com.maxHeap;

/*MAX heap:- the root node is greater than the all the nodes in the tree
 * a heap is a complete binary tree
 * a tree to be a heap must satisfy the heap property that is either of the max or the min heap
 * we implement the heap using the arrays 
 * the max or the min value of the heap wil always be the root of the heap 
 * in the process of insertion or the deletion we may need to heapify the tree again 
 * we traverse the heap in the level order traversal 
 * left child:- 2i+1 
 * right child:- 2i+2
 * parent node:- (i-1)/2
 * 
 * INSERTION in the max heap:-
 * 1. we always insert the new value in the end of the array 
 * 2. we then compare the new value to the parent 
 * 3. if the enw value is larger than the parent then we swap them and do it until we found the correct position for the new item 
 * 4. if the new value is smaller than the parent then it is in its correct postion 
 * 
 * 
 * DELETION in the max heap:-
 * 1. the replacement node will always be the right most node in the heap i.e the bottom level of the heap 
 * 2. we swap the deleted node with the replacement node 
 * 3. after the replacement of the node we may have to heapify the tree again 
 * 4. we might have to look above as well as below the heap 
 * 5. if the replacement node is greater than the parent node then we swap them 
 * 6. if the replacement node is smaller than the parent node then we may look in the below heap 
 * 
 *  // deletion in the heaps is easier than the bst as we have the repalcement value fixed 
 *  
 *  
 *  INSERTION time:- O(logn) =>  const time for the insertion + logn time for the heapify
 *  DELETION time:- O(nlogn) => n time for the searching of the element and then logn time for the heapify
 *  DELETION time of the root :- O(logn)  => const time for searching the node + logn time for the heapify 
 *  
 *  // if we need to find the random value then heap might not be the right ds for us 
 *  // retrieval of the MAX and the MIN value will be const time 
 * 
 *  heaps can also be used in the priority queue
 *  if the nodes in the heap reperesent the priority we can implement the priority queue
 *  this is implemented using the max heap or min heap 
 *  
 *  --------HEAP SORT ------   time:- O(nlogn)   => n for the swap and logn for the heapify 
 *  
 *  this sort is only aplicable to the heaps 
 *  
 *  if we have the max heap:- 
 *  1. we swap the root with the last element in the heap 
 *  2. we then heapify the heap but exclude the last element as it  is already in it's correct position 
 *  3. after the heapifly the second largest element will be the root of the heap we then continue the process again then this element will move to the second last element in the array 
 *  4. reapeat this
 *  
 *   after sorting the heap it will no longer will be a heap 
 *   so use the heap sort only if u don't need the heap any longer
 */
public class Main {
	
	public static void main(String args[]) {
		
		Heap heap = new Heap(10);
		
		heap.insert(80);
		heap.insert(75);
		heap.insert(60);
		heap.insert(68);
		heap.insert(55);
		heap.insert(40);
		heap.insert(52);
		heap.insert(67);
		
		System.out.print("orignal heap:- ");
		heap.printHeap();
		
		heap.sort();
		System.out.print("sorted heap:- ");
		heap.printHeap();
		
		System.out.println("Root node: " + heap.peek());
		heap.delete(0);
		
		heap.printHeap();
		System.out.println("Root node: "+ heap.peek());
	}
}
