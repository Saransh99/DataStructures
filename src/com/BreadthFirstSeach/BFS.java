package com.BreadthFirstSeach;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {

	public void bfs(Vertex root) {
		
		Queue<Vertex> queue = new LinkedList<>();
		
		// we first set the root element to be visited
		root.setVisited(true);
		queue.add(root); // we add the root to the queue
		
		while(!queue.isEmpty()) {
			
			// we first remove the actual vertex and then loop through all its vertices neighbours
			Vertex actualVertex = queue.remove();
			System.out.println(actualVertex+ " ");
			
			for(Vertex v:actualVertex.getNeighbourList()) {
				if(!v.isVisited()) {
					// if the vertex is not visited we set the node to be visited
					v.setVisited(true);
					queue.add(v);
				}
			}
		}
	}
}
