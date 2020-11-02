package dataStructure.BubbleSort;

public class BubbleSort {
    public static void bubblesort(Comparable[] a){
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j <  a.length-1; j++) {
                if(greater(a[j],a[j+1]))
                    exch(a,j,j+1);

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
