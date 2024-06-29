//Topological sort using BFS Algorithm(Kahn's Algorithm)
import java.util.*;
public class TopologicalSortUsingBFS {
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

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }

        //Helper function to calculate vertex
    public static void calcIndeg(ArrayList<Edge> graph[], int indeg[]){
        for(int i = 0; i < graph.length; i++){
            int v = i;
            for(int j = 0; j < graph[v].size(); j++){
                Edge e = graph[v].get(j);
                indeg[e.dest]++;
            }
        }
    }

        //Sort Function
    public static void topSort(ArrayList<Edge> graph[]){
        int indeg[] = new int[graph.length];
        calcIndeg(graph, indeg);
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < indeg.length; i++){
            if(indeg[i] == 0){
                q.add(i);
            }
        }
        //BFS
        while(!q.isEmpty()){
            int curr = q.remove();
            System.out.print(curr+" ");      //Printing Topological sort
            for(int i = 0; i< graph[curr].size(); i++){
                Edge e = graph[curr].get(i);
                indeg[e.dest]--;
                if(indeg[e.dest] == 0){
                    q.add(e.dest);
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int v = 6;
        ArrayList<Edge> Graph[] = new ArrayList[v];
        createGraph(Graph);
        topSort(Graph);
   }
}
