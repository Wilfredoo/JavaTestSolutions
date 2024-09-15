public class HorizontalThread extends Thread {
    // Run method to handle the left and right movement
    @Override
    public void run() {
        while (true) {
            // Randomly select left or right movement
            if (Math.random() < 0.5) {
                System.out.println("left...");
            } else {
                System.out.println("right...");
            }

            // Sleep for a random time between movements
            try {
                Thread.sleep((int) (Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
