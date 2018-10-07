package com.maxHeap;

public class Heap {

	private int[] heap;
	private int size;
	
	public Heap(int capacity) {
		heap = new int[capacity];
	}
	
	public void insert (int value) {
		if(isFull()) {
			throw new IndexOutOfBoundsException("Heap is full");
		}
		
		heap[size] = value;
		fixHeapAbove(size);
		size++;
		
	}
	
	public int delete(int index) {
		if(isEmpty()) {
			throw new IndexOutOfBoundsException("heap is empty");
			
		}
		
		int parent = getParent(index);
		int deletedValue = heap[index];
		
		heap[index] = heap[size-1]; // replacement step, the right most value in the leaf
		
		if(index==0 || heap[index]<heap[parent]) {
			fixHeapBelow(index, size-1);
		}else {
			fixHeapAbove(index);
		}
		size--;
		return deletedValue;
		
	}
	
	private void fixHeapBelow(int index, int lastHeapIndex) {
		int childToSwap;
		
		while(index<=lastHeapIndex) {
			int leftChild = getChild(index, true);
			int rightChild = getChild(index, false);
			// in the heap we can't have a right child but no left chld of the node this means that the tree is not  a heap 
			if(leftChild<=lastHeapIndex) {
				if(rightChild>lastHeapIndex) {
					childToSwap = leftChild;
				}else {
					childToSwap = (heap[leftChild] > heap[rightChild] ? leftChild :rightChild);
						
				}
				
				if(heap[index] < heap[childToSwap]) {
					int temp = heap[index];
					heap[index] = heap[childToSwap];
					heap[childToSwap] = temp;
				}
				else {
					break;
				}
				
				index  =childToSwap;
			}else {
				break;
			}
		}
			
	}

	
	private void fixHeapAbove (int index) {
		int newValue = heap[index];
		while(index>0 && newValue>heap[getParent(index)]) // if we have hit the zero then we have the new value as the root 
		{
			heap[index] = heap[getParent(index)];
			index = getParent(index);
		}
		
		heap[index] = newValue;
	}
	
	// we only peek the root of the heap
	public int peek() {
		if(isEmpty()) {
			throw new IndexOutOfBoundsException("heap is empty");
		}
		return heap[0];
	}
	
	// heap sort 
	public void sort() {
		int lastHeapIndex = size-1;
		for(int i=0; i<lastHeapIndex; i++) {
			int temp = heap[0];
			heap[0] = heap[lastHeapIndex-i];
			heap[lastHeapIndex-i] = temp;
			
			fixHeapBelow(0, lastHeapIndex-i-1); // we want to exclude the elemnt which we have already sorted
		}
	}
	
	public void printHeap() {
		for(int i =0; i<size; i++) {
			System.out.print(heap[i]);
			System.out.print(",");
		}
		System.out.println();
	}
	
	public boolean isFull() {
		// if the no. of items in the heap is equal to the size of the array then the heap is full
		return size == heap.length;
		
	}
	
	public boolean isEmpty() {
		return size== 0;
	}
	
	public int getChild(int index, boolean left) {
		return 2*index + (left ? 1:2);
	}
	
	public int getParent(int index) {
		return (index-1)/2;
	}
	
	
	
}
