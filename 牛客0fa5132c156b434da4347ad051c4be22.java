import java.util.Scanner;

public class 牛客0fa5132c156b434da4347ad051c4be22 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        double a = sca.nextDouble();
        double b = sca.nextDouble();
        double c = sca.nextDouble();
        double sum = a+b+c;
        double aver = sum/3;
        System.out.printf("%.2f %.2f",sum,aver);
    }
}
