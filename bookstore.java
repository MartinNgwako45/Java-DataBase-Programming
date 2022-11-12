import java.util.Scanner;

public class bookstore {

    public static void main(String[] args) {
       
            Scanner input = new Scanner(System.in);
            int selection = 0;
            
            BookController bookOperations = new BookController();
            String id;
            String title;
            String author;
            int qty;
            //Menu for action selection and user input
            while(selection != 5) {
                System.out.println("Please enter the number corresponding to the action you would like to take:\n"
                        + "1. Insert book\n"
                        + "2. Update book\n"
                        + "3. Delete book\n"
                        + "4. select books\n"
                        + "5. Exit");
                selection = input.nextInt();

                //Selection sorting
                
                switch(selection) {
                //Sending info to the addBook method (book insertion)
                case 1:
                	 //Collecting information of a new book to be entered
					System.out.println("Please enter the ID of the book you would like to put into the system: ");               
           		 id= input.next();
                	System.out.println("Please enter the Title of the book you would like to put into the system: ");
                	input =new Scanner(System.in);
            		 title = "";
            		title+=input.nextLine();
                    System.out.println("Please enter the Author of said book: ");
                    author ="";
                     author+= input.nextLine();
                    
                    System.out.println("Please enter the number of said book currently in stock: ");
                    qty = input.nextInt();
    
					
                    Book bookToBeAdded = new Book(id, title, author, qty);
					bookOperations.create(bookToBeAdded);
                	break;
                	
                	  //Sending info to the updateBook method
                case 2:
                	 //Collecting information of a new book to be modified
                	System.out.println("Please enter the ID of the book you would like to Modify into the system: ");    
            		 id= input.next();
					
                	System.out.println("Please enter the Title of the book you would like to Modify into the system: ");                   
                	input =new Scanner(System.in);
                	title = "";
            		title+=input.nextLine();
                    
                    System.out.println("Please enter the Author of said book: ");
                    author ="";
                    author+= input.nextLine();
                    
                    System.out.println("Please enter the number of said book currently in stock: ");
                     qty = input.nextInt();
					
                    Book bookToBeupdated = new Book(id, title, author, qty);
					
					bookOperations.update(bookToBeupdated);
                	break;
                	
                	 //Sending info to deleteBook method
                case 3:
                	 //Collecting information of a book to be deleted
				System.out.println("Please enter the ID of the book you would like to Delete from the system: ");                
            		String booIdToBeDeleted = input.next();
					bookOperations.delete(booIdToBeDeleted);
                	break;
                	 //select or readBook method
                	
                case 4:
					bookOperations.read();
                	break;
                	
                	// option to exit from the program
                case 5:
					System.exit(0);
                	break;
				default:
				 System.out.println("Sorry, that isn't a valid selection.");
                }
				
            }

    }
}

   
	