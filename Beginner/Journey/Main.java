package Beginner.Journey;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt(); // number of test cases

    while (t-- > 0){
        int n =  sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();


        long[] dist = {a,b,c};
        long cycledistance = a+b+c;

        long fullcycle = n/cycledistance;

        long totaldis = fullcycle*cycledistance;
        long day = fullcycle*3;

        int i = 0 ;

        while (totaldis<n){
            totaldis += dist[i % 3];
            i++;
            day++;
        }

        System.out.println(day);
    }

    }
}
