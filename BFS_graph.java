import java.util.*;

class Graph {
    private int numVertices;
    private List<Integer>[] adjList;

    public Graph(int numVertices) {
        this.numVertices = numVertices;
        adjList = new LinkedList[numVertices];
        for (int i = 0; i < numVertices; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    // Method to add an edge to the graph
    public void addEdge(int source, int destination) {
        if(source!=destination){
        adjList[source].add(destination);  // For directed graph
        adjList[destination].add(source);  // For undirected graph
        }
        else{
            adjList[destination].add(source);
        }

    }

    // BFS traversal method
    public void BFS(int startVertex) {
        //WRITE YOUR CODE HERE
        Boolean[] visited = new Boolean[numVertices];
        Queue<Integer> q = new Queue<Integer>();
        q.add(startVertex);
        while(!q.isEmpty()){
            int src = q.poll();
            for(int neighbour : adjList[src]){
                if(!visited[neighbour]){
                    q.add(neighbour);
                }
            }
            System.out.print(src + " ");
        }
    }
}

class BFS_Graph{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of vertices and edges
        int V = sc.nextInt();
        int E = sc.nextInt();
        
        Graph graph = new Graph(V);

        // Read the edges
        for (int i = 0; i < E; i++) {
            int source = sc.nextInt();
            int destination = sc.nextInt();
            graph.addEdge(source, destination);
        }

        // Read the starting vertex for BFS
        int startVertex = sc.nextInt();
        
        //System.out.println("Breadth-First Traversal (starting from vertex " + startVertex + "):");
        graph.BFS(startVertex);
        sc.close();
    }
}

/*
You are given an integer num. Your task is to maximize its value by swapping at most two digits once. 
Write a program to return the maximum possible value after performing the swap.

If no swap can increase the value, return the original number.

Input Format:
--------------
Line-1: An integer num, where 0 <= num <= 10^8.

Output Format:
--------------
Line-1: Return an integer representing the maximum value obtained after swapping two digits at most once.

Sample Input-1:
---------------
2736

Sample Output-1:
----------------
7236

Explanation:
------------
Swap the digit 2 with 7, resulting in the number 7236, which is the maximum possible value.

Sample Input-2:
---------------
9973

Sample Output-2:
----------------
9973

Explanation:
------------
No swap can make the number larger, so return the original number.



*/
