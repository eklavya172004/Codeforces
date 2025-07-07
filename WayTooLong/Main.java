package WayTooLong;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0){
            String word = sc.next();

            if (word.length()<=10){
                System.out.println(word);
            }else{
                StringBuilder str = new StringBuilder();

                char first = word.charAt(0);
                char last = word.charAt(word.length()-1);

                str.append(first);
                str.append(word.length()-2);
                str.append(last);

                String result = str.toString();

                System.out.println(result);
            }
        }
    }
}
