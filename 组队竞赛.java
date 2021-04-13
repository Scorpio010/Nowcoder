
import java.util.*;

public class 组队竞赛 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int[] group=new int[3*n];
        for (int i=0;i<group.length;i++){
            group[i] = sca.nextInt();

        }
        Arrays.sort(group);
        int ans=0;
        for (int i=group.length-2;i>=n;i=i-2){
             ans+=group[i];
        }
        System.out.println(ans);
    }
}
