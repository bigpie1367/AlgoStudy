package problems_0x06;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Queue<Integer> queue = new LinkedList<>();
        
        int N = Integer.parseInt(br.readLine());
        int last = 0;
        
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            
            if (s.equals("push")) {
                int value = Integer.parseInt(st.nextToken());
                last = value;
                
                queue.add(value);
            } 
            else if (s.equals("pop")) {
                if (queue.isEmpty()) sb.append(-1 + "\n");
                else sb.append(queue.poll() + "\n");
            }
            else if (s.equals("size")) {
                sb.append(queue.size() + "\n");
            } 
            else if (s.equals("empty")) {
                if (queue.isEmpty()) sb.append(1 + "\n");
                else sb.append(0 + "\n");
            }
            else if (s.equals("front")) {
                if (queue.isEmpty()) sb.append(-1 + "\n");
                else sb.append(queue.peek() + "\n");
            }
            else if (s.equals("back")) {
                if (queue.isEmpty()) sb.append(-1 + "\n");
                else sb.append(last + "\n");
            }
        }
        
        System.out.println(sb);
        br.close();
    }
}
