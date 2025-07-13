package rating800;

import java.util.Scanner;

public class UnitArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }


            int neg = 0 ;
            int pos = 0 ;
            int ops = 0 ;

            for (int i = 0; i < n ; i++) {
                if (arr[i]<0) neg++;
                else pos++;
            }

            while (neg>pos || neg % 2 != 0){
                neg--;
                pos++;
                ops++;
            }

            System.out.println(ops);
        }
    }
}
