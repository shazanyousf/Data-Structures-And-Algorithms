//Cycle Detection Directed Graph
import java.util.*;
public class CycleDetectionUndirectedGraph {
    static class Edge{
        int src;
        int dest;
        

        public Edge(int s, int d){
            this.src = s;
            this.dest = d;
            
        }
    }

    //Create Graph Function --- time complexity ---> )O(n)
    static void createGraph(ArrayList<Edge> graph[]){
        for(int i = 0; i < graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 3));

    }
    //Function to detect cycle in graph  --- time complexity O(V+E)
    public static boolean detectCycle(ArrayList<Edge> [] graph){
        boolean vis[] = new boolean[graph.length];
        for(int i = 0; i<graph.length; i++){
            if(!vis[i]){
                if(detectCycleUtil(graph, vis, i, -1)){
                return true;
                //Cycle exists in one of the parts
                }
            }
        }
        return false;
    }
    //Helper Function to detect cycle in graph 
    public static boolean detectCycleUtil(ArrayList<Edge> [] graph, boolean vis[], int curr, int par){
        vis[curr] = true;
        for(int i = 0; i< graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            //case 3
            if(!vis[e.dest] && detectCycleUtil(graph, vis, e.dest, curr)){
            return true;
        }
        //case 1
        else if(vis[e.dest] && e.dest != par){
            return true;
            }
            //case 2 --> do nothing --> continue
        }
        return false;
    }
        
    public static void main(String[] args) {
        
        /*       0-------3
                /|       | 
               1 |       |
                \|       |
                 2       4
         */

         int v = 5;
         ArrayList<Edge> Graph[] = new ArrayList[v];
         createGraph(Graph);
         System.out.println(detectCycle(Graph));
    }
}


