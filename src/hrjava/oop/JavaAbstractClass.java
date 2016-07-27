package hrjava.oop;


public class JavaAbstractClass {
    abstract class Book {
        String title;

        String getTitle() {
            return title;
        }

        abstract void setTitle(String s);
    }

    //Write MyBook class here
    class MyBook extends Book {
        void setTitle(String s) {
            this.title = s;
        }
    }
}
