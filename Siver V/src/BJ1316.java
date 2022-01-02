import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BJ1316 {
    public static boolean GroupWordChecker(String[] word) {
        ArrayList<String> already = new ArrayList<>();
        String target = word[0];
        boolean isGroup = false;
        already.add(target);
        for (String s : word) {
            if (s.equals(target)) {
                isGroup = true;
            } else {
                if (already.contains(s)) {
                    isGroup = false;
                    return isGroup;
                } else {
                    target = s;
                    already.add(target);
                }
            }
        }
        return isGroup;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int case_cnt = Integer.parseInt(br.readLine());
        int answer = 0;
        for (int i = 0; i < case_cnt; i++) {
            boolean flag = GroupWordChecker(br.readLine().split(""));
            if(flag) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}
