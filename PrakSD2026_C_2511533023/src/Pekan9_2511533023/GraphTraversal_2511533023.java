package Pekan9_2511533023;

import java.util.*;

public class GraphTraversal_2511533023 {
    private Map<String, List<String>> graph_3023 = new HashMap<>();

    // Menambahkan edge (graf tak berarah)
    public void addEdge(String node1_3023, String node2_3023) {
        graph_3023.putIfAbsent(node1_3023, new ArrayList<>());
        graph_3023.putIfAbsent(node2_3023, new ArrayList<>());
        graph_3023.get(node1_3023).add(node2_3023);
        graph_3023.get(node2_3023).add(node1_3023);
    }

    // Menampilkan graf awal
    public void printGraph() {
        System.out.println("Graf Awal (Adjacency List):");
        for (String node : graph_3023.keySet()) {
            System.out.print(node + " -> ");
            List<String> neighbors_3023 = graph_3023.get(node);
            System.out.println(String.join(", ", neighbors_3023));
        }
        System.out.println();
    }

    // DFS rekursif
    public void dfs(String start_3023) {
        Set<String> visited_3023 = new HashSet<>();
        System.out.println("Penelusuran DFS:");
        dfsHelper(start_3023, visited_3023);
        System.out.println();
    }

    private void dfsHelper(String current_3023, Set<String> visited_3023) {
        if (visited_3023.contains(current_3023)) return;
        visited_3023.add(current_3023);
        System.out.print(current_3023 + " ");
        for (String neighbor_3023 : graph_3023.getOrDefault(current_3023, new ArrayList<>())) {
            dfsHelper(neighbor_3023, visited_3023);
        }
    }
 // BFS iteratif
    public void bfs(String start_3023) {
        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.add(start_3023);
        visited.add(start_3023);
        System.out.println("Penelusuran BFS:");
        while (!queue.isEmpty()) {
            String current = queue.poll();
            System.out.print(current + " ");
            for (String neighbor_3023 : graph_3023.getOrDefault(current, new ArrayList<>())) {
                if (!visited.contains(neighbor_3023)) {
                    queue.add(neighbor_3023);
                    visited.add(neighbor_3023);
                }
            }
        }
        System.out.println();
    }

    // Main
    public static void main(String[] args) {
        GraphTraversal_2511533023 graph_3023 = new GraphTraversal_2511533023();

        // Contoh graf: A-B, A-C, B-D, B-E
        graph_3023.addEdge("A", "B");
        graph_3023.addEdge("A", "C");
        graph_3023.addEdge("B", "D");
        graph_3023.addEdge("B", "E");
        // Cetak graf awal
        System.out.println("Garf Awal adalah: ");
        graph_3023.printGraph();
        // Lakukan penelusuran
        graph_3023.dfs("A");
        graph_3023.bfs("A");
    }
}
