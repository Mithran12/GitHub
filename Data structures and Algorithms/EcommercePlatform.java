import java.util.*;

class Product implements Comparable<Product> {
    int productId;
    String productName;
    String category;

    public Product(int id, String name, String category) {
        this.productId = id;
        this.productName = name;
        this.category = category;
    }

    public String toString() {
        return "[" + productId + ", " + productName + ", " + category + "]";
    }

    public int compareTo(Product other) {
        return this.productName.compareToIgnoreCase(other.productName);
    }
}

public class EcommercePlatform {

    public static Product linearSearch(Product[] products, String name) {
        for (Product product : products) {
            if (product.productName.equalsIgnoreCase(name)) {
                return product;
            }
        }
        return null;
    }

    // Binary Search
    public static Product binarySearch(Product[] products, String name) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int comparison = products[mid].productName.compareToIgnoreCase(name);

            if (comparison == 0) {
                return products[mid];
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Shoes", "Fashion"),
            new Product(102, "Laptop", "Electronics"),
            new Product(103, "Coffee Mug", "Kitchen"),
            new Product(104, "Phone", "Electronics"),
            new Product(105, "Notebook", "Stationery")
        };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product name to search:");
        String searchName = sc.nextLine();

        Product foundLinear = linearSearch(products, searchName);
        System.out.println("Linear Search Result: " + foundLinear);

        Arrays.sort(products);

        Product foundBinary = binarySearch(products, searchName);
        System.out.println("Binary Search Result: " + foundBinary);
    }
}
