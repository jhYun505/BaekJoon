
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class BJ1475 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String[] num = sc.nextLine().split("");
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < num.length; i++) {
            String key = num[i];
            if(key.equals("9")) {
                 map.put("6", map.getOrDefault("6", 0) + 1);
            } else {
                map.put(key , map.getOrDefault(key, 0) + 1);
            }
        }
        if(map.containsKey("6")) {
            map.put("6", (int) Math.round(map.get("6") / 2.0));
        }
        int needs = Collections.max(map.values());
        System.out.println(needs);
        sc.close();
    }
}
