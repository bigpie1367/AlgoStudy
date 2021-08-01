package problems_0x04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        LinkedList<Character> texts = new LinkedList<>();
        
        String plainText = br.readLine();
        int M = Integer.parseInt(br.readLine());

        for (int i = 0; i < plainText.length(); i++) {
            texts.add(plainText.charAt(i));
        }
        
        ListIterator<Character> iter = texts.listIterator();
        
        while (iter.hasNext()) {
            iter.next();
        }
        
        for (int i = 0; i < M; i++) {
            String command = br.readLine();
            char c = command.charAt(0);
            
            switch (c) {
                case 'L' :
                    if (iter.hasPrevious()) iter.previous();
                    break;
                case 'D' :
                    if (iter.hasNext()) iter.next();
                    break;
                case 'B' :
                    if (iter.hasPrevious()) {
                        iter.previous();
                        iter.remove();
                    }
                    
                    break;
                case 'P' :
                    char t = command.charAt(2);
                    iter.add(t);
                    
                    break;
            }
        }
        
        for (Character text : texts) {
            bw.write(text + "");
        }
        
        br.close();
        bw.flush();
        bw.close();
    }
}
