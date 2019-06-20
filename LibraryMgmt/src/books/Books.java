package books;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Books {
    Scanner scan = new Scanner(System.in);
    public String bookName;
    public String authorName;
    public int bookId;
    public int issuedId;
    boolean issued;
    LocalDate  issuedate;


    void issueBook(){
        System.out.println("Enter name of Book: ");
        bookName=scan.nextLine();
        System.out.println("Enter author name: ");
        authorName=scan.nextLine();
        System.out.println("Enter Member ID");
        issuedId= scan.nextInt();
        System.out.println("Enter Book ID: ");
        bookId = scan.nextInt();
        issuedate=getDate();

    }
    void returnBook(){

    }
    void fineBook(){

    }
    void searchBook(){

    }
    void availableDate()
    {

    }


    public LocalDate getDate() {
        System.out.println("Enter Date (dd/mm/yyyy) ");
        String Strdate =new Scanner(System.in).nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
        //convert String to LocalDate
        LocalDate localDate = LocalDate.parse(Strdate, formatter);
        System.out.println(localDate);
        return localDate;
    }
}

