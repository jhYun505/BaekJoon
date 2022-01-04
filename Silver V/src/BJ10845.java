import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BJ10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        ArrayList<Integer> queue = new ArrayList<>();
        for (int i = 0; i < cnt; i++) {
            String[] tokens = br.readLine().split(" ");
            String command = tokens[0];
            switch (command) {
                case "push":
                    queue.add(Integer.parseInt(tokens[1]));
                    break;
                case "pop" :
                    if(queue.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(queue.remove(0));
                    }
                    break;
                case "size" :
                    System.out.println(queue.size());
                    break;
                case "empty" :
                    if(queue.isEmpty())     System.out.println(1);
                    else    System.out.println(0);
                    break;
                default:
                    if(queue.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        if(command.equals("front")) {
                            System.out.println(queue.get(0));
                        } else {
                            System.out.println(queue.get(queue.size() - 1));
                        }
                    }
            }
        }
    }
}
