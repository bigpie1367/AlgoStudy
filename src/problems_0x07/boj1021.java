package problems_0x07;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> dq = new LinkedList<>();
        
        StringBuilder sb = new StringBuilder();
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int cnt = 0, idx = 0;
        
        for (int i = 1; i <= N; i++) dq.add(i);
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int value = Integer.parseInt(st.nextToken());
            idx = 0;
            
            Iterator it = dq.iterator();
            while (it.hasNext()) {
                if ((int)it.next() == value) break;
                idx++;
            }
            
            while (dq.peekFirst() != value) {
                if (idx > dq.size() / 2) dq.addFirst(dq.removeLast());
                else dq.addLast(dq.removeFirst());
                
                cnt++;
            }           
            
            dq.removeFirst();
        }        
        
        sb.append(cnt + "\n");
        System.out.print(sb);
    }
}
