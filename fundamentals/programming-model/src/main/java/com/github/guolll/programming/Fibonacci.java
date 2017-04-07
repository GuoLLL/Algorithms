package com.github.guolll.programming;

import edu.princeton.cs.algs4.StdOut;

import java.math.BigInteger;

public class Fibonacci {

    static BigInteger[] sort = new BigInteger[100];

    public static long F(int N) {
        if (N == 0) return 0;
        if (N == 1) return 1;
        return F(N - 1) + F(N - 2);
    }

    public static void main(String[] args) {
        int[] sort = new int[100];
        for (int N = 0; N < 100; N++)
            StdOut.println(N + " " + F(N));

    }

    public static BigInteger F2(int N) {
        if (N == 0) {
            sort[0] = BigInteger.valueOf(0);
            return BigInteger.valueOf(0);
        }
        if (N == 1) {
            sort[1] = BigInteger.valueOf(1);
            return BigInteger.valueOf(1);
        }
        sort[N] = sort[N - 2].add(sort[N - 1]);
        return sort[N];
    }
}