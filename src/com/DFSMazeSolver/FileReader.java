package com.DFSMazeSolver;
import java.io.*;
import java.util.Scanner;

public class FileReader {

	private int[][] map;
	private String fileName;
	private int numOfRows;
	private int numOfColumns;
	private int startPostionCol;
	private int startPostionRow;

	public FileReader(String fileName, int numOfRows, int numOfColumns) {
		this.fileName = fileName;
		this.numOfColumns = numOfColumns;
		this.numOfRows = numOfRows;
		this.map = new int[numOfRows][this.numOfColumns];
	}

	public void parseFile() {
		try {
			Scanner scanner = new Scanner(new File(this.fileName));

			for (int i = 0; i < this.numOfRows; i++) {
				for (int j = 0; j < this.numOfColumns; j++) {

					map[i][j] = scanner.nextInt();

					if (map[i][j] == 2) { // when the map hits the 2 we found the start index of the maze
						startPostionCol = j;
						startPostionRow = i;
					}
				}
			}
			scanner.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int[][] getMap() {
		return map;
	}

	public int getStartPostionCol() {
		return startPostionCol;
	}

	public int getStartPostionRow() {
		return startPostionRow;
	}

}
