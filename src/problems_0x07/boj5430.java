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
        StringBuilder sb = new StringBuilder();
        
        int T = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < T; i++) {
            Deque<Integer> dq = new LinkedList<>();
            
            boolean cursor = true;
            boolean flag = true;
            
            String[] fcs = br.readLine().split("");
            int n = Integer.parseInt(br.readLine());
            
            StringTokenizer st = new StringTokenizer(br.readLine(), "[|,|]");
            while (st.hasMoreTokens()) dq.add(Integer.parseInt(st.nextToken()));

            for (int j = 0; j < fcs.length; j++) {
                if (fcs[j].equals("R")) {
                    cursor = !cursor;
                } else {
                    if (dq.isEmpty()) {
                        flag = false;
                        break;
                    } else if (n > 0) {
                        if (cursor) dq.removeFirst();
                        else dq.removeLast();
                    }
                }
            }
            
            if (flag == false) {
                sb.append("error\n");
            }
            else {
                if (cursor) {
                    String temp = dq.toString();
                    sb.append(temp.replace(" ", "") + "\n");
                    
                }
                else {
                    for (int j = 0; j < dq.size() - 1; j++) {
                        dq.addLast(dq.removeFirst());
                    }
                    
                    String temp = dq.toString();
                    sb.append(temp.replace(" ", "") + "\n");
                }
            }
        }
        
        System.out.print(sb);
    }
}