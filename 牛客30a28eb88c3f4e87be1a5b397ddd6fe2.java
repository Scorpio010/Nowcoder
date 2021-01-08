import java.util.Scanner;

public class 牛客30a28eb88c3f4e87be1a5b397ddd6fe2 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        while (sca.hasNext()) {
            double ave = 0;
            for(int i = 0;i<5;i++){
                ave+=sca.nextInt();
            }
            System.out.println(ave/5.0);
        }
    }
}
