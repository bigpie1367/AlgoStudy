package problems_0x03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int[] nums = new int[9];
        
        int N = Integer.parseInt(br.readLine());
        int MAX = 0, remain;
        
        if (N == 0) nums[0]++;
        
        while (N > 0) {
            remain = N % 10;
            
            if (remain == 9) nums[6]++;
            else nums[remain]++;
            
            N /= 10;
        }
        
        if (nums[6] % 2 == 0) nums[6] = nums[6] / 2;
        else nums[6] = nums[6] / 2 + 1;
        
        for (int i = 0; i < 9; i++) {
            if (MAX < nums[i]) MAX = nums[i];
        }
        
        bw.write(MAX + "\n");
        
        br.close();
        bw.flush();
        bw.close();
    }
}
