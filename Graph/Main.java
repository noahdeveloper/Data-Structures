package Graph;

public class Main {

	public static void main(String[] args) {
		Graph graph = new Graph(5);
		graph.addEdge(0, 1);
		graph.addEdge(0, 4);
		graph.addEdge(1, 2);
		graph.addEdge(1, 3);
		graph.addEdge(1, 4);
		graph.addEdge(2, 3);
		graph.addEdge(3, 4);
		
		//graph.removeEdge(0);
		
		//graph.findNeighbors(2);
		
		graph.printGraph();
	}

}
