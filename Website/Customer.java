import java.util.Random;

/**
 * Stores information about a customer and his/her order
 * @author Sean Stock
 * @version 2.6.18
 */
public class Customer
{
    private String firstName;
    private String lastName;
    private String company;
    private String address;
    private String city;
    private String state;
    private int zip;
    private String phone;
    private int custNum;
    private String design;
    private int numFeatures;
    private Website website;
    private int price;
    Random rand = new Random();

    /**
     * Constructor for objects of class Customer
     * @param firstName, lastName, company, address, city, state, zip, phone, design, numFeatres
     */
    public Customer(String firstName, String lastName, String company, String address, String city, String state, int zip, String phone, String design, int numFeatures)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.design = design;
        this.numFeatures = numFeatures;
        custNum = custNumGenerator();
        website = new Website(design);
        price = website.getPrice(numFeatures);
        this.printReceipt();
    }

    /**
     * Generates a random 5 digit number and returns it
     * @return custNum
     */
    public int custNumGenerator()
    {
        int custNum = rand.nextInt(99999) + 10000;
        return custNum;
    }
    
    /**
     * Displays a receipt with information regarding an order
     */
    public void printReceipt()
    {
        System.out.println("Name: " + firstName  + lastName);
        System.out.println("Company: " + company);
        System.out.println("Address: " + address);
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("Zip: " + zip);
        System.out.println("Phone: " + phone);
        System.out.println("Design: " + design);
        System.out.println("Features: " + numFeatures);
        System.out.println("Price: " + price);
    }
}
