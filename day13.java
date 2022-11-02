abstract class Book {
    String title;
    String author;
    
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    abstract void display();
}

class MyBook extends Book{
    private int price;
    
    public MyBook(String title, String author,int price){
    super( title,  author);
    this.price = price;
    }
    
     void display(){
          System.out.println("Title: "+ title);
    System.out.println("Author: "+author);
    System.out.println("Price: "+ price ); 
    }
    
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String title = in.nextLine();
        String author = in.nextLine();
        int price = in.nextInt();
        MyBook b = new MyBook(title, author, price);
        b.display();
    }
}
