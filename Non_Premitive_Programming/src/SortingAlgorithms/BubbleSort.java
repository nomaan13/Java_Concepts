package SortingAlgorithms;

public class BubbleSort {
    public static  void bubbleSort(int []a){
        int n = a.length-1;
        for (int i =0;i<=n;i++){

            for (int j =0; j<n-i;j++){
                if (a[j]>a[j+1]){
                    a[j]= a[j] + a[j+1];
                    a[j+1]= a[j] - a[j+1];
                    a[j] = a[j] - a[j+1];
                }
            }
        }
        for (int x : a){
            System.out.print(x+" ");

        }
    }

    public static void main(String[] args) {
        int a[]={114,10,12,59,910,523,747,400};
        System.out.println("Without sorting ");
        for (int x :a){
            System.out.print(x+" ");

        }
        System.out.println("\nAfter sorting ");
        bubbleSort(a);
        System.out.println("\nend");

    }
}
