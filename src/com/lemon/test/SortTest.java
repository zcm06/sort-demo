package com.lemon.test;

import com.lemon.util.InsertionSort;

public class SortTest
{
    public static void main(String[] args)
    {
        int[] arr = {6,2,3,1,7,10,5};
        arr = InsertionSort.sort(arr);
        for(int i : arr){
            System.out.println(i);
        }
        
    }
}
