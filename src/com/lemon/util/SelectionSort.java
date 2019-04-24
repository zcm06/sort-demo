package com.lemon.util;
/**
 * 选择排序
 * @author DELL
 *
 */
public class SelectionSort
{
    public static int[] sort(int[] arr)
    {

        if (arr.length <= 1 || arr == null)
        {
            return arr;
        }

        for (int i = 0; i < arr.length; i++)
        {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[j] < arr[minIndex])
                {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        return arr;

    }
}
