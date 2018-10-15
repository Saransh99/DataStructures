package com.CycleDetectionDFS;
import java.util.*;

public class Vertex {

	private String name;
	private boolean visited;
	private boolean beingVisited;
	private List<Vertex> adjacenciesList;
	
	public Vertex(String name) {
		this.name = name;
		this.adjacenciesList = new ArrayList<>();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isVisited() {
		return visited;
	}
	public void setVisited(boolean visited) {
		this.visited = visited;
	}
	public boolean isBeingVisited() {
		return beingVisited;
	}
	public void setBeingVisited(boolean beingVisited) {
		this.beingVisited = beingVisited;
	}
	
	public void addNeighbour(Vertex vertex) {
		this.adjacenciesList.add(vertex);
	}
	
	public List<Vertex> getAdjacenciesList() {
		return adjacenciesList;
	}

	public void setAdjacenciesList(List<Vertex> adjacenciesList) {
		this.adjacenciesList = adjacenciesList;
	}

	@Override 
	public String toString() {
		return ""+this.name;
	}
}
