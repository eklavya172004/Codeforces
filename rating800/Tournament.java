package rating800;

import java.util.Scanner;

public class Tournament {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0){
            int n = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int strong = arr[j-1];
            int max = 0;

            for (int i = 0; i < n; i++) {
            max = Math.max(max,arr[i]);
            }

            if (k>=2 || max == strong){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
