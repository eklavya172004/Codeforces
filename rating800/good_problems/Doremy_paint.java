package rating800.good_problems;

import java.util.HashMap;
import java.util.Scanner;

public class Doremy_paint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- >0){
            int n = sc.nextInt();
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            HashMap<Integer,Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            }

            if (map.size()>=3){
                System.out.println("NO");
            }else if (map.size() ==1){
                System.out.println("YES");
            }else {
                int[] freq =new int[2];

                int j = 0 ;
                for (int value:map.values()) {
                    freq[j++] = value;
                }

                if (Math.abs(freq[1]-freq[0]) <= 1){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }
        }
    }
}
