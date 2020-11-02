package dataStructure.ShellSort;

import java.util.Arrays;

public class ShellSort {
    static void shell(Comparable[] a ){
        int h=1;
        while (h<=a.length)
            h=2*h+1;

        while (h>=1) {
            //寻找每组需要排列的值
            for (int i = h; i < a.length; i++) {
                for(int j=i;j>=h;j-=h){
                    if(greater(a[j],a[j-h]))
                        exch(a,j,j-h);
                    else break;
                }
            }




            h/=2;
        }
    }

 /*   static void shell(Comparable[] a){
        //根据数组的长度，确定增长值
        int h=1;
        while (h<a.length/2)
            h=h*2+1;
        //
        System.out.println("h = " + h);
        while (h>=1){
            //找到待插入的元素
            for (int i = h; i <a.length ; i++) {
                //把待插入的元素放入有序队列
                for (int j = i; j >=h; j-=h) {
                    if(greater(a[j-h],a[j])) {
                        exch(a, j - h, j);
                    }
                    else {
                        break;
                    }
                }
            }
            h=h/2;
            System.out.println(Arrays.toString(a));
        }
    }*/
    static boolean greater(Comparable a,Comparable b){
        if(a.compareTo(b)>0)
            return true;
        else
            return false;
    }
    static void exch(Comparable[] a,int i,int j){
        Comparable temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
