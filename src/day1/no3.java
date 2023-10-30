package day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class no3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for (int i=0;i<T;i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());

            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());

            sb.append(expected_location(x1,y1,r1,x2,y2,r2)).append("\n");
        }
        System.out.println(sb);
    }

    public static int expected_location(int x1, int y1, int r1, int x2, int y2, int r2) {
        int criteria = (int)(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));

        if(x1 == x2 && r1 == r2) return -1;
        else if(Math.pow(r1+r2,2)<criteria || Math.pow(r2-r1,2)>criteria) return 0;
        else if(Math.pow(r1+r2,2)==criteria || Math.pow(r2-r1,2)==criteria) return 1;
        else return 2;
    }
}
