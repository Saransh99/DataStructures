package com.CycleDetectionDFS;
import java.util.*;

public class CycleDetection {

	public void detectCycle(List<Vertex> vertexList) {
		for(Vertex v: vertexList) {
			if(!v.isVisited()) {
				dfs(v);
			}
		}
	}
	
	private void dfs(Vertex vertex) {
		
		System.out.println("DFS on the vertex: "+vertex);
		vertex.setBeingVisited(true);
		for(Vertex v: vertex.getAdjacenciesList()) {
			System.out.println("Visiting the neighbours of the vertex "+ vertex);
			if(v.isBeingVisited()) {
				System.out.println("there is a backward edge so we find the cycle!!");
				return; 
			}
			
			if(!v.isVisited()) {
				System.out.println("vissitng the vertex"+v+"recursively!");
				v.setVisited(true);
				dfs(v);
			}
		}
		System.out.println("set Vertex:"+vertex+" setBeing visited: false and the visited : true");
		vertex.setBeingVisited(false);
		vertex.setVisited(true);
	}
}
