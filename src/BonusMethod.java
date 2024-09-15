public class BonusMethod {
    // Method to return different values based on the boolean parameter
    public static String chooseOption(boolean flag) {
        if (flag) {
            return "a";
        } else {
            return "b";
        }
    }

    // Main method to test the chooseOption method
    public static void main(String[] args) {
        // Test cases for the method
        System.out.println(chooseOption(true));  // Expected output: "a"
        System.out.println(chooseOption(false)); // Expected output: "b"
    }
}
