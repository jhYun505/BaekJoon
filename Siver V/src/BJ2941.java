import java.util.Scanner;

public class BJ2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] tokens = sc.nextLine().split("");
        int cnt = 0;
        int index = tokens.length - 1;
        while (index >= 0) {
            if(tokens[index].equals("=") && index >= 1) {
                if(tokens[index-1].equals("c") || tokens[index-1].equals("s")) {
                    index = index-1;
                } else if(tokens[index-1].equals("z")){
                    if(index >= 2 && tokens[index-2].equals("d")) {
                        index = index-2;
                    } else {
                        index = index-1;
                    }
                }
            } else if(tokens[index].equals("-") && index >= 1) {
                if(tokens[index-1].equals("c") || tokens[index-1].equals("d")) {
                    index = index-1;
                }
            } else if(tokens[index].equals("j") && index >= 1) {
                if(tokens[index-1].equals("l") || tokens[index-1].equals("n")) {
                    index = index-1;
                }
            }

            index--;
            cnt++;
        }
        System.out.println(cnt);
    }
}
