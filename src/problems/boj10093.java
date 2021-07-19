package problems;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long first, second, temp = 0;
        
        first = sc.nextLong();
        second = sc.nextLong();
        
        if (first > second) {
            temp = first; 
            first = second; 
            second = temp;
        }
        
        if (second - first - 1 > 0) {
            System.out.println(second - first - 1);
        } else {
            System.out.println(0);
        }
        
        for (long i = first + 1; i < second; i++) {
            System.out.print(i + " ");
        }
    }
}
