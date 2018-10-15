package com.DFSMazeSolver;

public class MazeSolver {

	private int[][] mazeMap;
	private boolean[][] visited;
	private int startPositionCol;
	private int startPositionRow;
	
	public MazeSolver(int[][] mazeMap, int startPositionCol, int startPositionRow) {
		this.mazeMap = mazeMap;
		this.visited = new boolean[mazeMap.length][mazeMap.length];
		this.startPositionCol = startPositionCol;
		this.startPositionRow = startPositionRow;
		
	}
	
	public void findWayOut() {
		
		try {
			
			dfs(startPositionRow, startPositionCol);
			System.out.println("NO solution found!!");
		} catch (RuntimeException e) {
			System.out.println("Route to the exit found!!");
		}
	}
	
	private void dfs(int rowIndex, int colIndex) {
		System.out.println("visiting i="+rowIndex+" j="+ colIndex);
		
		if(this.mazeMap[rowIndex][colIndex]==3) {
			throw new RuntimeException();  // if we found the way out of the puzzle i.e the int 3 is the exit int 
			
		}
		int endOfMap = this.mazeMap.length-1;
		if(visited[rowIndex][colIndex]) {  // if we have already visited the col or the row int we return 
			return;
		}else if(rowIndex<0 || rowIndex>= endOfMap) {
			return;   // if we map to the outside of the map to find the exit we return 
		}else if(colIndex<0 || colIndex>=endOfMap) {
			return;
		}else if(this.mazeMap[rowIndex][colIndex] ==1) { // int 1 is the wall so we return 
			return;
		}else {
			
			this.visited[rowIndex][colIndex] = true;
			
			dfs(rowIndex+1, colIndex); // going down
			dfs(rowIndex, colIndex+1); // going right
			dfs(rowIndex, colIndex-1);	// going left
			dfs(rowIndex-1, colIndex);	// going up
		}
	}
}
