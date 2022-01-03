import java.util.Scanner;

public class BJ2735 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String[] tokens = sc.nextLine().split(" ");
        int N = Integer.parseInt(tokens[0]);
        int K = Integer.parseInt(tokens[1]);
        int sum = 0;
        String[] temps = sc.nextLine().split(" ");
        for (int i = 0; i < K; i++) {
            sum += Integer.parseInt(temps[i]);
        }
        //k번째까지의 기온 합

        int max = sum;
        for (int i = K; i < N; i++) {
            int tmp = sum - Integer.parseInt(temps[i - K]);
            tmp += Integer.parseInt(temps[i]);
            sum = tmp;
            if(tmp > max) {
                max = tmp;
            }
        }
        System.out.println(max);
    }
}
