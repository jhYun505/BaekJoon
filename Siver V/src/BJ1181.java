import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Word implements Comparable<Word> {
    String word;
    int length;
    public Word(String word){
        this.word = word;
        this.length = word.length();
    }

    @Override
    public int compareTo(Word w) {
        if(w.length == this.length) {
            return this.word.compareTo(w.word);
        } else {
            return this.length - w.length;
        }
    }

    @Override
    public String toString() {
        return word;
    }
}

public class BJ1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        HashSet<String> words = new HashSet<>();
        for (int i = 0; i < count; i++) {
            words.add(br.readLine());
        }
        List<Word> list = new ArrayList<>();
        for(String word : words) {
            list.add(new Word(word));
        }

        Collections.sort(list);
        for(Word word : list) {
            System.out.println(word);
        }
    }
}
