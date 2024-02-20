/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package search;

/**
 *
 * @author hayapirzada
 */
public class Books {
    
    private String title;
    private String author;
    private int crownNumber;
   

    // Constructor
    public Books(int crownNumber, String title, String author) {
        this.title = title;
        this.author = author;
        this.crownNumber = crownNumber;
        
    }

    // Getters and setters for crownNumber title, author
    public int getCrownNumber() {
        return crownNumber;
    }

    public void setCrownNumber(int crownNumber) {
        this.crownNumber = crownNumber;
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    

}
