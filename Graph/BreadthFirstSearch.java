//BFS(Breadth First Search)    And      DFS(Depth First Search)
import java.util.*;
public class BreadthFirstSearch {
    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    //Create Graph Function --- time complexity ---> )O(n)
    static void createGraph(ArrayList<Edge> graph[]){
        for(int i = 0; i < graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));

        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));
        graph[5].add(new Edge(6, 5, 1));
    }

    //BFS function --- Time complexity ---> )(V+E)
    public static void bfs(ArrayList<Edge> [] graph){
        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[graph.length];
        q.add(0); //Source = 0
        while(!q.isEmpty()){
            int curr = q.remove();
            if(!vis[curr]){  //Visit Curr
                System.out.print(curr + " ");
                vis[curr] = true;
                for(int i = 0; i < graph[curr].size(); i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
        System.out.println();
    }


    //DFS function --- Time complexity ---> O(V+E)
    public static void dfs(ArrayList<Edge> [] graph, int curr, boolean vis[]){
        //Visit
        System.out.print(curr+" ");
        vis[curr] = true;
        for(int i = 0; i < graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                dfs(graph, e.dest, vis);
            }
        }
    }
    


    //HasPath function --> For a given  source and destination, tell if a path exists ---- time complexity --> O(V+E)
    public static boolean hasPath(ArrayList<Edge> [] graph, int src, int dest, boolean vis[]){
        if(src == dest){
            return true;
        }
        vis[src] = true;
        for(int i = 0; i < graph[src].size(); i++){
            Edge e = graph[src].get(i);
            //e.dest is my neighbour
            if(!vis[e.dest] && hasPath(graph, e.dest, dest, vis)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        
        /*       1---3
                /    | \ 
               0     | 5----6
                \    | /
                 2---4
         */

         int v = 7;
         ArrayList<Edge> Graph[] = new ArrayList[v];
         createGraph(Graph);
         //bfs(Graph);
         //dfs(Graph, 0, new boolean[v]);
         System.out.println(hasPath(Graph, 0, 5, new boolean[v]));
    }
}
