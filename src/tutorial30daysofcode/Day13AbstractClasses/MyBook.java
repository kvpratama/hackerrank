package tutorial30daysofcode.Day13AbstractClasses;

public class MyBook extends Book {

    int price;

    MyBook(String title, String author, int price) {
        super(title, author);
        this.price = price;
    }

    @Override
    void display() {
        System.out.println(
                "Title: " + this.title +
                "\nAuthor: " + this.author +
                "\nPrice: " + this.price);
    }
}
