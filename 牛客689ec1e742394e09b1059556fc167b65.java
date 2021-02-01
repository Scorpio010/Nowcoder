import java.util.*;
public class 牛客689ec1e742394e09b1059556fc167b65 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
            if(a + b > c && a + c > b && b + c > a){
                if(a == b && b == c){
                    System.out.println("Equilateral triangle!");
                    continue;
                }
                if(a == b || b == c || c == a){
                    System.out.println("Isosceles triangle!");
                    continue;
                }
                System.out.println("Ordinary triangle!");
                continue;
            }
            System.out.println("Not a triangle!");
        }
    }
}