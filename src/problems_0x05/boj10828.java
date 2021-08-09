package problems_0x05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        Stack<Integer> stack = new Stack<>();
        
        int N = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            
            if (s.equals("push")) {
                int X = Integer.parseInt(st.nextToken());
                stack.push(X);
            } else if (s.equals("pop")) {
                if (stack.empty() == true) System.out.println("-1");
                else System.out.println(stack.pop());
            } else if (s.equals("size")) {
                System.out.println(stack.size());
            } else if (s.equals("empty")) {
                if (stack.empty() == true) System.out.println("1");
                else System.out.println("0");
            } else if (s.equals("top")) {
                if (stack.empty() == true) System.out.println("-1");
                else System.out.println(stack.peek());
            }
        }
        
        br.close();
    }
}
