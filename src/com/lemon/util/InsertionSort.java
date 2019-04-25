package com.lemon.util;

/**
 * 插入排序
 * @author DELL
 *
 */
public class InsertionSort
{

    public static int[] sort(int[] arr)
    {
        // 通过j向前滑动 对之前的有序部分进行比较排序
        for (int i = 1; i < arr.length; i++)
        {
            for (int j = i; j > 0 && arr[j] < arr[j - 1]; j--)
            {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
            }
        }
        return arr;
    }
}
