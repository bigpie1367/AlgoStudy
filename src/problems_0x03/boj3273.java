package problems_0x03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class boj3273 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        ArrayList<Integer> nums = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < N; i++) {
            nums.add(Integer.parseInt(st.nextToken()));
        }
        
        int x = Integer.parseInt(br.readLine());
        int cnt = 0;
        
        for (int i = 0; i < N; i++) {
            int a = nums.get(i);
            
            if (nums.contains(x - a)) cnt++;
        }
        
        bw.write(cnt/2 + "\n");
        
        br.close();
        bw.flush();
        bw.close();
    }
}
