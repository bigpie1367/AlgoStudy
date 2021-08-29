package problems_0x07;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> dq = new LinkedList<>();
        
        StringBuilder sb = new StringBuilder();        
        int N = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            
            if (s.equals("push_front")) {
                int value = Integer.parseInt(st.nextToken());
                dq.offerFirst(value);
            }
            else if (s.equals("push_back")) {
                int value = Integer.parseInt(st.nextToken());
                dq.offerLast(value);
            }
            else if (s.equals("pop_front")) {
                if (dq.isEmpty()) sb.append(-1 + "\n");
                else sb.append(dq.pollFirst() + "\n");
            }
            else if (s.equals("pop_back")) {
                if (dq.isEmpty()) sb.append(-1 + "\n");
                else sb.append(dq.pollLast() + "\n");
            }
            else if (s.equals("size")) {
                sb.append(dq.size() + "\n");
            }
            else if (s.equals("empty")) {
                if (dq.isEmpty()) sb.append(1 + "\n");
                else sb.append(0 + "\n");
            }
            else if (s.equals("front")) {
                if (dq.isEmpty()) sb.append(-1 + "\n");
                else sb.append(dq.peekFirst() + "\n");
            }
            else if (s.equals("back")) {
                if (dq.isEmpty()) sb.append(-1 + "\n");
                else sb.append(dq.peekLast() + "\n");
            }
        }
        
        System.out.print(sb);
        br.close();
    }
}
