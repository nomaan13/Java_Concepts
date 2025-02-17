package collection_framework;

import java.util.Hashtable;
import java.util.Iterator;

public class BookDetails {
    public static void main(String[] args) {
        Hashtable<Integer,Book> h1 = new Hashtable<Integer, Book>();
        Book b1 = new Book("The Jungle Book","Rusking Bond",1967,949.50);
        Book b2 = new Book("Heartburn","Nora Ephron",1970,780.10);
        Book b3= new Book("Harry Porter","JK Rollings",1990,1450.10);
        Book b4 = new Book("Inferno","Dan Brown",2005,505.50);


        h1.put(104,b1);
        h1.put(109,b2);
        h1.put(110,b3);
        h1.put(106,b4);


        System.out.println(h1.toString());



    }
}
