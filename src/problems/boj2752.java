package problems;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        int a, b, c;
        
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        
        nums.add(a); nums.add(b); nums.add(c);
        Collections.sort(nums);
        
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
