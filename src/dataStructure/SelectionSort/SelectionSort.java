package dataStructure.SelectionSort;

public class SelectionSort {
    static void Selection(Comparable[] a){
        for (int i = 0; i < a.length; i++) {
            int min=i;//记录每次遍历时的最小值
            for (int j = i; j < a.length; j++) {
                if(greater(a[min],a[j]))
                    min=j;
            }
            exch(a,i,min);
        }

    }
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
