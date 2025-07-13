package rating800;

import java.util.Scanner;

public class GoodArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0){
            int n = sc.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }


            int ops =0 ;

            for (int i = 0; i < n; i++) {
                if (arr[i] %2 == 0 ){
                    if(i<n-1 && ((arr[i+1] %2 == 0))){
                        ops++;
                    }
                }

                if (arr[i] % 2 != 0 ){
                    if(i<n-1 && ((arr[i+1] %2 != 0))){
                        ops++;
                    }
                }
            }

            System.out.println(ops);
        }
    }
}
