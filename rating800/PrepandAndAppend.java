package rating800;

import java.util.Scanner;

public class PrepandAndAppend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0){
            int n = sc.nextInt();
            String s = sc.next();

            int i = 0 ;
            int j = s.length()-1;

            while(i<j){
                if (s.charAt(i) == '1' && s.charAt(j) == '1'){
                    break;
                }

                if (s.charAt(i) == '0' && s.charAt(j) == '0'){
                    break;
                }
                i++;
                j--;
            }

            if (i > j){
                System.out.println(0);
            }else{
                System.out.println(j-i+1);
            }
        }
    }
}
