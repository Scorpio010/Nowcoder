import java.util.Scanner;

public class 牛客a8b018667e274af29b5f76a6673450fc {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        while(sca.hasNext()){
            int n = sca.nextInt();
            if(n%2==0) System.out.println("Even");
            else System.out.println("Odd");
        }
    }
}
