package dataStructure.InsertSort;

import dataStructure.SelectionSort.SelectionSort;

import java.util.Arrays;

public class InsertTest {
    public static void main(String[] args) {
        Integer[] a={8,7,6,9,1,2,3,5,4};
        InsertSort.Insert(a);
        System.out.println(Arrays.toString(a));
    }
}
