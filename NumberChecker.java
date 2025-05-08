// File: NumberChecker.java
public class NumberChecker {

    // Phương thức kiểm tra số chẵn lẻ và in ra kết quả
    public void checkNumbers(int[] numbers) {
        for (int number : numbers) { // Vòng lặp
            if (number % 2 == 0) {   // Lệnh rẽ nhánh
                System.out.println(number + " là số chẵn");
            } else {
                System.out.println(number + " là số lẻ");
            }
        }
    }
}
