import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ17176 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int[] input = new int[count];
        int[] result = new int[count];

        String[] tokens = br.readLine().split(" ");
        for (int i = 0; i < count; i++) {
            input[i] = Integer.parseInt(tokens[i]);
        }

        String target = br.readLine();
        for (int i = 0; i < target.length(); i++) {
            char point = target.charAt(i);
            if(point == 32) {
                result[i] = 0;
            }
            else if(point >=65 && point <= 90) {
                result[i] = (int) point - 64;
            } else if(point >= 97 && point <=122) {
                result[i] = (int) point - 70;
            }
        }
        Arrays.sort(input);
        Arrays.sort(result);
        boolean flag = true;
        for (int i = 0; i < count; i++) {
            if(input[i] != result[i]) {
                flag = false;
                break;
            }
        }
        if(flag) {
            System.out.println("y");
        } else System.out.println("n");
    }
}
