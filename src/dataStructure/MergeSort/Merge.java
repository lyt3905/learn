package dataStructure.MergeSort;

public class Merge {
    static Comparable[] assist;
    static void sort(Comparable[] a ){
        assist=new Comparable[a.length];
        int lo=0;
        int hi=a.length-1;
        sort(a,lo,hi);
    }
    static void sort(Comparable[] a,int lo,int hi ){
        if(lo>=hi)
            return;
        int mid=lo+(hi-lo)/2;
        sort(a,lo,mid);
        sort(a,mid+1,hi);
        merge(a,lo,mid,hi);
    }
    static void merge(Comparable[] a,int lo,int mid ,int hi){
        //定义三个指针用
        int p1=lo ,  p2=mid+1;
        int i=lo;
        while (p1<=mid && p2<=hi){
            if(greater(a[p1],a[p2]))
                assist[i++]=a[p2++];
            else
                assist[i++]=a[p1++];
        }
        while (p1<=mid){
            assist[i++]=a[p1++];
        }
        while (p2<=hi){
            assist[i++]=a[p2++];
        }
        for (int j = lo; j <=hi ; j++) {
            a[j]=assist[j];
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
