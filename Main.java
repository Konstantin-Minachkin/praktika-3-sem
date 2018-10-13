package com.company;
import java.util.Scanner;

public class Main {
        public static void rec(int k, int max, Scanner in) {
            int a = in.nextInt();
            if (a > 0) {
                if (a > max) rec(0, a, in);
                else if (a == max) {
                    rec(++k, max, in);
                }
                else rec(k, max, in);
            } else
                System.out.println(k);
        }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        rec(0, 0, in);
    }
}
