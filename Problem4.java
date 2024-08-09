public class HandshakeCalculator {
    public static int handshake(int n) {
        if (n < 2) {
            return 0;
        } else {
            return (n - 1) + handshake(n - 1);
        }
    }

    public static void main(String[] args) {
        int people = 4; 
        int result = handshake(people);
        System.out.println("Total number of handshakes: " + result);
    }
}
