package Streams.OrderProductList;

import java.util.List;

public class Order {
    int orderId;
    List<Product> products;

    public Order(int orderId, List<Product> products) {
        this.orderId = orderId;
        this.products = products;
    }

    public int getOrderId() {
        return orderId;
    }

    public List<Product> getProducts() {
        return products;
    }

    public double getTotalCost() {
        return products.stream()
                .mapToDouble(Product::getCost)
                .sum();
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", totalCost=" + getTotalCost() +
                '}';
    }
}
