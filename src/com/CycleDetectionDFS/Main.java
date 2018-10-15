package com.CycleDetectionDFS;
import java.util.*;

/*
 * 1. cycles are avoided in the os because it could lead to the deadlocks in the os 
 * 2. implemented using the dfs
 * 3. to detect the cycle we use the 2 terms:- visited and being visited 
 * 4. if the node has all its neighbour visisted then it is called as visited 
 * 5. if the node has still its neighbours being visisted then its state is called as being visited 
 * 6. thus if we backtrack and found the starting node still in the being visited state then we found the cycle in the graph
 *  
 *  this implementation will detect all the cycles in the graph 
 */
public class Main {

	public static void main(String[] args) {
	
		Vertex vertex1 = new Vertex("1");
		Vertex vertex2 = new Vertex("2");
		Vertex vertex3 = new Vertex("3");
		Vertex vertex4 = new Vertex("4");
		Vertex vertex5 = new Vertex("5");
		Vertex vertex6 = new Vertex("6");
		
		// neghbours in the directed graph
		vertex1.addNeighbour(vertex2);
		vertex2.addNeighbour(vertex3);
		vertex3.addNeighbour(vertex1);
		vertex4.addNeighbour(vertex1);
		vertex4.addNeighbour(vertex5);
		vertex5.addNeighbour(vertex6);
		vertex6.addNeighbour(vertex4);
		
		List<Vertex> vertexList = new ArrayList<>();
		vertexList.add(vertex1);
		vertexList.add(vertex2);
		vertexList.add(vertex3);
		vertexList.add(vertex4);
		vertexList.add(vertex5);
		vertexList.add(vertex6);
		
		CycleDetection cycleDetection = new CycleDetection();
		cycleDetection.detectCycle(vertexList);
	}
}
