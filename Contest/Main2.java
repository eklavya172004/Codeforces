package Contest;

import java.io.ByteArrayInputStream;
import java.util.HashMap;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
            String input = """
            3
            5 2 3
            3 2 4 4 1
            5 4 1
            5 3 4 5 2
            6 1 1
            1 2 3 4 5 6
            """;

            System.setIn(new ByteArrayInputStream(input.getBytes()));

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0){
            int n = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();

            int[] arr = new int[n];
            HashMap<Integer, Integer> map = new HashMap<>(); // Stores value -> index

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                map.put(arr[i], i);
            }

            int strength = arr[j - 1];
            int strongerCount = 0;

            // Count how many players are stronger
            for (int value : arr) {
                if (value > strength) {
                    strongerCount++;
                }
            }

            // If strongerCount >= n - k, then player j cannot survive
            if (strongerCount > n - k) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}