package dataStructure.MergeSort;

import java.util.Arrays;

public class MergeTest {
    public static void main(String[] args) {
        Integer[] a= {9,8,7,6,5,4,3,2,1,0};
        Merge.sort(a);
        System.out.println(Arrays.toString(a));

    }
}
