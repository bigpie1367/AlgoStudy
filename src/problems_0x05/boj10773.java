package problems_0x05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        Stack<Integer> stack = new Stack<>();
        
        int K = Integer.parseInt(br.readLine());
        int sum = 0;
        
        for (int i = 0; i < K; i++) {
            int num = Integer.parseInt(br.readLine());
            
            if (num == 0) {
                stack.pop();
            } else {
                stack.push(num);
            }
        }
        
        for (int num : stack) {
            sum += num;
        }
        
        bw.write(sum + "\n");
        
        br.close();
        bw.flush();
        bw.close();
    }
}
