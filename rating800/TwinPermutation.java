package rating800;

import java.util.Scanner;

public class TwinPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- >0){
            int n = sc.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int[] newArr = new int[n];

            for (int i = 0; i < n; i++) {
                newArr[i] = n+1-arr[i];
            }


            for (int i = 0; i < n; i++) {
            System.out.print(newArr[i]+" ");
            }

            }
        }
    }

