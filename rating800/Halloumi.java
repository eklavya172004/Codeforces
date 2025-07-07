package rating800;

import java.util.Scanner;

public class Halloumi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- >0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            if (k >= n){
                System.out.println("Yes");
            }else if (k == 1){
                boolean yes = true;
                for (int i = 1; i < n; i++) {
                    if (arr[i-1] > arr[i] ){
                        yes = false;
                    }
                }
                if (yes){
                System.out.println("YES");
                }else {
                    System.out.println("NO");
                }

            }else{
                System.out.println("YES");
            }
        }
    }
}
