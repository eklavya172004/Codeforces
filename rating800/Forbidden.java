package rating800;

import java.util.Scanner;

import java.util.Scanner;

public class Forbidden {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int x = sc.nextInt();

            if (x != 1) {
                System.out.println("YES");
                System.out.println(n);
                for (int i = 0; i < n; i++) {
                    System.out.print(1 + " ");
                }
                System.out.println();
            } else {
                if (k == 1) {
                    System.out.println("NO");
                } else if (k == 2 && n % 2 == 1) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                    if (n % 2 == 0) {
                        System.out.println(n / 2);
                        for (int i = 0; i < n / 2; i++) {
                            System.out.print(2 + " ");
                        }
                    } else {
                        System.out.println((n - 3) / 2 + 1);
                        System.out.print(3 + " ");
                        for (int i = 0; i < (n - 3) / 2; i++) {
                            System.out.print(2 + " ");
                        }
                    }
                    System.out.println();
                }
            }
        }

        sc.close();
    }
}