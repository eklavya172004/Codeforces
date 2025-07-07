package rating800;

import java.util.Scanner;

public class LineTrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0){
            int n = sc.nextInt();
            int x = sc.nextInt();

            int[] arr = new int[n+2];

            arr[0] = 0;

            for (int i = 1; i <= n; i++) {
                arr[i] = sc.nextInt();
            }

            arr[n+1] = x;

            int maxD = 0;

            for (int i = 1; i <= n ; i++) {
                if (Math.abs(arr[i] - arr[i-1]) > maxD){
                    maxD = Math.abs(arr[i] - arr[i-1]);
                }
            }

            int rtd = Math.abs(arr[n] - arr[n+1]) * 2;

            int max = Math.max(rtd,maxD);

            System.out.println(max);
        }
    }
}
