package rating800;

import java.util.Scanner;

public class LetterHome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0){
            int n = sc.nextInt();
            int s = sc.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int steps = arr[n-1] - arr[0] + Math.min(Math.abs(arr[n-1]- s),Math.abs(s-arr[0]));

            System.out.println(steps);
        }
    }
}
