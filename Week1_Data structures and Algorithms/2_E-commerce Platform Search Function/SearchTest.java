public class SearchTest {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Phone", "Electronics"),
            new Product(103, "Shoes", "Fashion"),
            new Product(104, "Camera", "Electronics"),
            new Product(105, "T-shirt", "Fashion")
        };

        System.out.println("\n🔍 Linear Search for 'Camera':");
        Product p1 = SearchEngine.linearSearch(products, "Camera");
        System.out.println(p1 != null ? "Found: " + p1 : "Not Found");

        System.out.println("\n🔍 Binary Search for 'Camera':");
        Product p2 = SearchEngine.binarySearch(products, "Camera");
        System.out.println(p2 != null ? "Found: " + p2 : "Not Found");
    }
}
