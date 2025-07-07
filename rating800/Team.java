package rating800;

import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        int count = 0 ;

        while (t-->0){
            int p = sc.nextInt();
            int v = sc.nextInt();
            int ty = sc.nextInt();

            if (p+v+ty>=2){
                count++;
            }
        }

        System.out.println(count);
    }
}
