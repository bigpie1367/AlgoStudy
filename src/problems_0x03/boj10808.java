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
        
        String S = br.readLine();
        int[] wordCount = new int[26];
        
        for (int i = 0; i < S.length(); i++) {
            wordCount[S.charAt(i) - 97]++;
        }
        
        for (int i = 0; i < wordCount.length; i++) {
            bw.write(wordCount[i] + " ");
        }
        
        br.close();
        bw.flush();
        bw.close();
    }
}
