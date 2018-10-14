package com.TopologicalOrdering;
import java.util.*;

/* 1. Topological sorting for the directed acyclic graph is a linear ordering of the vertices such that for every directed edge 
 * 2. uv vertex u comes before the v in the ordering 
 * there can be more than one topological sorting for the given graph 
 * 3. used in the project management 
 * 4. used to order the dependencies of the project in the order 
 * 5. something to do with the hamiltonian path: - it is the path of the graph that visits every node once
 * 6. the topological sort for the hamiltonian path is unique
 * 
 */
public class Main {

	public static void main(String[] args) {
		
		TopologicalOrdering topologicalOrdering = new TopologicalOrdering();
		List<Vertex> graph = new ArrayList<>();
		graph.add(new Vertex("0"));
		graph.add(new Vertex("1"));
		graph.add(new Vertex("2"));
		graph.add(new Vertex("3"));
		graph.add(new Vertex("4"));
		graph.add(new Vertex("5"));
		
		graph.get(2).addNeighbour(graph.get(3));
		graph.get(3).addNeighbour(graph.get(1));
		graph.get(4).addNeighbour(graph.get(0));
		graph.get(4).addNeighbour(graph.get(1));
		graph.get(5).addNeighbour(graph.get(0));
		graph.get(5).addNeighbour(graph.get(2));
	
		for(int i =0; i<graph.size(); i++) {
			if(!graph.get(i).isVisited()) {
				topologicalOrdering.dfs(graph.get(i));
			}
		}
		
		Stack<Vertex> stack = topologicalOrdering.getStack();
		for(int i =0; i<graph.size(); i++) {
			Vertex vertex = stack.pop();
			System.out.println(vertex+ " ");
		}
	}
}
