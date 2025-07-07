package rating800;

import java.util.Scanner;

public class problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- >0){
            int n = sc.nextInt();
            int m = sc.nextInt();

            String x = sc.next();
            String s = sc.next();

                if (check(x,s)){
                    System.out.println(0);
                    continue;
                }

            String x1 = x+x;
            String x2 = x1+x1;
            String x3 = x2+x2;
            String x4 = x3+x3;
            String x5 = x4+x4;

            if (check(x1,s)){
                System.out.println(1);
            } else if (check(x2,s)) {
                System.out.println(2);
            } else if (check(x3,s)) {
                System.out.println(3);
            } else if (check(x4,s)) {
                System.out.println(4);
            } else if (check(x5,s)) {
                System.out.println(5);
            }else {
                System.out.println(-1);
            }
        }
    }

    private static boolean check(String x, String s) {
        return x.contains(s);
    }
}
