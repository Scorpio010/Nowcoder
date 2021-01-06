import java.util.Scanner;

public class 牛客c7721f3a1b1a47a783974453e82cadbb {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int h = sca.nextInt();
        int m = sca.nextInt();
        if(m%h==0){
            System.out.println(n-m/h);
        }
        else{
            System.out.println(n-m/h-1);
        }
    }
}
