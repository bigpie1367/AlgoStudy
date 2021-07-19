package problems;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> heights = new ArrayList<>();

        int totalHeight = 0, tempSum = 0;
        
        for (int i = 0; i < 9; i ++) {
            heights.add(sc.nextInt());
            totalHeight += heights.get(i);
        }
        
        Collections.sort(heights);
        
        loop1 :
        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 9; j++) {
                tempSum = heights.get(i) + heights.get(j);

                if (totalHeight - tempSum == 100) {
                    heights.remove(j);
                    heights.remove(i);
                    
                    break loop1;
                }
            }    
        }
        
        for (int height : heights) {
            System.out.println(height);
        }
    }
}
