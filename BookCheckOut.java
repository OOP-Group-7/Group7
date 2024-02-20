
package bookcheckout;
import java.util.Scanner;

public class BookCheckOut {

String book_name;
int n_books;
  
   public static void main(String[] args) {
       
       Scanner a=new Scanner(System.in);
       
       System.out.println("Enter number of books you need");
       
       int n_books=a.nextInt();
       for(int i=1;i<=n_books;i++){
       if(n_books<=3){
           
         
       
           System.out.println("enter name of book" +i);
           String book_name=a.nextLine();
           
       }
        
   else {
           System.out.println("maxmum number of book to chacked out is 3 !!");
    }
   
     }
   
}
}