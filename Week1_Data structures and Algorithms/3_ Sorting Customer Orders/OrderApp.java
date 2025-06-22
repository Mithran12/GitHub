public class OrderApp {
    public static void main(String[] args) {
        Order[] orders = {
            new Order(1, "Alice", 2999.99),
            new Order(2, "Bob", 4599.50),
            new Order(3, "Charlie", 1999.75),
            new Order(4, "Diana", 999.00),
            new Order(5, "Evan", 5999.99)
        };

        System.out.println("🟦 Original Orders:");
        Sorter.printOrders(orders);

        System.out.println("\n🔵 Orders Sorted by Bubble Sort:");
        Sorter.bubbleSort(orders);
        Sorter.printOrders(orders);

        orders = new Order[] {
            new Order(1, "Alice", 2999.99),
            new Order(2, "Bob", 4599.50),
            new Order(3, "Charlie", 1999.75),
            new Order(4, "Diana", 999.00),
            new Order(5, "Evan", 5999.99)
        };

        System.out.println("\n🟢 Orders Sorted by Quick Sort:");
        Sorter.quickSort(orders, 0, orders.length - 1);
        Sorter.printOrders(orders);
    }
}
