package rating800;

import java.util.Scanner;

public class Swaps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int count= 1;
            boolean yes = false;

            for (int i = 0; i < n; i++) {
                if (i < (n-1) && arr[i]<arr[i+1]) count++;

                if (i>0 && i<n-1){
                    if (arr[i] > arr[i-1] && arr[i] > arr[i+1]){
                        yes = true;
                        break;
                    }
                }
            }

            if (arr[0] != 1){
                System.out.println("NO");
            }else if (yes || count == n){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
