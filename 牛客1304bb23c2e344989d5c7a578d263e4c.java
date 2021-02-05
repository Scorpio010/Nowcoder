import java.util.Scanner;

public class 牛客1304bb23c2e344989d5c7a578d263e4c {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        while (sca.hasNext()){
            int n = sca.nextInt();
            for (int i=0;i<n;i++){
                for (int j=0;j<n;j++){
                    System.out.printf("* ");
                }
                System.out.println();
            }
        }
    }
}

