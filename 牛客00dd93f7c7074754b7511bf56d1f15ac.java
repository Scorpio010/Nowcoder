import java.util.Scanner;

public class 牛客00dd93f7c7074754b7511bf56d1f15ac {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        while(sca.hasNext()){
            int n = sca.nextInt();
            for (int i = 0;i<n;i++){
                for (int j=0;j<i+1;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
