package rating800;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        int[][] matrix = {
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 2, 2, 2, 2, 2, 2, 2, 2, 1},
                {1, 2, 3, 3, 3, 3, 3, 3, 2, 1},
                {1, 2, 3, 4, 4, 4, 4, 3, 2, 1},
                {1, 2, 3, 4, 5, 5, 4, 3, 2, 1},
                {1, 2, 3, 4, 5, 5, 4, 3, 2, 1},
                {1, 2, 3, 4, 4, 4, 4, 3, 2, 1},
                {1, 2, 3, 3, 3, 3, 3, 3, 2, 1},
                {1, 2, 2, 2, 2, 2, 2, 2, 2, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
        };

        while (t-- > 0){
            char[][] arrows = new char[10][10];
            for (int i = 0; i < 10; i++) {
                String line = sc.nextLine();
                for (int j = 0; j < 10; j++) {
                    arrows[i][j] = line.charAt(j);
                }
            }

            int count = 0 ;

            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if (arrows[i][j] =='X'){
                        count = count + matrix[i][j];
                    }
                }
            }

            System.out.println(count);
        }
    }
}
