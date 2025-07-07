package rating800;

import java.util.Scanner;

public class Bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        int x = 0 ;

        while (t-->0){
            String stat = sc.next();

            if (stat.contains("++")){
                x++;
            } else if (stat.contains("-")) {
                x--;
            }
        }

        System.out.println(x);
    }
}
