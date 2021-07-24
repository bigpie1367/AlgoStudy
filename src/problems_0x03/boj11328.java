package problems_0x03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        char[] a, b;
        
        for (int i = 0; i < N; i++) {
            int[] alph = new int[26];
            boolean flag = true;
            
            StringTokenizer st = new StringTokenizer(br.readLine());
            a = st.nextToken().toCharArray();
            b = st.nextToken().toCharArray();
            
            for (char letter : a) alph[letter - 97]++;
            for (char letter : b) alph[letter - 97]--;
            
            for (int j : alph) if (j != 0) flag = false;
            
            if (flag == true) bw.write("Possible\n");
            else bw.write("Impossible\n");
        }
        
        br.close();
        bw.flush();
        bw.close();
    }
}
