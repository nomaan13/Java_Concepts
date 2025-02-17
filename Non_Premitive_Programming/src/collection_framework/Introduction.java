package collection_framework;

import java.util.*;

public class Introduction {
    public static void main(String[] args) {

        //==> use list if u want duplicate element and want insertion order

        List<Integer> collection = new ArrayList<>();
        List<Integer> l1 = new LinkedList<>();
        List<Integer> l2 = new Vector<>();
        List<Integer> l3 = new Stack<>();
         /*
        We can implement List by using ArrayList, LinkedList,Vector,Stack
         */
        ArrayList<Integer> al = new ArrayList<>();
        LinkedList<Integer> l4 = new LinkedList<>();
        Vector<Integer> v = new Vector<>();
        Stack<Integer> st = new Stack<>();

        //==>If there is no duplicate elements are required then we can go with Set Interface and it also doesnot follow Insertion order
        /*
        TO implement set interface we have 3 implemented class of set interface which are
            1.HashSet
            2.LinkedHashSet
            3.TreeSet
         */
        Set<Integer> s = new HashSet<>();
        Set<Integer> s1 = new LinkedHashSet<>();
        Set<Integer> s2 = new TreeSet<>();

        HashSet<String> hs = new HashSet<>();
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        TreeSet<String> ts = new TreeSet<>();

    }
}
