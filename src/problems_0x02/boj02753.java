package problems_0x02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int years;
        
        years = sc.nextInt();
        
        if (years % 4 == 0 && (years % 100 != 0 || years % 400 == 0)) {
             System.out.println("1");   
        } else {
            System.out.println("0");
        }
    }
}
