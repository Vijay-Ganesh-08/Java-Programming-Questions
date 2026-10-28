package Algorithm;

/**
 * Expected Input :
 * 5 -- Number Of Paths 
 * From - To - Cost - Distance
 * A B 3 5
 * B C 4 5
 * B D 10 5
 * C D 12 10
 * A E 10 2
 * A D 
 * 
 * Expecte Output :
 * Path: [A, B, D]
 * Minimum Cost: 65
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class FindShortestCostPath {
    static class Edge {
        char destination;
        long cost;

        Edge(char destination, long cost) {
            this.destination = destination;
            this.cost = cost;
        }
    }

    static class NodeCost {
        char node;
        long cost;

        NodeCost(char node, long cost) {
            this.node = node;
            this.cost = cost;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Paths :");
        int numberOfPaths = sc.nextInt();

        Map<Character, List<Edge>> graph = new HashMap<>();

        for (int i = 0; i < numberOfPaths; i++) {
            System.out.print("Enter the From Path :");
            char from = sc.next().charAt(0);

            System.out.print("Enter the To Paths :");
            char to = sc.next().charAt(0);

            System.out.print("Enter the Cost Per Unit :");
            long costPerUnit = sc.nextLong();

            System.out.print("Enter the Distance B/W Paths :");
            long distance = sc.nextLong();

            long totalCost = costPerUnit * distance;

            graph.computeIfAbsent(from, k -> new ArrayList<>())
                    .add(new Edge(to, totalCost));

            graph.computeIfAbsent(to, k -> new ArrayList<>())
                    .add(new Edge(from, totalCost));
        }

        System.out.print("Enter the Source Path :");
        char source = sc.next().charAt(0);

        System.out.print("Enter the Destination Path :");
        char destination = sc.next().charAt(0);

        sc.close();

        findMinimumCostPath(graph, source, destination);
    }

    static void findMinimumCostPath(
            Map<Character, List<Edge>> graph,
            char source,
            char destination) {

        Map<Character, Long> distances = new HashMap<>();
        Map<Character, Character> parent = new HashMap<>();

        PriorityQueue<NodeCost> pq = new PriorityQueue<>(
                Comparator.comparingLong(n -> n.cost));

        distances.put(source, 0L);
        pq.offer(new NodeCost(source, 0L));

        while (!pq.isEmpty()) {
            NodeCost current = pq.poll();
            char currentNode = current.node;
            if (current.cost != distances.getOrDefault(
                    currentNode, Long.MAX_VALUE)) {
                continue;
            }

            if (currentNode == destination) {
                break;
            }

            for (Edge edge : graph.getOrDefault(currentNode, Collections.emptyList())) {
                long newCost = current.cost + edge.cost;
                if (newCost < distances.getOrDefault(edge.destination, Long.MAX_VALUE)) {
                    distances.put(edge.destination, newCost);
                    parent.put(edge.destination, currentNode);
                    pq.offer(new NodeCost(edge.destination, newCost));
                }
            }
        }

        if (!distances.containsKey(destination)) {
            System.out.println("No path exists between "
                    + source + " and " + destination);
            return;
        }

        List<Character> path = new ArrayList<>();

        char current = destination;
        while (true) {
            path.add(current);
            if (current == source) {
                break;
            }
            current = parent.get(current);
        }

        Collections.reverse(path);

        System.out.println("Path: " + path);
        System.out.println("Minimum Cost: " + distances.get(destination));
    }
}
