import java.io.*;
import java.util.*;

public class BJ2667 {
    static int[][] Map;
    static int N;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        int danji = 1;
        Map = new int[N][N];
        for (int i = 0; i < N; i++) {
            String[] tokens = br.readLine().split("");
            for (int j = 0; j < N; j++) {
                Map[i][j] = Integer.parseInt(tokens[j]);
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(Map[i][j] == 1) {
                    danji++;
                    DFS_Search(i,j,danji);
                }
            }
        }
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(Map[i][j] > 0) {
                    hashMap.put(Map[i][j], hashMap.getOrDefault(Map[i][j],0)+1);
                }
            }
        }
        System.out.println(hashMap.keySet().size());
        ArrayList<Integer> list = new ArrayList<>();
        for(int key : hashMap.keySet()) {
            list.add(hashMap.get(key));
        }
        Collections.sort(list);
        for(int value : list) {
            System.out.println(value);
        }
    }

    public static void DFS_Search(int x, int y, int danji){
        Map[x][y] = danji;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx >= 0 && nx < N && ny >= 0 && ny < N) {
                if(Map[nx][ny] == 1) {
                    DFS_Search(nx,ny,danji);
                }
            }
        }
    }
}
