import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class BookController {

	Scanner input = new Scanner(System.in);


	public void create(Book bookToAdd) {
		//Collecting book information
		try(PreparedStatement stmt = DbConnector.conn().prepareStatement("INSERT INTO books values(?,?,?,?)")){


			stmt.setString(1,bookToAdd.getId());     
			stmt.setString(2,bookToAdd.getTitle());
			stmt.setString(3,bookToAdd.getAuthor());  
			stmt.setInt(4,bookToAdd.getQty());  
			int response = stmt.executeUpdate();
			System.out.println("Insert successfull");
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}

	}

	public void update(Book bookToUpdate) {
		//Collecting book information
		try(PreparedStatement stmt = DbConnector.conn().prepareStatement("UPDATE books set title=?, author=?, qty=? where id=?");){


			stmt.setString(4,bookToUpdate.getId());     
			stmt.setString(1,bookToUpdate.getTitle());
			stmt.setString(2,bookToUpdate.getAuthor());  
			stmt.setInt(3,bookToUpdate.getQty());  
			int response = stmt.executeUpdate();
			System.out.println("updated successfull");
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

	public void delete(String bookIdToDelete) {

		try(PreparedStatement stmt = DbConnector.conn().prepareStatement("delete from books where id=?");){


			stmt.setString(1,bookIdToDelete);     
			int response = stmt.executeUpdate();

			System.out.println("Delete successfull");
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	public void read() {
		try(PreparedStatement stmt = DbConnector.conn().prepareStatement("select * from books");){



			ResultSet results= stmt.executeQuery();  
			while (results.next()) {
				String id = results.getString("id");
				String title = results.getString("title");
				String author = results.getString("author");
				Integer qty = results.getInt("qty");

				System.out.println("Title: " + title + "\nAuthor: " + author + "\nNumber in stock: " + qty + "\n");
				System.out.println("-----------------------------------------------------------------------------");

				System.out.println("Read successfull");
			}


		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
