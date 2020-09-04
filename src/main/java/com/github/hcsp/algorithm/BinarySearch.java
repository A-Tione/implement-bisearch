package com.github.hcsp.algorithm;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(binarySearch(new String[] {"aaa", "ccc", "fff", "yyy", "zzz"}, "bbb"));
        System.out.println(binarySearch(new String[] {"aaa", "ccc", "fff", "yyy", "zzz"}, "yyy"));
    }

    // 给定一个按照字符串升序升序排好序的用户数组，寻找目标字符串的位置，返回其索引值
    // 如果未找到，返回-1
    // 我们鼓励你使用递归和非递归两种方式
    public static int binarySearch(String[] strings, String target) {
        int start = 0, end = strings.length - 1;

        while (start < end) {

            if (strings[start].equals(target)) {
                return start;
            }

            if (strings[end].equals(target)) {
                return end;
            }

            int mid = (start + end) / 2;

            if (strings[mid].charAt(0) > target.charAt(0)) {
                end = mid - 1;
            } else if (strings[mid].charAt(0) < target.charAt(0)) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
