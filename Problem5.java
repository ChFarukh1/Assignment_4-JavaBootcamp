public class GCDCalculator {
    public static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return gcd(y, x % y);
        }
    }

    public static void main(String[] args) {
        int x = 56;
        int y = 98; 
        int result = gcd(x, y);
        System.out.println("GCD of " + x + " and " + y + " is: " + result);
    }
}
