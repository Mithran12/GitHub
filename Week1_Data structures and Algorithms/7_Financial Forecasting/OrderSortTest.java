public class OrderSortTest {
    public static void main(String[] args) {
        Order[] orders = {
            new Order(101, "Alice", 4500.00),
            new Order(102, "Bob", 12000.50),
            new Order(103, "Charlie", 3000.75),
            new Order(104, "David", 8800.25)
        };

        System.out.println("🟦 Original Orders:");
        Sorter.display(orders);

        // Bubble Sort
        System.out.println("\n🟨 Bubble Sort by total price:");
        Sorter.bubbleSort(orders);
        Sorter.display(orders);

        // Reset and Quick Sort
        orders = new Order[] {
            new Order(101, "Alice", 4500.00),
            new Order(102, "Bob", 12000.50),
            new Order(103, "Charlie", 3000.75),
            new Order(104, "David", 8800.25)
        };

        System.out.println("\n🟥 Quick Sort by total price:");
        Sorter.quickSort(orders, 0, orders.length - 1);
        Sorter.display(orders);
    }
}
