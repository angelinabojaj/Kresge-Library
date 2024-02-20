package library;

public class book {
	private String title;
	private String author;
	private String description;
	private String location;
	private int inventory;
	private int available;
	private int crownNum;
	
	public book(String title, String author, int inventory, int crownNum) {
		this.author = author;
		this.title = title;
		this.inventory = inventory;
		this.available = inventory;
		this.crownNum = crownNum;
	}
	
	public book(String title, String author, int crownNum) {
		this.author = author;
		this.title = title;
		this.crownNum = crownNum;
		inventory = 0;
		available = 0;
	}
	
	//allows the user to set a non-negative inventory value
	public int changeInventory(int newInventory) {
		if(newInventory < -1) {
			System.out.println("Inventory cannot be negative");
			return this.inventory;
		}
		else {
			inventory = newInventory;
			return inventory;
		}
	}
	
	//allows the user to increment inventory up or down 1 value at a time
	public int adjustInventory(boolean upDown) {
		if(upDown == true) {
			inventory += 1;
			return inventory;
		}
		else if(upDown == false && inventory != 0) {
			inventory -= 1;
			return inventory;
		}
		else {
			System.out.println("Inventory cannot be negative");
			return inventory;
		}
	}
	
	public int setAvailable(int available) {
		if(available < 0) {
			System.out.println("Available books cannot be negative");
			return available;
		}
		if(available > inventory) {
			System.out.println("Available books cannot exceed total book inventory");
			return available;
		}
		this.available = available;
		return this.available;
	}
	
	public void setDescription(String newDescription) {
		description = newDescription;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setCrownNum(int crownNum) {
		this.crownNum = crownNum;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public String getDescription(){
		return description;
	}
	
	public String getLocation() {
		return location;
	}
	
	public int getInventory() {
		return inventory;
	}
	
	public int getCrownNum() {
		return crownNum;
	}
	
	public int getAvailable() {
		return available;
	}
	
	public void printBook() {
		System.out.println("Title: " + title + "\nAuthor: " + author + "\nCrown Number: " + crownNum + "\nAvailable Copies: " + inventory + "\nDescription: " + description);
	}
}
