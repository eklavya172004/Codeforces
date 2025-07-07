package rating800;

import java.util.ArrayList;
import java.util.Scanner;

public class UnitedWStand {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

        while (t-- > 0){
        int n = sc.nextInt();

        int[] arr = new int[n];

            int max = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                max = Math.max(max,arr[i]);
            }

            ArrayList<Integer> b = new ArrayList<>();
            ArrayList<Integer> c = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                if (max == arr[i]){
                    c.add(arr[i]);
                }else{
                    b.add(arr[i]);
                }
            }

            if (b.isEmpty() || c.isEmpty()) {
                System.out.println(-1);
            } else {
                System.out.println(b.size() + " " + c.size());
                for (int x : b) System.out.print(x + " ");
                System.out.println();
                for (int x : c) System.out.print(x + " ");
                System.out.println();
            }
        }
    }
}
