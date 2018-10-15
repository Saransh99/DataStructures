package com.DFSMazeSolver;

/* RUles for the maze solver
 * 1. in the map the int 1 is the wall 
 * 2. in the map the int 2 is the starting point 
 * 3. in the map the int 3 is the ending point 
 * 4. in the map the int 0 is the valid path i.e there is no wall in the int 0
 * 
 * we use the dfs to solve the problem 
 * we read the map using the scanner from the file strored in the system
 * we scan the map from row and column and if we found the int to be 2 it is the starting point of the maze puzzle 
 * 
 * 
 */
public class Main {

	public static void main(String[] args) {
		
		FileReader fileReader = new FileReader("C:\\Users\\PC\\eclipse-workspace\\DataStructuresPrac\\src\\com\\DFSMazeSolver\\maze.txt", 5, 5);
		fileReader.parseFile();
		
		MazeSolver mazeSolver = new MazeSolver(fileReader.getMap(), fileReader.getStartPostionRow(), fileReader.getStartPostionCol());
		mazeSolver.findWayOut();
	}
}
