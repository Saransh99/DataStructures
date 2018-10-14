package com.depthfirstSearch;
import java.util.ArrayList;
import java.util.List;

/*	running time O(V+E)
 * 
 * This is the stack implementation of the dfs 
 * 	1. 	dfs can be implemented with the recursion as well 
 * 	2. 	in the depth first search we are going to visit the farthest node first before the neighbours 
	3. 	time complexity is same as the bfs the memory complexity of the dfs is better than the bfs 
	4.  can implemented with the recursion or iteration 
	5.	as far as the performance is concerned the recursion and the iteration is same 
	6.	this is implemented using the stack lifo the last in first out 
	7.	so for the dfs we use the stacks and for the bfs we use the queues 
	8.	in the dfs we check the unmarked nodes recursilvelty and when the nodes have no unvisited node then we backtrack to the parent node 
	9.	this is used in the backtracking algorithm as well 
	10.	topological ordering 
	11.	finding the strongly connected components in a graph 
	12.	used in the recommended section in the youtube 
	13.	detecting cycle 
	14.	generationg mazes or finding the way out of the maze 
	15.	check whether the graph is acyclic or not 
	// in the dfs the direction of the visiting the nodes 
 */
public class Main {

	public static void main(String[] args) {
		Vertex v1 = new Vertex("1");
		Vertex v2 = new Vertex("2");
		Vertex v3 = new Vertex("3");
		Vertex v4 = new Vertex("4");
		Vertex v5 = new Vertex("5");
		
		List<Vertex> list = new ArrayList<>();
		v1.addNeighbour(v2);
		v1.addNeighbour(v3);
		v3.addNeighbour(v4);
		v4.addNeighbour(v5);
		
		list.add(v1);
		list.add(v2);
		list.add(v3);
		list.add(v4);
		list.add(v5);
		
		DFS dfsObject = new DFS();
		dfsObject.dfs(list);
	}
}
