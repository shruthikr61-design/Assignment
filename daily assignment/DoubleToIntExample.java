public class DoubleToIntExample {
    public static void main(String[] args) {
        // Store 10.75 in a double variable
        double doubleValue = 10.75;

        // Explicitly typecast double to int (fractional part will be truncated)
        int intValue = (int) doubleValue;

        // Print both values
        System.out.println("Double value: " + doubleValue);
        System.out.println("Integer value after typecasting: " + intValue);
    }
}
