package problems;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < N; i++) {
            for (int j = N - i - 1; j > 0; j--) {
                bw.write(" ");
            }
            
            for (int j = 0; j < i * 2 + 1; j++) {
                bw.write("*");
            }
            
            bw.write("\n");
        }
        
        br.close();
        bw.flush();
        bw.close();
    }
}
