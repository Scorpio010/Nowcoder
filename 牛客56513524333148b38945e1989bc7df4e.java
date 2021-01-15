import java.util.Scanner;

public class 牛客56513524333148b38945e1989bc7df4e {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        while(sca.hasNext()){
            int n = sca.nextInt();
            if(n>=0&&n<60) System.out.println("Fail");
            else if(n<=100&&n>=60) System.out.println("Pass");
        }
    }
}
