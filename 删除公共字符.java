import java.util.*;

public class 删除公共字符 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        String x = sca.nextLine();
        String y = sca.nextLine();
      char [] ch = x.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (!y.contains(String.valueOf(ch[i])))
                System.out.print(ch[i]);
        }

    }
}