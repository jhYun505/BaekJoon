import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


public class BJ1427 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tokens = br.readLine().split("");
        ArrayList<Integer> digits = new ArrayList<>();
        for (int i = 0; i < tokens.length; i++) {
            digits.add(Integer.parseInt(tokens[i]));
        }
        Collections.sort(digits, Collections.reverseOrder());
        for(int digit : digits) {
            System.out.print(digit);
        }
    }
}
