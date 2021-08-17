package problems_0x05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

class Building {
    int num;
    int height;

    public Building(int num, int height) {
        this.num = num;
        this.height = height;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        Stack<Building> stack = new Stack<>();
        
        int N = Integer.parseInt(br.readLine());
        long sum = 0;
        int height;

        for (int i = 0; i < N; i++) {
            height = Integer.parseInt(br.readLine());
            Building building = new Building(i, height);
            
            while (!stack.isEmpty() && stack.peek().height <= height) {
                stack.pop();
            }
            
            sum += stack.size();
            stack.push(building);
        }

        sb.append(sum);
        System.out.println(sb);
    }
}
