package problems_0x06;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Queue<Integer> queue = new LinkedList<>();
        
        int N = Integer.parseInt(br.readLine());
        
        for (int i = 1; i <= N; i++) queue.offer(i);
        
        while (queue.size() != 1) {
            queue.poll();
            queue.offer(queue.poll());
        }
        
        sb.append(queue.peek() + "\n");
        System.out.println(sb);
        
        br.close();
    }
}
