package com.github.guolll.programming;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class BinarySearch {
    public static int rank(int key, int[] a) { // 数组必须是有序的
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) { // 被查找的键要么不存在，要么必然存在于 a[lo..hi] 之中
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) {
                hi = mid - 1;
            } else if (key > a[mid]) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] sort = {1, 2, 7, 8, 9, 24, 32, 34, 72};
        Arrays.sort(sort);
        System.out.print("请输入一个数字：");
        while (!StdIn.isEmpty()) { // 读取键值，如果不存在于白名单中则将其打印
            int key = StdIn.readInt();
            int result = rank(key, sort);
            if (result < 0) {
                System.out.print("当前数字不存在于数组中：");
                StdOut.println(key);
            } else {
                System.out.println("当前数字的下标为：" + result);
            }
        }
    }
}