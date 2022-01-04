import java.util.*;
import java.io.*;

public class BJ7568 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        class Person implements Comparable<Person>{
          int height;
          int weight;
          public Person(int height, int weight) {
              this.height = height;
              this.weight = weight;
          }

            @Override
            public int compareTo(Person person) {
                if(this.height > person.height && this.weight > person.weight) {
                    return -1;
                }else {
                    return 0;
                }
            }
        };
        ArrayList<Person> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            String[] tokens = br.readLine().split(" ");
            int height = Integer.parseInt(tokens[0]);
            int weight = Integer.parseInt(tokens[1]);
            list.add(new Person(height, weight));
        }
        Collections.sort(list);


    }
}
