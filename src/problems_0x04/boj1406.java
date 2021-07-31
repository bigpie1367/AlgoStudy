package problems_0x04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.LinkedList;

public class boj1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String str = br.readLine();
        int N = Integer.parseInt(br.readLine());
        
        LinkedList<Character> list = new LinkedList<>();    
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }
        
        int size = list.size();
        int cursor = list.size();
        
        for (int i = 0; i < N; i++) {
            String[] line = br.readLine().split(" ");
            
            if (line[0].equals("L")) {
                if (cursor > 0) cursor -= 1;
            } else if (line[0].equals("D")) {
                cursor += 1;
            } else if (line[0].equals("B")) {
                list.remove(cursor);
            } else if (line[0].equals("P")) {
                if (cursor >= size) {
                    list.add(cursor, line[1].charAt(0));
                } else {
                    list.add(cursor + 1, line[1].charAt(0));
                }
            }
        }
        
        for (Character word : list) {
            bw.write(word + "");
        }
        
        br.close();
        bw.flush();
        bw.close();
    }
}
