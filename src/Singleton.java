public class Singleton {
    // Static variable to hold the single instance of the class
    private static Singleton instance;

    // Private constructor to prevent instantiation from outside the class
    private Singleton() {
        // Initialize any resources or setup code if needed
    }

    // Public method to provide access to the instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton(); // Create the instance if it does not exist
        }
        return instance; // Return the existing instance
    }

    // Example method to demonstrate functionality
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }

    // Main method to test the Singleton implementation
    public static void main(String[] args) {
        // Get the single instance of Singleton
        Singleton singleton = Singleton.getInstance();

        // Use the singleton instance
        singleton.showMessage();
    }
}
