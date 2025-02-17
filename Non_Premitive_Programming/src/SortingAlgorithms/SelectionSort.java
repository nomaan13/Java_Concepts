package SortingAlgorithms;

public class SelectionSort {

    public static void insertionSort(int[]a){
        for (int i =1;i<a.length;i++)
        {
            int key= a[i];
            int j = i-1;

            while (j>=0 && key<a[j]){
                a[j+1] =a[j];
                j--;
            }
            a[j+1]=key;
        }

        for (int x:a){
            System.out.print(x+" ");
        }
    }
    public static void main(String[] args) {
        int a[] ={18,17,30,24,15};

        insertionSort(a);
    }
}
