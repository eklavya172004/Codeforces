package rating800;

import java.util.Scanner;

public class BlankSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- >0){
            int n = sc.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int length = 0 ;
            int max = 0;

            for (int i = 0; i < n; i++) {

                if (arr[i] == 1){
                    length = 0;
                }else{
                    length++;
                    max = Math.max(max,length);
                }
            }

            System.out.println(max);
        }
    }
}
