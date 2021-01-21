import java.util.Scanner;

public class 牛客52c18a3b49a54fc98107fbdde1415f90 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        while(sca.hasNext()){
            int a = sca.nextInt();
            int b = sca.nextInt();
            int c = sca.nextInt();
            System.out.println(Max(a,b,c));
        }
    }
    public static int Max(int x,int y, int z){
      int res = x > y? x:y;
      res = res>z?res:z;
      return res;
    }
}
