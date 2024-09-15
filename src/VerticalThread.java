public class VerticalThread extends Thread {
    // Run method to handle the forward and backward movement
    @Override
    public void run() {
        while (true) {
            // Randomly select forward or backward movement
            if (Math.random() < 0.5) {
                System.out.println("forward...");
            } else {
                System.out.println("backward...");
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
