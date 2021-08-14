package problems_0x05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;
import java.util.StringTokenizer;

class tower {
    int height;
    int num;
    
    public tower(int height, int num) {
        this.height = height;
        this.num = num;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<tower> stack = new Stack<>();
        
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for (int i = 1; i <= N; i++) {
            int height = Integer.parseInt(st.nextToken());
            
            if (stack.isEmpty()) {
                sb.append("0 ");
                stack.push(new tower(height, i));
            } else {
                while (true) {
                    if (stack.isEmpty()) {
                        sb.append("0 ");
                        stack.push(new tower(height, i));
                        break;
                    }
                    
                    if (stack.peek().height > height) {
                        sb.append(stack.peek().num + " ");
                        stack.push(new tower(height, i));
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }
        }
        
        System.out.println(sb);
        br.close();
    }
}
