package problems;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> cards = new ArrayList<>();
        List<Integer> subCards = new ArrayList<>();
        
        int from, to;
        
        for (int i = 1; i < 21; i++) {
            cards.add(i);
        }
        
        for (int i = 0; i < 10; i++) {
            from = sc.nextInt() - 1;
            to = sc.nextInt();

            // subList : shallow Copy
            subCards = cards.subList(from, to);
            Collections.reverse(subCards);
        }
        
        for (int card : cards) System.out.printf("%d ", card);
    }
}
