import java.util.Scanner;

public class BJ2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int count = -1;

        int max = total / 5;
        while (max >= 0) {
            int tmp = total - (max * 5);
            if(tmp % 3 == 0) {
                count = max + (tmp / 3);
                break;
            }
            max--;
        }

        System.out.println(count);
        sc.close();
    }
}
