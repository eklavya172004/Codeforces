package rating800;

import java.util.Scanner;

public class FalseAlarm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- >0){
            int n = sc.nextInt();
            int x = sc.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            boolean yes = false;
            boolean not = false;

            for (int i = 0; i < n; i++) {
                if (arr[i] == 1) yes = true;

                if (x == 0 && arr[i] != 0){
                    not = true;
                    break;
                }

                if (x>0 && yes) x--;

            }

            if (not){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }

        }
    }
}
