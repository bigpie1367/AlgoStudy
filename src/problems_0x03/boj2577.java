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
        
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        
        int result = A * B * C;
        int[] numCount = new int[10];
        
        while (result > 0) {
            numCount[result % 10]++;
            result /= 10;
        }
        
        for (int i = 0; i < numCount.length; i++) {
            bw.write(numCount[i] + "\n");
        }
        
        br.close();
        bw.flush();
        bw.close();  
    }
}
