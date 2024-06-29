//Bipartite Graph
//A Bipartite Graph is a graph whose vertices can be divided into two independent sets, U and V such that every edge
//(u, v) either connects a vertex from U to V or a vertex from V to U. In other words, for every edge (u, v), either u
//belongs to U and v to V, or u belongs to V and v to U. We can also say that there is no edge that connects vertices of same set
import java.util.*;
public class BipartiteGraph {
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

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
    }
    //Function to check is Bipartite(time complexity ---> O(V+E))
    public static boolean isBipartite(ArrayList<Edge> []graph){
        int col[] = new int[graph.length];
        for(int i = 0; i < col.length; i++){
            col[i] = -1; //No Color
        }
            Queue<Integer> q = new LinkedList<>();
            for(int i = 0; i < graph.length; i++){
                if(col[i] == -1){  //BFS
                    q.add(i);
                    col[i] = 0; //Yellow
                    while(!q.isEmpty()){
                        int curr = q.remove();
                        for(int k = 0; k < graph[curr].size(); k++){
                            Edge e = graph[curr].get(k);  //E.dest
                            if(col[e.dest] == -1){
                                int nextCol = col[curr] == 0 ? 1 :0;
                                col[e.dest] = nextCol;
                                q.add(e.dest);
                            }
                            else if(col[e.dest] == col[curr]){
                                return false; //Not bipartite
                        }
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // if a graph doesn't have cycles by default it is a bipartite graph
        /*       0--------2
                /        /
               /        /
               1       4
                \     / 
                 \  /
                   3      
         */

         int v = 5;
         ArrayList<Edge> Graph[] = new ArrayList[v];
         createGraph(Graph);
         System.out.println(isBipartite(Graph));
    }
}
