package rating800;

import java.util.Scanner;

public class AmbitiousKid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        int[] arr = new int[t];
        
        int small = 0;
        int abs = Integer.MAX_VALUE;

        for (int i = 0; i < t; i++) {
            arr[i] = sc.nextInt();

            if (Math.abs(arr[i]) < abs){
                small = arr[i];
                abs =  Math.abs(arr[i]);
            }
        }

        if (small == 0){
            System.out.println(0);
        }

        int count = 0;

        if (small != 0){

            count += Math.abs(small);

        System.out.println(count);
        }
    }
}
