import java.util.ArrayList;

/**
 * Tracks customer data in an array.
 * @author Sean Stock
 * @version 2.6.18
 */
public class Orders
{
    private ArrayList<Customer> customers;
    Customer customer;

    /**
     * Constructor for objects of class Orders
     */
    public Orders()
    {
        customers = new ArrayList<>();
    }

    /**
     * Creates a new customer object and adds it to the array
     */
    public void addCustomer(String firstName, String lastName, String company, String address, String city, String state, int zip, String phone, String design, int numFeatures)
    {
        customer = new Customer(firstName, lastName, company, address, city, state, zip, phone, design, numFeatures);
        customers.add(customer);
    }
}
