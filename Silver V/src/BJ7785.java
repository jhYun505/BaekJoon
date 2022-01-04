import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;

public class BJ7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        HashSet<String> employee = new HashSet<>();
        for (int i = 0; i < cnt; i++) {
            String[] tokens = br.readLine().split(" ");
            if(employee.contains(tokens[0])) {
                employee.remove(tokens[0]);
            } else {
                employee.add(tokens[0]);
            }
        }
        ArrayList<String> list = new ArrayList<>(employee);
        list.sort(Comparator.reverseOrder());
        for (String name : list) {
            System.out.println(name);
        }
    }
}


/*
//시간 초과 코드
public class BJ7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < cnt; i++) {
            String[] tokens = br.readLine().split(" ");
            if(tokens[1].equals("enter")) {
                list.add(tokens[0]);
            } else {
                list.remove(tokens[0]);
            }
        }
        list.sort(Comparator.reverseOrder());
        for (String name : list) {
            System.out.println(name);
        }
    }
}*/

