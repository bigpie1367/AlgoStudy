package problems;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dice = {0, 0, 0, 0, 0, 0, 0};
        int reward = 0;
        
        for (int i = 0; i < 3; i++) {
            dice[sc.nextInt()]++;
        }
        
        for (int i = 1; i < 7; i++) {
            if (dice[i] == 3) reward = 10000 + i * 1000;
            else if (dice[i] == 2) reward = 1000 + i * 100;
        }
        
        if (reward == 0) {
            for (int i = 6; i > 0; i--) {
                if (dice[i] == 1) {
                    reward = i * 100;
                    break;
                }
            }
        }
        
        System.out.println(reward);
    }
}
