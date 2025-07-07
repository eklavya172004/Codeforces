package rating800;

import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[m];

        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }

        int kth = arr[k-1];

        int i = 0 ;
        int count = 0 ;

        while (i<m){

            if (arr[i] >= kth && arr[i]>0){
                count++;
            }

            i++;
        }

        System.out.println(count);
    }
}
