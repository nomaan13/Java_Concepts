package collection_framework;
import java.util.*;

public class HashTable {
    public static void main(String args[]){
        Hashtable<Integer,String> hm=new Hashtable<Integer,String>();


        hm.put(108,"Amit");
        hm.put(112,"Ravi");
        hm.put(101,"Vijay");
        hm.put(103,"Rahul");

        System.out.println(hm);


    }
}