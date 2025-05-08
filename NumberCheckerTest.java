import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class NumberCheckerTest {

    public static void main(String[] args) {
        NumberChecker checker = new NumberChecker();

        // Test số chẵn
        int[] evenNumbers = {2};
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        checker.checkNumbers(evenNumbers);
        String output = out.toString();
        if (output.contains("là số chẵn")) {
            System.out.println("Test số chẵn: PASSED");
        } else {
            System.out.println("Test số chẵn: FAILED");
        }

        // Test số lẻ
        int[] oddNumbers = {3};
        out.reset();
        checker.checkNumbers(oddNumbers);
        output = out.toString();
        if (output.contains("là số lẻ")) {
            System.out.println("Test số lẻ: PASSED");
        } else {
            System.out.println("Test số lẻ: FAILED");
        }

        // Test Path Coverage: lẻ → chẵn → lẻ
        int[] numbers = {1, 2, 3}; // Bao phủ đường đi: lẻ → chẵn → lẻ
        out.reset();
        checker.checkNumbers(numbers);
        output = out.toString();
        if (output.contains("1 là số lẻ") && 
            output.contains("2 là số chẵn") && 
            output.contains("3 là số lẻ")) {
            System.out.println("Test Path Coverage: PASSED");
        } else {
            System.out.println("Test Path Coverage: FAILED");
            // In ra kết quả thực tế để debug
            System.out.println("Actual Output: " + output);
        }
    }
}
