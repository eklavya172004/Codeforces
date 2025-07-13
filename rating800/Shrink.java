package rating800;

import java.util.Scanner;

public class Shrink {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- >0){
            int n = sc.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = i+1;
            }

            int temp = arr[1];
            arr[1] = arr[n-1];
            arr[n-1] = temp;

            for (int i = 0; i < n; i++) {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
