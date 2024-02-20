import java.util.Scanner;

public class BookCheckOut {
    int n_books;
  
   public static void main(String[] args) {
       
       String book_name = null;
       Scanner a=new Scanner(System.in);
       Scanner b=new Scanner(System.in);
       System.out.println("Enter number of books you need to checkout:");
       
       int n_books=a.nextInt();
       
          
           if(n_books<=3){
               for(int i=1;i<=n_books;i++){
    
              System.out.println("Enter name of Book" +i);
          book_name=b.nextLine();
       }
         }      
               else{
       
           System.out.println("Maximum number of book is 3");
           
       }
        int i = 1;   
          while(i<=3){
          // for(int j=1;j<=3;j++){\
          
          if(i==3)
          
          {break;}
          
           System.out.println("name of book "+i+" is: "+book_name);  
           i++;
          
          
           }
           }
           
           
       }
      
   