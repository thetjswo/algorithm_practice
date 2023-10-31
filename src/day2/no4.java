package day2;

import com.sun.xml.internal.bind.v2.TODO;

import java.util.Scanner;

public class no4 {

    //TODO 좀 더 확실하게 이해할 필요가 있음
    static Integer[][] dp = new Integer[41][2];

    public static void main(String[] args){

        dp[0][0] = 1;
        dp[0][1] = 0;
        dp[1][0] = 0;
        dp[1][1] = 1;

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0 ; i < T ; i++){
            int N = sc.nextInt();
            fibonacci(N);
            System.out.println(dp[N][0]+" "+dp[N][1]);
        }
    }

    static Integer[] fibonacci(int n) {
        if (dp[n][0] == null || dp[n][1] == null) {
            dp[n][0] = fibonacci(n - 1)[0] + fibonacci(n - 2)[0];
            dp[n][1] = fibonacci(n - 1)[1] + fibonacci(n - 2)[1];
        }

        return dp[n];
    }
}
