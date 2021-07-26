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
        
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        int sex, grade, rooms = 0;
        
        int[][] students = new int[2][6];
        
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            sex = Integer.parseInt(st.nextToken());
            grade = Integer.parseInt(st.nextToken());
            
            students[sex][grade - 1]++;
        }
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 6; j++) {
                if (students[i][j] % K == 0) rooms += students[i][j] / K;
                else rooms += students[i][j] / K + 1;
            }
        }
        
        bw.write(rooms + "\n");
        
        br.close();
        bw.flush();
        bw.close();
    }
}