package generics;

public class GenericMethodExample {

    public static <T>void printArray(T[] a ){
        for(T x : a){
            System.out.print(x+" ");
        }
    }
}
