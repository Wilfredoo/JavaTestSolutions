public class Robot {
    public static void main(String[] args) {
        // Create instances of HorizontalThread and VerticalThread
        HorizontalThread horizontalThread = new HorizontalThread();
        VerticalThread verticalThread = new VerticalThread();

        // Start both threads
        horizontalThread.start();
        verticalThread.start();
    }
}
