import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

class Meeting implements Comparable<Meeting> {
    int start, finish;
    public Meeting(int start, int finish) {
        this.start = start;
        this.finish = finish;
    }

    @Override
    public int compareTo(Meeting m) {
        int v = this.finish - m.finish;
        if( v == 0 ) {
            return this.start - m.start;
        }
        return v;
    }

    @Override
    public String toString() {
        return "("+this.start + ", " + this.finish+")";
    }
}

public class BJ1931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        ArrayList<Meeting> list = new ArrayList<>();
        int answer = 0;
        for (int i = 0; i < count; i++) {
            String[] tokens = br.readLine().split(" ");
            list.add(new Meeting(Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1])));
        }
        Collections.sort(list);
        int endtime = 0;
        for(Meeting m : list) {
            if(m.start >= endtime) {
                answer++;
                endtime = m.finish;
            }
        }
        System.out.println(answer);
    }
}
