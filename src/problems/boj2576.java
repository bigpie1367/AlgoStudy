package problems;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> oddNums = new ArrayList<>();
        
        int tempNum, sum = 0;
        
        for (int i = 0; i < 7; i++) {
            tempNum = sc.nextInt();
            
            if (tempNum % 2 == 1) {
                oddNums.add(tempNum);
                sum += tempNum;
            }
        }
        
        Collections.sort(oddNums);
       
        if (sum == 0) {
            System.out.println("-1");
        } else {
            System.out.println(sum);
            System.out.println(oddNums.get(0));
        } 
    }
}
