public class Clothing extends Product {
    // Additional attributes for the Clothing class
    private int size; // Size of the clothing item
    private String material; // Material of the clothing item

    // Constructor to initialize all attributes
    public Clothing(String name, String desc, double price, int size, String material) {
        super(name, desc, price); // Call the constructor of the superclass (Product)
        this.size = size; // Initialize size
        this.material = material; // Initialize material
    }

    // Overriding the toString method to include new attributes
    @Override
    public String toString() {
        return super.toString() + " _ Size: " + size + " _ Material: " + material;
    }

    // Main method for testing the Clothing class
    public static void main(String[] args) {
        // Create a Clothing object
        Clothing clothing = new Clothing("T-Shirt", "Comfortable cotton T-shirt", 19.99, 42, "Cotton");

        // Display the Clothing object's details using the overridden toString method
        System.out.println(clothing.toString());
    }
}
