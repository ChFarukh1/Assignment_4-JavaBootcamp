public class PalindromeChecker {
    public static boolean isPalindrome(String s, int len) {
        if (len <= 1) {
            return true;
        } else if (s.charAt(0) != s.charAt(len - 1)) {
            return false;
        } else {
            return isPalindrome(s.substring(1, len - 1), len - 2);
        }
    }

    public static void main(String[] args) {
        String str = "madam"; 
        boolean result = isPalindrome(str, str.length());
        System.out.println("Is the string a palindrome? " + result);
    }
}
