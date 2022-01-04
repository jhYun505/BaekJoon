import java.util.Scanner;
/*
public class BJ2156 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] arr = new int[N + 1];
        int[] total = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            arr[i] = sc.nextInt();
        }

        total[1] = arr[1];
        if (N > 1) {
            total[2] = arr[1] + arr[2];
        }
        for (int i = 3; i <= N; i++) {
            total[i] = Math.max(total[i - 1], Math.max(total[i - 2] + arr[i], total[i - 3] + arr[i - 1] + arr[i]));
        }
        System.out.println(total[N]);
    }
}*/

import java.util.Scanner;

public class BJ2156 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] glasses = new int[N+1];
        int[] total = new int[N+1];
        for (int i = 1; i <= N; i++) {
            glasses[i] = sc.nextInt();
        }

        total[0] = 0;
        total[1] = glasses[1];
        if(N >= 2) {
            total[2] = glasses[1] + glasses[2];
        }
        if(N >= 3) {
            for (int i = 3; i <= N; i++) {
                total[i] = Math.max(total[i - 1], Math.max(total[i - 2] + glasses[i], total[i - 3] + glasses[i - 1] + glasses[i]));
            }
        }
        System.out.println(total[N]);
    }
}