package rating800;

import java.util.Scanner;

public class OneTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int r_count = count(arr);
            int l_count = 0 ;
            boolean found = false;

            for (int i = 0; i < n; i++) {
                if (arr[i] == 2){
                    r_count--;
                    l_count++;
                }

                if (l_count == r_count){
                    System.out.println(i+1);
                    found = true;
                    break;
                }
            }

            if (!found){
                System.out.println(-1);
            }
        }
    }

    public static int count(int[] arr){
        int count = 0 ;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2){
            count++;
            }
        }

        return count;
    }
}
