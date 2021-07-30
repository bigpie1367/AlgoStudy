package problems_0x03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int x = Integer.parseInt(br.readLine());
        int cnt = 0;
        
        Arrays.sort(arr);
        
        int strIdx = 0;
        int endIdx = N - 1;
        
        while (strIdx < endIdx) {
            int sum = arr[strIdx] + arr[endIdx];
            
            if (sum == x) {
                cnt++;
                endIdx--;
                strIdx++;
            } else if (sum > x) {
                endIdx--;
            } else if (sum < x) {
                strIdx++;
            }
        }
        
        bw.write(cnt + "\n");
        
        br.close();
        bw.flush();
        bw.close();
    }
}
