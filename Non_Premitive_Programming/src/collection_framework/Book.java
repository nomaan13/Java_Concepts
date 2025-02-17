package collection_framework;

public class Book {
    String book_name;
    String book_author;
    int publish_year;
    double price;

    Book(){}

    Book(String book_name, String book_author,int publish_year,double price){
        this.book_name=book_name;
        this.book_author=book_author;
        this.publish_year=publish_year;
        this.price=price;

    }

    @Override
    public String toString() {
        return "Book_name is : "+book_name+"\nBook_author is:"+book_author+"\nPublish Year is:"+ publish_year+"\nPrice is :"+price+"\n";
    }
}
