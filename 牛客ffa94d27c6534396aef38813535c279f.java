import java.util.Scanner;

public class 牛客ffa94d27c6534396aef38813535c279f {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        while(sca.hasNext()){
            String str = sca.next();
            int index = str.indexOf(".");
            System.out.println(str.charAt(index-1));
        }
    }
}
