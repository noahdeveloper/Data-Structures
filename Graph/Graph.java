package Graph;

import java.util.LinkedList;

/*
 * Noe Pineda 10/16/2018
 * Explanation: A graph is a non-linear data structure which relates
 * notes to each other in the form of edges and vertices. Graphs can be 
 * used to represent space.
 */

//Using an array of an integer linked list.
public class Graph {
	int V;
	LinkedList<Integer>[] adjListArray;
	
	//O(n)
	//Initializes each array index with a new integer linked list
	public Graph(int V) {
		this.V = V;
		
		adjListArray = new LinkedList[V];
		
		for(int i = 0; i < V; i++) {
			adjListArray[i] = new LinkedList<Integer>();
		}
	}
	
	//O(1)
	//Adds a new vertex/node and its destination to the graph
	public void addEdge(int src, int dest) {
		this.adjListArray[src].addFirst(dest);
		this.adjListArray[dest].addFirst(src);
	}
	
	//O(n^2)
	//Iterates through each vertex/node and prints each destination.
	public void printGraph() {
		for(int v = 0; v < this.V; v++) {
			System.out.println("Adjecency list of vertex " + v);
			
			for(Integer pCrawl: this.adjListArray[v]) {
				System.out.print(pCrawl + " -> ");
			}
			System.out.println("\n");
		}
	}
	
	//O(n^2)
	//Gets the vertex/node in the graph and iterates through each of 
	//its destination.
	public void findNeighbors(Integer src) {
		System.out.print("Neighbors of " + src + ": ");
		
		for(Integer pCrawl: this.adjListArray[src]) {
			System.out.print(pCrawl + " -> ");
		}
		
		System.out.println("\n");
	}
	
	
}
