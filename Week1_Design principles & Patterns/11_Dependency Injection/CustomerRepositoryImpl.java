import java.util.HashMap;
import java.util.Map;

public class CustomerRepositoryImpl implements CustomerRepository {
    private Map<String, Customer> customerMap = new HashMap<>();

    public CustomerRepositoryImpl() {
        customerMap.put("101", new Customer("101", "Alice"));
        customerMap.put("102", new Customer("102", "Bob"));
    }

    @Override
    public Customer findCustomerById(String id) {
        return customerMap.get(id);
    }
}
