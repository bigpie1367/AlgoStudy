package problems_0x05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Stack;

public class boj1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        Stack<Integer> stack = new Stack<>();
        
        int N = Integer.parseInt(br.readLine());
        int value = 0;
        
        for (int i = 0; i < N; i++) {
            int goal = Integer.parseInt(br.readLine());
            
            if (goal > value) {
                for (int j = value + 1; j <= goal; j++) {
                    stack.push(j);
                    bw.write("+\n");
                }
                
                value = goal;
            } 
            
            else if (stack.peek() != goal) {
                System.out.println("NO");
                return;
            }
            
            stack.pop();
            bw.write("-\n");
        }
        
        br.close();
        bw.flush();
        bw.close();
    }
}
