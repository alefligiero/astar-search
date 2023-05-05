package astar_search;

public class Program {

	public static void main(String[] args) {

		// Creating graph
		Graph map = new Graph();
		
		// Instantiating the AStar class with the destiny in the parameter
		AStar astar = new AStar(map.bucharest);
		// Calling the recursive function with the beginning vertex
		astar.recursiveSearch(map.arad);

	}

}
