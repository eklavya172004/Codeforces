package rating800;

import java.util.Scanner;

public class CoverInWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0){
            int n = sc.nextInt();
            String s = sc.next();

            int e = 0;
            boolean yes = false;

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '.') e++;

                if (i>0 && i < n-1){
                    if (s.charAt(i-1) == '.' && s.charAt(i) == '.' && s.charAt(i+1) == '.'){
                        yes = true;
                        break;
                    }
                }
            }

            if (yes){
                System.out.println("2");
            }else {
                System.out.println(e);
            }
        }
    }
}
