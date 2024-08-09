import java.math.BigInteger;

public class MinNonZeroProductCalculator {
    public static int minNonZeroProduct(int p) {
        long mod = 1000000007;
        long maxVal = (1L << p) - 1;
        long result = maxVal % mod;
        long times = (maxVal - 1) / 2 % (mod - 1);
        result = result * fastPower(maxVal - 1, times, mod) % mod;
        return (int) result;
    }
    public static long fastPower(long base, long exp, long mod) {
        long result = 1;
        while (exp > 0) {
            if ((exp & 1) != 0) {
                result = result * base % mod;
            }
            base = base * base % mod;
            exp >>= 1;
        }
        return result;
    }
    public static void main(String[] args) {
        int p = 3; 
        int result = minNonZeroProduct(p);
        System.out.println("Minimum non-zero product for p = " + p + " is: " + result);
    }
}
