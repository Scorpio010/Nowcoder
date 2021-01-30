import java.util.Scanner;

public class 牛客f05358b9e8164b27871c87d3097f4dab {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        while(sca.hasNext()){
            int a = sca.nextInt();
            int b = sca.nextInt();
            if (a>b) System.out.println(a+">"+b);
            else if (a<b) System.out.println(a+"<"+b);
            else System.out.println(a+"="+b);
        }
    }
}
