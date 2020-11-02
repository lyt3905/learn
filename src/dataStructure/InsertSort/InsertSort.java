package dataStructure.InsertSort;

public class InsertSort {
    static void Insert(Comparable[] a){
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j >0 ; j--) {
                if(greater(a[j-1],a[j]))
                    exch(a,j,j-1);
                else break;
            }

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
