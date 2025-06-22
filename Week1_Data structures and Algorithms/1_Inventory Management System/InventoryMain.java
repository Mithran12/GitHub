public class InventoryMain {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        inventory.addProduct(new Product(1, "Laptop", 10, 55000));
        inventory.addProduct(new Product(2, "Keyboard", 25, 700));
        inventory.addProduct(new Product(3, "Mouse", 30, 400));

        inventory.viewInventory();

        inventory.updateProduct(2, 50, 650);

        inventory.deleteProduct(3);

        inventory.viewInventory();
    }
}
