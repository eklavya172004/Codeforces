package rating800;

import java.util.Scanner;

public class WalkingMaster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long d = sc.nextLong();

            long min = d-b;
            a += min;

            //do a-- untill its is equal c and if it is not possible just give -1
            if (a<c || d<b){
                System.out.println(-1);
            }else{
                long steps = (a-c) + min;
                System.out.println(steps);
            }
        }
    }
}
