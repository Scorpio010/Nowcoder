import java.util.Scanner;

public class 牛客7eb4df4d52c44d309081509cf52ecbc4 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        while (sca.hasNext()) {
            String str = sca.nextLine();
            if (IsWhat(str)) {
                System.out.println("Vowel");
            } else System.out.println("Consonant");
        }
    }

    public static boolean IsWhat(String n) {
        String a[] = {"A", "a", "E", "e", "I", "i", "O", "o", "U", "u"};
        for (int i = 0; i < a.length; i++) {
            if (n.equals(a[i])) {
                return true;
            }
        }
        return false;
    }
}