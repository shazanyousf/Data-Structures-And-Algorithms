//Connecting Cities With Minimum cost
//Find the minimum cost for connecting all the cities on the map
import java.util.*;

public class ConnectingCitiesWithMinimumCost {

    static class Edge {
        int dest;
        int wt;

        public Edge(int d, int wt) {
            this.dest = d;
            this.wt = wt;
        }
    }

    public static int minimumCostConnectCities(int[][] cities) {
        int n = cities.length;

        // Create a graph
        List<List<Edge>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        // Build the graph
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (cities[i][j] != 0) {
                    graph.get(i).add(new Edge(j, cities[i][j]));
                    graph.get(j).add(new Edge(i, cities[i][j]));
                }
            }
        }

        // Minimum Spanning Tree using Prim's Algorithm
        boolean[] visited = new boolean[n];
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        minHeap.offer(new int[]{0, 0}); // {price, node}

        int cost = 0;

        while (!minHeap.isEmpty()) {
            int[] info = minHeap.poll();
            int price = info[0];
            int city = info[1];

            if (visited[city]) continue;
            visited[city] = true;
            cost += price;

            for (Edge neighbor : graph.get(city)) {
                if (!visited[neighbor.dest]) {
                    minHeap.offer(new int[]{neighbor.wt, neighbor.dest});
                }
            }
        }

        // Check if all cities are connected
        for (boolean v : visited) {
            if (!v) return -1;
        }

        return cost;
    }

    public static void main(String[] args) {
        int cities[][] = {{0, 1, 2, 3, 4},
                          {1, 0, 5, 0, 7},
                          {2, 5, 0, 6, 0},
                          {3, 0, 6, 0, 0},
                          {4, 7, 0, 0, 0}};

        System.out.println(minimumCostConnectCities(cities));
    }
}

