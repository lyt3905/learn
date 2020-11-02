package dataStructure.SelectionSort;

import dataStructure.BubbleSort.BubbleSort;

import java.util.Arrays;

public class SelectionTest {
    public static void main(String[] args) {
        Integer[] a={1,2,3,5,4,8,7,6,9};
        SelectionSort.Selection(a);
        System.out.println(Arrays.toString(a));
    }
}
