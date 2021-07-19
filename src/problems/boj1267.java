package problems;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> times = new ArrayList<>();
        
        int N, MCost = 0, YCost = 0;
        
        N = sc.nextInt();
        
        for (int i = 0; i < N; i++) {
            times.add(sc.nextInt());
        }
        
        for (int time : times) {
            YCost += (time / 30 + 1) * 10;
            MCost += (time / 60 + 1) * 15;
        }
        
        if (YCost > MCost) {
            System.out.println("M " + MCost);
        } else if (MCost > YCost) {
            System.out.println("Y " + YCost);
        } else {
            System.out.println("Y M " + MCost);
        }
    }
}
