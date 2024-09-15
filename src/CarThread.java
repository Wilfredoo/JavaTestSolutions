public class CarThread implements Runnable {
    // Final attributes for CarThread
    final String brand;
    final String model;
    final double price;

    // Constructor to initialize brand, model, and price
    public CarThread(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Override run method to define the thread's behavior
    @Override
    public void run() {
        while (true) {
            // Correctly format the output string
            System.out.println("hello, my name is " + this.brand);
            try {
                // Pause the thread for 300 milliseconds
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        // Create CarThread instances
        CarThread car1 = new CarThread("Audi", "A4", 30000);
        CarThread car2 = new CarThread("BMW", "X5", 50000);

        // Create Thread objects to run CarThread instances
        Thread thread1 = new Thread(car1);
        Thread thread2 = new Thread(car2);

        // Start the threads
        thread1.start();
        thread2.start();

        System.out.println("carThreads are running...");
    }
}
