package problems;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        
        int sum = 0;
        
        for (int i = 0; i < 5; i++) {
            nums.add(sc.nextInt());
            sum += nums.get(i);
        }
        
        Collections.sort(nums);
        
        System.out.println(sum / 5);
        System.out.println(nums.get(2));
    }
}
