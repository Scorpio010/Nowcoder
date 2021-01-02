import java.util.Scanner;

public class 牛客bcaf710fb58a44e1b678a890e6e90d7c {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int a = sca.nextInt();
        a=a%100;
        int b = sca.nextInt();
        b=b%100;
        System.out.println((a+b)%100);
    }
}
