public class Product {
    // Attributes of the Product class
    String name;
    String description;
    double price;

    // Constructor to initialize Product attributes
    public Product(String name, String desc, double price) {
        this.name = name;
        this.description = desc;
        this.price = price;
    }

    // Method to calculate price with tax
    public final double getPriceWithTax() {
        return price * 1.19; // Example tax rate of 19%
    }

    // Overriding toString method for formatted output
    @Override
    public String toString() {
        return name + " _ " + description + " _ " + price + " EUR";
    }
}
