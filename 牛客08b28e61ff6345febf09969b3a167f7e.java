import java.util.Scanner;

public class 牛客08b28e61ff6345febf09969b3a167f7e {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        double wei = sca.nextDouble();
        double h = sca.nextDouble();
        double BMI = wei/(h*h);
        if (BMI>=18.5&&BMI<=23.9) System.out.println("Normal");
        else System.out.println("Abnormal");
    }
}
