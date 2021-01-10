import java.io.*;
public class 牛客44d2d63103664913bc243d3836b4f341 {
    public static void main(String[] args) throws Exception{
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String h = null;
        char c ;
        while ((h = sc.readLine()) != null){
            c = h.charAt(0);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
        }
    }
}

