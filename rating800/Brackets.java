package rating800;

import java.util.Scanner;

public class Brackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0){
            String x = sc.next();

            int count= 0 ;
            int openclose = 0;

            for (int i = 0; i < x.length(); i++) {
                if (x.charAt(i) == '('){
                    openclose++;
                }else if (x.charAt(i) == ')'){
                    openclose--;
                }

                if (openclose == 0){
                    count++;
                }
            }

            if (count>1 || openclose != 0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
