package Java;
import java.util.Scanner;

public class Main {

  
       

    
    public static void main(String[] args) {
        System.out.println("1. Book Title");
        System.out.println("2. Author");
        System.out.println("3. Book Genre");
        System.out.println("4. Publisher name");
        System.out.println("5. Number of pages");
        Scanner jajaja = new Scanner(System.in);
        
        Book lordofthebook = new Book();
        lordofthebook.title = "Lord of the Book";
        lordofthebook.author = "Claude Code";
        lordofthebook.genre = "Fantasy";
        lordofthebook.publisher = "Publisher Name Inc.";
        lordofthebook.numberOfPages = "ALL OF THEM";
        int kakaka = jajaja.nextInt();
        switch(kakaka) {
            case 1 :
                System.out.println(lordofthebook.title);
                break;
            case 2 :
                System.out.println(lordofthebook.author);
                break;
            case 3 :
                System.out.println(lordofthebook.genre);
                break;
            case 4 :
                System.out.println(lordofthebook.publisher);
                break;
            case 5 :
                System.out.println(lordofthebook.numberOfPages);
                break;
        }


        }


    }


       class Book {
        public String title;
        public String author;
        public String genre;
        public String publisher;
        public String numberOfPages;

        
    } 

