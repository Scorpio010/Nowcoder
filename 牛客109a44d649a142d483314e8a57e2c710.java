import java.text.DecimalFormat;
import java.util.Scanner;

public class 牛客109a44d649a142d483314e8a57e2c710 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int a = sca.nextInt();
        int b = sca.nextInt();
        int c = sca.nextInt();
        double circumference = a+b+c;
        double p = (double)(a+b+c)/2;
        double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.printf("circumference=%.2f ",circumference);
        System.out.printf("area=%.2f",area);
    }
}
