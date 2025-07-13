package rating800;

import java.util.Scanner;

public class WeNeedZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int sum = 0;

            for (int i = 0; i < n; i++) {
                sum ^= arr[i];
            }

            if (n%2 == 0){
                if (sum == 0){
                    System.out.println(2);
                }else{
                    System.out.println(-1);
                }
            }

            if (n%2!=0){
                System.out.println(sum);
            }
        }
    }
}
