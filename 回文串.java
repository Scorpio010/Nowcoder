import java.util.*;
public class 回文串 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        while (sca.hasNextLine()) {
            String A = sca.nextLine();
            String B = sca.nextLine();
            int count = 0;
            for (int i = 0; i < A.length() + 1; i++) {
                String C = A.substring(0, i).concat(B).substring(i + 1, A.length() - 1);
                if (ispalindrome(C)) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
    private static boolean ispalindrome(String c) {
        for (int i = 0; i < c.length() / 2; i++) {
            if (c.charAt(i) != c.charAt(c.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}

