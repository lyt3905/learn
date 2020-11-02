package dataStructure.BubbleSort;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;


public class BubbleTest {
    public static void main(String[] args) {
        Integer[] a={1,2,3,5,4,8,7,6,9};
        BubbleSort.bubblesort(a);
        System.out.println(Arrays.toString(a));
    }
}
