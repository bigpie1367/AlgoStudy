package problems_0x04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.ListIterator;

public class boj5397 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            
            LinkedList<Character> list = new LinkedList<>();
            ListIterator<Character> iter = list.listIterator();
            
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                
                switch(c) {
                    case '<' :
                        if (iter.hasPrevious()) {
                            iter.previous();
                        }
                        break;
                    case '>' :
                        if (iter.hasNext()) {
                            iter.next();
                        }
                        break;
                    case '-' :
                        if (iter.hasPrevious()) {
                            iter.previous();
                            iter.remove();
                        }
                        break;
                    default :
                        iter.add(c);
                        break;
                }
            }
            
            for (char c : list) {
                bw.write(c + "");
            }
            
            bw.write("\n");
        }
        
        br.close();
        bw.flush();
        bw.close();
    }
}
