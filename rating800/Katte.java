package rating800;

import java.util.Scanner;

public class Katte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();


            if (c%2!=0){
                if (b>a){
                    System.out.println("Second");
                }else{
                    System.out.println("First");
                }
            }else{
                if (a>b){
                    System.out.println("First");
                }else{
                    System.out.println("Second");
                }
            }
        }
    }
}
