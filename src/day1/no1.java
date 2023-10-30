package day1;

import java.util.Scanner;

public class no1 {
    public static void main(String[] args) {
        int a;
        int b;
        int res;

        Scanner sc = new Scanner(System.in);
        System.out.println("Input a");
        a = sc.nextInt();
        System.out.println("Input b");
        b = sc.nextInt();

        res = a + b;
        System.out.println("Result is : " + res);
    }
}
