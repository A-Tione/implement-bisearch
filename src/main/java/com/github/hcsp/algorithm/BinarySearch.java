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
        int startIndex = 0;
        int endIndex = strings.length - 1;

        return deepSearchTargetIndex(strings, target, startIndex, endIndex);
    }

    private static int deepSearchTargetIndex(String[] strings, String target, int startIndex, int endIndex) {
        if (startIndex <= endIndex) {
            int halfIndex = (startIndex + endIndex) / 2;
            if (target.equals(strings[halfIndex])) {
                return halfIndex;
            } else if (target.compareTo(strings[halfIndex]) < 0) {
                return deepSearchTargetIndex(strings, target, startIndex, halfIndex - 1);
            } else {
                return deepSearchTargetIndex(strings, target, halfIndex + 1, endIndex);
            }
        } else return -1;
    }
}
