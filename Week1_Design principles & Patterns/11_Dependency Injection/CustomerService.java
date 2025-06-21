public class CustomerService {
    private final CustomerRepository repository;

    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public void displayCustomer(String id) {
        Customer customer = repository.findCustomerById(id);
        if (customer != null) {
            System.out.println("Customer Found: " + customer.getName() + " (ID: " + customer.getId() + ")");
        } else {
            System.out.println("Customer with ID " + id + " not found.");
        }
    }
}
