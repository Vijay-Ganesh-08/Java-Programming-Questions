package Streams.OrderProductList;

/**
 * Expected Input : ** As Below **
 * Expected Output : 
 * Highest Order Cost: 82000.0
 * Orders with highest cost:
 * Order{orderId=1, totalCost=82000.0}
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Order> orders = Arrays.asList(
                new Order(1, List.of(new Product("Laptop", 80000), new Product("Mouse", 2000))),
                new Order(2, List.of(new Product("Phone", 45000), new Product("Charger", 2000))),
                new Order(3, List.of(new Product("Tablet", 30000), new Product("Cover", 1000))),
                new Order(4, List.of(new Product("Desktop", 60000), new Product("Keyboard", 5000))));

        // Step 1: find max total cost
        double maxCost = orders.stream()
                .mapToDouble(Order::getTotalCost)
                .max()
                .orElse(0);

        // Step 2: collect orders that match this max cost
        List<Order> highestOrders = orders.stream()
                .filter(o -> o.getTotalCost() == maxCost)
                .collect(Collectors.toList());

        System.out.println("Highest Order Cost: " + maxCost);
        System.out.println("Orders with highest cost:");
        highestOrders.forEach(System.out::println);
    }

}
