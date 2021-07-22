package problems_0x02;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        ArrayList<Integer> copyNums = new ArrayList<>();
        int MAX;
        
        for (int i = 0; i < 9; i++) {
            nums.add(sc.nextInt());
        }
        
        copyNums.addAll(nums);
        Collections.sort(nums);
        
        MAX = nums.get(nums.size() - 1);
        System.out.println(MAX);
        System.out.println(copyNums.indexOf(MAX) + 1);
    }
}
