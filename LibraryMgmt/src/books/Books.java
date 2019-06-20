package books;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

import static java.time.temporal.ChronoUnit.DAYS;

public class Books {
    Scanner scan = new Scanner(System.in);
    public String bookName;
    public String authorName;
    public int bookId;
    public int issuedId;
    boolean issued;
    LocalDate  issuedate;

    Books(int bid,String bname,String aname){
        bookId=bid;
        bookName=bname;
        authorName=aname;
    }
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
        System.out.println("Enter name of Book: ");
        bookName=scan.nextLine();
        System.out.println("Enter author name: ");
        authorName=scan.nextLine();
        System.out.println("Enter Member ID");
        issuedId= scan.nextInt();
        System.out.println("Enter Book ID: ");
        bookId = scan.nextInt();
        LocalDate returndate=getDate();
        long days = DAYS.between(issuedate,returndate);
        System.out.println("Amount have to pay: "+ fineBook(days));
    }
    int fineBook(long days){

        if(days<=10 && days>0)
            return 2;
        else if(days >10 && days<=20)
            return 10+2;
        else if(days>20)
            return 20+2;
        else
            return 2;
    }
    void searchBook(){

    }
    void availableDate()
    {

    }
    String getAuthorName() {
        return this.authorName;
    }
    String getBookName()
    {
        return this.bookName;
    }
    int getBookId()
    {
        return bookId;
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

    static ArrayList<Books> putList()
    {
        ArrayList<Books> list=new ArrayList<Books>();
        list.add(new Books(1,"Hello","Ana"));
        list.add(new Books(2,"World","John"));
        list.add(new Books(3,"Life","Guru"));
        return list;
    }

    static  String compareComparator()
    {
        ArrayList<Books> list=putList();
        AuthorCompare acom = new AuthorCompare();
        String str = "";
        Collections.sort(list,acom);
        for (Books b:list)
        {
            str += b.getBookId() + "  "  +
                    b.getBookName() + "  " +
                    b.getAuthorName() + "  \n";
        }
        return str;
    }

    static String searchAuthor(String Name)
    {
        ArrayList<Books> list=putList();
        String flag="Not Found";
        for(Books b: list){
            if(b.getAuthorName()==Name) {
                return b.getBookId() + "  "  +
                        b.getBookName() + "  " +
                        b.getAuthorName() + "  \n";

            }
        }
        return flag;

    }

    public static void main(String[] args) {

        System.out.println(compareComparator());
        System.out.println(searchAuthor("Guru"));
        System.out.println(searchAuthor("Om"));
    }

}

class AuthorCompare implements Comparator<Books>
{
    public int compare(Books b1, Books b2)
    {
        return b1.getAuthorName().compareTo(b2.getAuthorName());
    }
}
class BookCompare implements Comparator<Books>
{
    public int compare(Books b1, Books b2)
    {
        return b1.getBookName().compareTo(b2.getBookName());
    }
}