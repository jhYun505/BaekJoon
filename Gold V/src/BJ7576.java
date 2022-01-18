import java.io.*;
import java.util.*;

public class BJ7576 {
    public static int M, N;
    static int day;
    public static int[][] Box;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    static class Tomato {
        int x, y;
        int day;
        public Tomato(int x, int y, int day) {
            this.x = x;
            this.y = y;
            this.day = day;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        Box = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                Box[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        BFS_Serach();
    }

    static void BFS_Serach() {
        Queue<Tomato> queue = new LinkedList<>();
        day = 0;
        //add item to queue
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(Box[i][j] == 1) {
                    queue.offer(new Tomato(j,i, day));
                }
            }
        }
        while(!queue.isEmpty()) {
            Tomato tomato = queue.poll();
            day = tomato.day;
            for (int i = 0; i < 4; i++) {
                int nx = tomato.x + dx[i];
                int ny = tomato.y + dy[i];

                if(nx >= 0 && nx < M && ny >= 0 && ny < N){
                   if(Box[ny][nx] == 0) {
                       Box[ny][nx] = 1;
                       queue.offer(new Tomato(nx, ny, day+1));
                   }
                }
            }
        }

        if(isClear()){
            System.out.println(day);
        }else{
            System.out.println(-1);
        }
    }

    static boolean isClear(){
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(Box[i][j] == 0)
                    return false;
            }
        }
        return true;
    }
}
