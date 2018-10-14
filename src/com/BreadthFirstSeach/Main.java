package com.BreadthFirstSeach;
/*
 * the breadth first search is a graph algo
 * 1. we visit every node exactly once
 * 2. we visit the neighbours of these new vertices and so on
 * 3. if we want to travel every node of the graph we use the bfs
 * 4. running time: O(V+E)
 * 5. memory complexity is not so good of the bfs as we have to store a lot of references 
 * 6. dfs is more preferred than the bfs algo
 * 7. used in the djisktra algo 
 * 
 * 8. in the bfs we us the queue data type because we need the fifo structure 
 * 
 * STEPS in the bfs:- 
 * 
 * 1. we first add the first node to the queue and then mark it as visited 
 * 2. we then enqueque it and then visit its neighbours and add then to the queue if they are not visited 
 * 3. we then again dequeuq the nodes that we have visited above and then put their neighbours in the queque and then visit theeri child again
 * 4. we do this until the quieuq is not empty 
 * 5. whe the queue is empty then we have got the bfs traversal of the tree or the graph 
 */

public class Main {

	public static void main(String[] args) {
	
		BFS bfsObject = new BFS();
		Vertex vertex1 = new Vertex(1);
		Vertex vertex2 = new Vertex(2);
		Vertex vertex3 = new Vertex(3);
		Vertex vertex4 = new Vertex(4);
		Vertex vertex5 = new Vertex(5);
		Vertex vertex6 = new Vertex(6);
		
		vertex1.addNeighbourVertex(vertex2);
		vertex1.addNeighbourVertex(vertex4);
		vertex4.addNeighbourVertex(vertex5);
		vertex2.addNeighbourVertex(vertex3);
		vertex3.addNeighbourVertex(vertex6);
		vertex6.addNeighbourVertex(vertex2);
		
		bfsObject.bfs(vertex1);
	}
}
