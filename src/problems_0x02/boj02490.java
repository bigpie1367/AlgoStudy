package problems_0x02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] flag = {0, 0};
        int count = 0;
        
        while(sc.hasNext()) {            
            count++;
            flag[sc.nextInt()]++;
            
            if (count % 4 == 0) {
                switch(flag[0]) {
                    case 0 : 
                        System.out.println("E");
                        break;
                    case 1 : 
                        System.out.println("A");
                        break;
                    case 2 :
                        System.out.println("B");
                        break;
                    case 3 :
                        System.out.println("C");
                        break;
                    case 4 :
                        System.out.println("D");
                        break;
                }
                
                flag[0] = 0; flag[1] = 0;
            }
            
        }
    }
}
