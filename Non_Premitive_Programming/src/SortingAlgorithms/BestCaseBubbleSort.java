package SortingAlgorithms;

public class BestCaseBubbleSort {
    public static void sort(int []a){
        int n = a.length-1;

        for (int i =0;i<n;i++){
            int count=0;

            for (int j= 0;j<n-i;j++){
                if (a[j]>a[j+1]){

                    a[j]=a[j]+a[j+1];
                    a[j+1]=a[j]-a[j+1];
                    a[j]=a[j]-a[j+1];
                    count++;
                }

                }
            if (count==0){

                break;
            }


        }
        System.out.println("Array after sorting is : ");
        for (int x: a){
            System.out.print(x+" ");
        }
    }
    public static void main(String[] args) {
        int a[]={10,17,18,25,45,55,60,79,81,90};
        sort(a);

    }
}
