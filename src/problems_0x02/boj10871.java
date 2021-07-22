package problems_0x02;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Integer> listA = new ArrayList<>();
        int N, X;
        
        N = sc.nextInt();
        X = sc.nextInt();
        
        for (int i = 0; i < N; i++) {
            listA.add(sc.nextInt());
        }
        
        for (int num : listA) {
            if (num < X) System.out.printf("%d ", num);
        }
    }
}
