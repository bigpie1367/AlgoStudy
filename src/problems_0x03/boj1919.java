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
        
        String first = br.readLine();
        String second = br.readLine();
        
        int[] firstLetters = new int[26];
        int[] secondLetters = new int[26];
        
        int cnt = 0;
        
        for (int i = 0; i < first.length(); i++) {
            firstLetters[first.charAt(i) - 97]++;   
        }
        
        for (int i = 0; i < second.length(); i++) {
            secondLetters[second.charAt(i) - 97]++;
        }
        
        for (int i = 0; i < 26; i++) {
            if (firstLetters[i] >= secondLetters[i]) {
                cnt = cnt + firstLetters[i] - secondLetters[i];
            } else if (secondLetters[i] >= firstLetters[i]) {
                cnt = cnt + secondLetters[i] - firstLetters[i];
            }
        }
        
        bw.write(cnt + "\n");
        
        br.close();
        bw.flush();
        bw.close();
    }
}
