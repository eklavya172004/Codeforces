package rating800;

import java.util.Scanner;

public class Destoring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int min =  Integer.MAX_VALUE;
            boolean sorted = true;

            for (int i = 1; i < n; i++) {
                min = Math.min(arr[i]-arr[i-1],min);

                if (arr[i] < arr[i-1]){
                    sorted = false;
                }
            }

            if (!sorted){
                System.out.println(0);
            }else{
                System.out.println((min/2) + 1);
            }
        }
    }
}
