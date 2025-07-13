package rating800;

import java.util.HashMap;
import java.util.Scanner;

public class AboveTheClouds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0){

            int n = sc.nextInt();
            String s = sc.next();

            boolean count = false ;

            HashMap<Character,Integer> map = new HashMap<>();

            map.put(s.charAt(0),map.getOrDefault(s.charAt(0),0)+1);
            map.put(s.charAt(n-1),map.getOrDefault(s.charAt(0),0)+1);

            for (int i = 1; i < n-1 ; i++) {
                map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);

                if (map.get(s.charAt(i)) != null && map.get(s.charAt(i))>1){
                    count = true;
                }
            }

            if (count){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }

    }
}
