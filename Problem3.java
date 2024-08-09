public class DigitCounter {
    public static int countDigit(int n, int digit) {
        if (n == 0) {
            return 0;
        }
        int count = (n % 10 == digit) ? 1 : 0;
        return count + countDigit(n / 10, digit);
    }

    public static void main(String[] args) {
        int number = 220; 
        int digit = 2;
        int result = countDigit(number, digit);
        System.out.println("The digit " + digit + " appears " + result + " times in " + number);
    }
}
