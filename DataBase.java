package library;
import java.util.ArrayList;
//import library.book;
public class DataBase {

	private ArrayList<book> bookList;
	private int bookListSize;
	public DataBase() {
		bookListSize = 0;
		ArrayList<book> bookList = new ArrayList<book>();
			
		}
	
	public void addBook(String title, String author, int inventory){
		
		book tempBook = new book(title, author, inventory);
		bookList.add(tempBook);
		bookListSize += 1;

	}
	
	//checks to see if a book title is already in use
	public boolean checkTitle(String title) {
		//boolean repeatTitle = false;
		for(int i = 0; i < bookList.size(); i++) {
			if(title == bookList.get(i).getTitle()) {
				return true;
			}
		}
		return false;
	}
	
	public void printBookList() {
		for(int i = 0; i < bookList.size(); i++) {
			System.out.println("Book Title: " + bookList.get(i).getTitle() + "Book Author: " + bookList.get(i).getAuthor() + "Copies Available: " + bookList.get(i).getInventory());
		}
	}
	//searches array for first book matching the inputed title and returns it, returns first book if no matching book was found
	public book findBook(String title) {
		for(int i = 0; i < bookList.size(); i++) {
			if(title == bookList.get(i).getTitle()) {
				return bookList.get(i);
			}
		}
		return bookList.get(0);
	}
	
	//searches array and returns book with matching crown number or returns first book if unsuccessful
	public book findBook(int crownNum) {
		for(int i = 0; i < bookList.size(); i++) {
			if(crownNum == bookList.get(i).getCrownNum()) {
				return bookList.get(i);
			}
		}
		return bookList.get(0);
	}
	
	//searches for book with matching crown number and removes it if found then returns true, returns false otherwise
	public boolean removeBook(int crownNum) {
		for(int i = 0; i < bookList.size(); i++) {
			if(crownNum == bookList.get(i).getCrownNum()) {
				bookList.remove(i);
				bookListSize -= 1;
				return true;
			}
		}
		return false;
	}
	
	public void getBookInfo(int crownNum) {
		for(int i = 0; i < bookList.size(); i++) {
			if(crownNum == bookList.get(i).getCrownNum()) {
				bookList.get(i).printBook();
				break;
			}
		}
		System.out.println("Could not find book");
	}
	
	//Searches for book, if found, returns current inventory, otherwise returns -1
	public int checkBookAvailability(int crownNum) {
		for(int i = 0; i < bookList.size(); i++) {
			if(crownNum == bookList.get(i).getCrownNum()) {
				return bookList.get(i).getInventory();
			}
		}
		System.out.println("Book not found");
		return -1;
	}
	
	public ArrayList<book> authorBooks(String author){
		ArrayList<book> tempList = new ArrayList<book>();
		for(int i = 0; i < bookList.size(); i++) {
			if(author == bookList.get(i).getAuthor()) {
				tempList.add(bookList.get(i));
			}
		}
		return tempList;
		
	}
	public int getListSize() {
		return bookList.size();
	}
}
