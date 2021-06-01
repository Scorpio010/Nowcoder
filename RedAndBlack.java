import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class RedAndBlack {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        while(sca.hasNext()){
            int m = sca.nextInt();
            int n = sca.nextInt();
            //换行
            sca.nextLine();
            //二维数组保存
            Character [][] map = new Character[m][n];
            Node start = null;
            for (int i=0;i<m;i++){
                String str = sca.nextLine();
                for (int j=0;j<n;j++){
                    map[i][j] = str.charAt(j);
                    //找到@ 用start结点代替
                    if (str.charAt(j)=='@') start = new Node(i,j);
                }
            }
            //单位数组，表示向不同方向移动
            int [][] direction={{0, 1}, {0, - 1}, {1, 0}, { - 1, 0}};
            bfs(map,direction,start);
            }
}
    //广度优先遍历
    public static void bfs(Character[][] map, int[][] direction, Node start) {
        //定义Node队列 把可走到的结点放进去
        Queue<Node> queue = new LinkedList<Node>();
        //可以走到的二维数组
        boolean[][] visited = new boolean[map.length][map[0].length];
        queue.add(start);
        //当前瓷砖为true
        visited[start.x][start.y] = true;
        int count = 1;
        while (!queue.isEmpty()) {
            //取出队列第一个元素
            Node cur = queue.poll();
            //遍历它上下左右的元素
            for (int i = 0; i < 4; i++) {
                Node next = new Node(cur.x + direction[i][0], cur.y + direction[i][1]);
                //若该元素x,y都在数组内并且不是'#'也不在visited数组里就新增
                if (next.x >= 0 && next.x < map.length && next.y >= 0 && next.y < map[0].length
                        && map[next.x][next.y] != '#' && !visited[next.x][next.y]) {
                    count++;
                    queue.add(next);
                    visited[next.x][next.y] = true;
                }
            }
        }
        System.out.println(count);
    }

}
