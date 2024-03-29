package zest;


public class PalindromeTwo {

    static int v;

    public static boolean isPalindrome(int x) {

        if (x < 0) return false;
        if (x == 0) return true; // I added this line to fix a bug where the integer 0 would return an incorrect false.
        if (x % 10 == 0) return false;
        if (x < 100 && x % 11 == 0) return true; //lines 13 and 14 could be omitted without changing code behavior
        if (x < 1000 && ((x / 100) * 10 + x % 10) % 11 == 0) return true;

        v = x % 10;
        x = x / 10;

        while (x - v > 0) {
            v = v * 10 + x % 10;
            x /= 10;
        }
        if (v > x) {
            v /= 10;
        }


        return v == x;
    }
}
