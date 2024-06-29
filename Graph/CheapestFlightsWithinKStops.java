// //Cheapest Flighyts within K stops
// //There are n cities connected by some number of flights. You are given an array of flights where flights[i] = [from, to, price]
// //indicates that there is a flight. You are also given three integers src, dst, and k, return the cheapest price from src to dst 
// //with at most k stops/ If there is no such route, return - 1.

import java.util.*;

public class CheapestFlightsWithinKStops {

    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int wt) {
            this.src = s;
            this.dest = d;
            this.wt = wt;
        }
    }

    public static void createGraph(int flights[][], ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < flights.length; i++) {
            int src = flights[i][0];
            int dest = flights[i][1];
            int wt = flights[i][2];

            Edge e = new Edge(src, dest, wt);
            graph[src].add(e);
        }
    }

    static class Info {
        int v;
        int cost;
        int stops;

        public Info(int v, int c, int s) {
            this.v = v;
            this.cost = c;
            this.stops = s;
        }
    }

    public static int cheapestFlight(int n, int flights[][], int src, int dest, int k) {
        ArrayList<Edge> graph[] = new ArrayList[n];
        createGraph(flights, graph);

        int dist[] = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        Queue<Info> q = new LinkedList<>();
        q.add(new Info(src, 0, 0));

        while (!q.isEmpty()) {
            Info curr = q.remove();
            if (curr.v == dest) continue; // Continue if destination reached
            if (curr.stops > k) continue; // Skip if exceeded max stops
            for (Edge e : graph[curr.v]) {
                int u = e.src;
                int v = e.dest;
                int wt = e.wt;

                if (dist[u] != Integer.MAX_VALUE && curr.cost + wt < dist[v]) {
                    dist[v] = dist[u] + wt;
                    q.add(new Info(v, dist[v], curr.stops + 1));
                }
            }
        }
        // dist[dest
        if (dist[dest] == Integer.MAX_VALUE) {
            return -1;
        } else {
            return dist[dest];
        }
    }

    public static void main(String[] args) {
        int n = 4;
        int flights[][] = {{0, 1, 100}, {1, 2, 100}, {2, 0, 100}, {1, 3, 600}, {2, 3, 200}};
        int src = 0, dst = 3, k = 1;
        System.out.println(cheapestFlight(n, flights, src, dst, k));
    }
}
