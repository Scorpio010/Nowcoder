import java.util.Scanner;

public class 牛客422f6341cf1b4212a7f8c703df111389 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int weight = sca.nextInt();
        double height = sca.nextDouble()/100;
        double BMI = weight/(Math.pow(height,2));
        System.out.printf("%.2f",BMI);
    }
}
