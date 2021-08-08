package problems_0x04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        LinkedList<Integer> nums = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            nums.add(i);
        }        
        
        bw.write("<");
    
        while (nums.size() != 1) {
            for (int i = 0; i < K - 1; i++) {
                nums.addLast(nums.poll());
            }
            
            bw.write(nums.poll() + ", ");
        }
        
        bw.write(nums.getFirst() + ">");
        
        br.close();
        bw.flush();
        bw.close();
    }
}
