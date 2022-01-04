import java.util.Scanner;

public class BJ1463 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] array = new int[N+1]; //연산 횟수를 저장하는 배열
        array[0] = Integer.MAX_VALUE;   //0을 만들 수 없으므로 int값 중 max를 저장하여 연산식에 문제가 되지 않도록
        array[1] = 0;       //1로 1을 만들 때 필요한 연산 횟수는 0
        for (int i = 2; i <= N ; i++) {
            if(i % 2 == 0) {
                array[i] = Math.min(array[i-1] + 1, array[i/2] + 1);
                if(i % 3 == 0) {
                    array[i] = Math.min(array[i] , array[i/3] + 1);
                }
            } else if ( i % 3 == 0) {
                array[i] = Math.min(array[i-1] + 1, array[i/3] + 1);
            } else {
                array[i] = array[i-1] + 1;
            }
        }
        System.out.println(array[N]);
    }
}