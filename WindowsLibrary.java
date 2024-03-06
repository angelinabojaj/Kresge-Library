// Imports
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;


// Developer: Angelina Bojaj
// The Mock GUI is a sample of what the GUI would look like.
    // As our team wanted to focus on the features to be implemented and back-end coding, we opted for a simple GUI.
    // In the next midterm project the GUI will be based in JavaFX rather than Java AWT

public class WindowsLibrary extends Frame{
    
    // Colors Used Throughout GUI
        // This is declared here to allow it to be accessible throughout any class in the GUI program
        int redBack = 196;
        int greenBack = 232;
        int blueBack = 203;

        int redBanner = 136;
        int greenBanner = 208;
        int blueBanner = 150;

    public WindowsLibrary(){

        // Window
        setTitle("Welcome Screen");
        setSize(800,600);
        setLayout(null);
        setBackground(new Color(redBack, greenBack, blueBack));

        // Font
        Font font = new Font("Verdana", Font.BOLD, 40);

        // Title & Banner
        Label welcomeLabel = new Label("     Kresge Library");
        welcomeLabel.setBounds(0, 0, 800, 100);
        welcomeLabel.setFont(font);
        welcomeLabel.setBackground(new Color(redBanner, greenBanner, blueBanner));
        welcomeLabel.setForeground(Color.BLACK);

        // Text Area
        JTextArea descriptionArea = new JTextArea ("Kresge Library is one of many libraries found across Oakland University. Its location is on 100 Library Dr and is open 24 hours a day, unless otherwise stated. This program is intended to help you as students find materials and study spaces across the library itself. At the same time, accessibility features such as text to speech have been added to help aid students who face visual impairments.");
        descriptionArea.setBounds(200, 250, 350, 150);
        descriptionArea.setEditable(false);
        descriptionArea.setLineWrap(true);
        descriptionArea.setWrapStyleWord(true);
        descriptionArea.setBackground(Color.WHITE);
        descriptionArea.setForeground(Color.BLACK);

        // Buttons (Locations, Size, and Actions)
        Button loginButton = new Button("Login");
        loginButton.setBounds(50,200,90,90);
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Open the login window
                new LoginWindow();
            }
        });

        Button createButton = new Button ("Create Account");
        createButton.setBounds(50,300,90,90);
        createButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                // Open the create account window
                new CreateAccountWindow();
            }
        });

        Button removeAccountButton = new Button ("Remove Account");
        removeAccountButton.setBounds(50,400,90,90);
        removeAccountButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                // Open the create account window
                new removeAccountWindow();
            }
        });

        // Placing Items
        add(welcomeLabel);
        add(descriptionArea);
        add(loginButton);
        add(createButton);
        add(removeAccountButton);

        // Frame is Visible
        setVisible(true);

        // Closing Frames
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent windowEvent){
                System.exit(0);
            }
        });

    }

    // The Login Window
    class LoginWindow extends Frame {

        public LoginWindow(){
            
            // Title
            setTitle("Login Window");
            setSize(800,600);
            setLayout(null);
            setBackground(new Color(redBack, greenBack, blueBack));

            // Font
            Font font = new Font("Verdana", Font.BOLD, 40);

            // Labels (Bounds)
            // Title & Banner
            Label welcomeLabel = new Label("     Kresge Library");
            welcomeLabel.setBounds(0, 0, 800, 100);
            welcomeLabel.setFont(font);
            welcomeLabel.setBackground(new Color(redBanner, greenBanner, blueBanner));
            welcomeLabel.setForeground(Color.BLACK);
    

            Label userNameLabel = new Label ("Username: ");
            userNameLabel.setBounds(50,200, 70, 20);

            Label passWordLabel = new Label ("Password: ");
            passWordLabel.setBounds(50, 280, 70, 20);

            // Textfields (User Input)
            TextField userNameTextField = new TextField();
            userNameTextField.setBounds(140, 200, 150, 20);

            TextField passWorTextField = new TextField();
            passWorTextField.setBounds(140, 280, 150, 20);

            // Buttons (Created, Location, Action)
            Button loginButton = new Button ("Login");
            loginButton.setBounds(50,450,80,30);
            loginButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Username Received");
                    System.out.println("Password Received");

                    //Call the logIn method from the User Class (Made By Samia & Alexandra)
                    User.logIn(userNameTextField.getText(), passWorTextField.getText());

                    // For right now, just for the presentation, the user is logged in regardless
                    new HomeScreenWindow();

                    //Close Previous Window
                    dispose();
                }
            });

            Button backButton = new Button (" <--- Back");
            backButton.setBounds(50,130,80,30);
            backButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    //Close the Login Window and Go Back To Welcome Screen
                    dispose();
                }
            });

            // Login Window Features Added
            add(welcomeLabel);
            add(userNameLabel);
            add(passWordLabel);
            add(userNameTextField);
            add(passWorTextField);
            add(loginButton);
            add(backButton);

            // Login Window Made Visible
            setVisible(true);

            addWindowListener(new java.awt.event.WindowAdapter() {
                public void windowClosing(java.awt.event.WindowEvent windowEvent){
                    dispose();
                }
            });

        }
    }

    // Create Account Window
    class CreateAccountWindow extends Frame{

        public CreateAccountWindow(){

            // Title
            setTitle("Create Account Window");
            setSize(800,600);
            setLayout(null);
            setBackground(new Color(redBack, greenBack, blueBack));

            // Font
            Font font = new Font("Verdana", Font.BOLD, 40);

            // Labels (Create & Bounds)
            // Title & Banner
            Label welcomeLabel = new Label("     Kresge Library");
            welcomeLabel.setBounds(0, 0, 800, 100);
            welcomeLabel.setFont(font);
            welcomeLabel.setBackground(new Color(redBanner, greenBanner, blueBanner));
            welcomeLabel.setForeground(Color.BLACK);

            Label firstNameLabel = new Label("First Name:");
            firstNameLabel.setBounds(50, 200, 70, 20);

            Label lastNameLabel = new Label("Last Name:");
            lastNameLabel.setBounds(50, 240, 70, 20);

            Label emailLabel = new Label("Email:");
            emailLabel.setBounds(50, 280, 70, 20);

            Label userNameLabel = new Label("Username:");
            userNameLabel.setBounds(50, 320, 70, 20);

            Label passWordLabel = new Label("Password:");
            passWordLabel.setBounds(50, 360, 70, 20);

            // Textfields (Create & Bounds)
            TextField firstNameTextField = new TextField();
            firstNameTextField.setBounds(140, 200, 150, 20);

            TextField lastNameTextField = new TextField();
            lastNameTextField.setBounds(140, 240, 150, 20);

            TextField emailTextField = new TextField();
            emailTextField.setBounds(140, 280, 150, 20);

            TextField userNameTextField = new TextField();
            userNameTextField.setBounds(140, 320, 150, 20);

            TextField passWordTextField = new TextField();
            passWordTextField.setBounds(140, 360, 150, 20);

            // Buttons (Create, Bounds & Actions)
            Button createAccountButton = new Button("Create Account");
            createAccountButton.setBounds(50, 440, 120, 30);
            createAccountButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    System.out.println("First Name Received");
                    System.out.println("Last Name Received");
                    System.out.println("Email Received");
                    System.out.println("Username Received");
                    System.out.println("Password Received");

                    User.createAccount(firstNameTextField.getText(), lastNameTextField.getText(), emailTextField.getText(), userNameTextField.getText(), passWordTextField.getText());
                }
            });


            Button backButton = new Button (" <--- Back");
            backButton.setBounds(50,130,80,30);
            backButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    //Close the Login Window and Go Back To Welcome Screen
                    dispose();
                }
            });

            // Create Account Window Features Added
            add(welcomeLabel);
            add(firstNameLabel);
            add(lastNameLabel);
            add(emailLabel);
            add(userNameLabel);
            add(passWordLabel);

            add(firstNameTextField);
            add(lastNameTextField);
            add(emailTextField);
            add(userNameTextField);
            add(passWordTextField);

            add(createAccountButton);
            add(backButton);

            // Create Account Visible
            setVisible(true);

            addWindowListener(new java.awt.event.WindowAdapter() {
                public void windowClosing(java.awt.event.WindowEvent windowEvent){
                    dispose();
                }
            });

        }
    }

    // Remove Account Window
    class removeAccountWindow extends Frame{

        public removeAccountWindow(){

            //Title
            setTitle("Remove Account");
            setSize(800,600);
            setLayout(null);
            setBackground(new Color(redBack, greenBack, blueBack));

            // Font
            Font font = new Font("Verdana", Font.BOLD, 40);

            // Labels (Create & Bound)

            // Title & Banner
            Label welcomeLabel = new Label("     Kresge Library");
            welcomeLabel.setBounds(0, 0, 800, 100);
            welcomeLabel.setFont(font);
            welcomeLabel.setBackground(new Color(redBanner, greenBanner, blueBanner));
            welcomeLabel.setForeground(Color.BLACK);

            Label userNameLabel = new Label("Username:");
            userNameLabel.setBounds(50, 200, 70, 20);

            Label passWordLabel = new Label("Password:");
            passWordLabel.setBounds(50, 240, 70, 20);

            // Textfield (Create & Bound)
            TextField userNameTextField = new TextField();
            userNameTextField.setBounds(140, 200, 150, 20);

            TextField passWordTextField = new TextField();
            passWordTextField.setBounds(140, 240, 150, 20);

            // Text Area
            JTextArea warningRemoveTextArea = new JTextArea("Note: Once you remove your account, all information pertaining to you is deleted as well. Any saved personal information, books saved, or room reservations will be deleted as well.");
            warningRemoveTextArea.setBounds(50, 300, 250, 130);
            warningRemoveTextArea.setLineWrap(true);
            warningRemoveTextArea.setWrapStyleWord(true);
            warningRemoveTextArea.setBackground(new Color(redBack, greenBack, blueBack));
            warningRemoveTextArea.setEditable(false);

            // Buttons (Create, Bound, & Actions)
            Button removeAccountButton = new Button("Remove Account");
            removeAccountButton.setBounds(50, 475, 100, 50);
            removeAccountButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    //Call removeAccount method from User class
                    User.removeAccount(userNameTextField.getText(), passWordTextField.getText());

                    System.out.println("Account Removed Sucessfully");
                }
            });
            
            Button backButton = new Button (" <--- Back");
            backButton.setBounds(50,130,80,30);
            backButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    //Close the Login Window and Go Back To Welcome Screen
                    dispose();
                }
            });

            // Remove Acount Window Features Added
            add(welcomeLabel);
            add(userNameLabel);
            add(passWordLabel);

            add(userNameTextField);
            add(passWordTextField);

            add(warningRemoveTextArea);

            add(removeAccountButton);
            add(backButton);

            // Remove Account Visible
            setVisible(true);

            addWindowListener(new java.awt.event.WindowAdapter() {
                public void windowClosing(java.awt.event.WindowEvent windowEvent){
                    dispose();
                }
            });

        }
    }

    // Home Screen Window

    class HomeScreenWindow extends Frame{

        public HomeScreenWindow(){

            //Title
            setTitle("Welcome");
            setSize(800,600);
            setLayout(null);
            setBackground(new Color(redBack, greenBack, blueBack));

            /// Font
            Font font = new Font("Verdana", Font.BOLD, 40);
            Font searchFont = new Font("Verdana", Font.BOLD, 30);

            // Label
            Label searchLabel = new Label("Search");
            searchLabel.setBounds(250,100,100,90);
            searchLabel.setFont(searchFont);

            // Title & Banner
            Label welcomeLabel = new Label("     Kresge Library");
            welcomeLabel.setBounds(0, 0, 800, 100);
            welcomeLabel.setFont(font);
            welcomeLabel.setBackground(new Color(redBanner, greenBanner, blueBanner));
            welcomeLabel.setForeground(Color.BLACK);

            // Text Area (Create & Bound)
            TextArea resultTextArea = new TextArea();
            resultTextArea.setBounds(250, 300, 230, 200);
            resultTextArea.setBackground(Color.WHITE);
            resultTextArea.setEditable(false);

            //Textfields (Create & Bound)
            TextField searchTextField = new TextField();
            searchTextField.setBounds(250,200,200,40);

            // Button (Create, Bound, & Actions)
            Button bookReservations = new Button("Book Reservations");
            bookReservations.setBounds(50,200,120,80);
            bookReservations.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    // Opens up Book Reservation Window
                    new bookReservations();
                }
            });

            Button roomReservations = new Button("Room Reservations");
            roomReservations.setBounds(50,300,120,80);
            roomReservations.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    // Opens up Book Reservation Window
                    new roomReservations();
                }
            });

            Button logOutButton = new Button("Log Out");
            logOutButton.setBounds(50,400,120,80);
            logOutButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    //Close the Login Window and Go Back To Welcome Screen
                    dispose();
                }
            });

            Button searchButton = new Button ("Search");
            searchButton.setBounds(490, 200, 90, 30);

            // Home Screen Features Added
            add(welcomeLabel);
            add(searchLabel);

            add(searchTextField);
            add(resultTextArea);

            add(bookReservations);
            add(roomReservations);
            add(logOutButton);
            add(searchButton);

            // Home Screen Visible
            setVisible(true);

            addWindowListener(new java.awt.event.WindowAdapter() {
                public void windowClosing(java.awt.event.WindowEvent windowEvent){
                    dispose();
                }
            });
        }
    }

    // Book Reservations Window
    class bookReservations extends Frame{

        public bookReservations(){

            // Title
            setTitle("Book Reservations");
            setSize(800,600);
            setLayout(null);
            setBackground(new Color(redBack, greenBack, blueBack));

            /// Font
            Font font = new Font("Verdana", Font.BOLD, 40);

            // Label
            Label bookReservationLabel = new Label("Book Reservations");
            bookReservationLabel.setBounds(250,100,440,90);
            bookReservationLabel.setFont(font);

            // Welcome Label
            Label welcomeLabel = new Label("     Kresge Library");
            welcomeLabel.setBounds(0, 0, 800, 100);
            welcomeLabel.setFont(font);
            welcomeLabel.setBackground(new Color(redBanner, greenBanner, blueBanner));
            welcomeLabel.setForeground(Color.BLACK);

            // Buttons (Create, Boumd & Action)
            Button backButton = new Button (" <--- Back");
            backButton.setBounds(50,150,80,30);
            backButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    //Close the Login Window and Go Back To Welcome Screen
                    dispose();
                }
            });
            
            Button bookReservations = new Button("Book Reservations");
            bookReservations.setBounds(50,200,120,80);
            bookReservations.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    System.out.println("Your already in the Book Reservations window");
                }
            });

            Button roomReservations = new Button("Room Reservations");
            roomReservations.setBounds(50,300,120,80);
            roomReservations.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    // Opens up Book Reservation Window
                    new roomReservations();
                }
            });

            Button logOutButton = new Button("Log Out");
            logOutButton.setBounds(50,400,120,80);
            logOutButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    //Closes Program
                    System.exit(0);
                }
            });

            // Book Reservations Features Added
            add (welcomeLabel);
            add (bookReservationLabel);

            add(backButton);
            add(bookReservations);
            add(roomReservations);
            add(logOutButton);


            // Book Reservations Visible
            setVisible(true);

            addWindowListener(new java.awt.event.WindowAdapter() {
                public void windowClosing(java.awt.event.WindowEvent windowEvent){
                    dispose();
                }
            });
        }
    }

    // Room Reservations Window
    class roomReservations extends Frame{

        public roomReservations(){

            // Title
            setTitle("Room Reservations");
            setSize(800,600);
            setLayout(null);
            setBackground(new Color(redBack, greenBack, blueBack));

            /// Font
            Font font = new Font("Verdana", Font.BOLD, 40);

            // Label
            Label roomReservationLabel = new Label("Room Reservations");
            roomReservationLabel.setBounds(250,100,440,90);
            roomReservationLabel.setFont(font);
            
            // Welcome Label
            Label welcomeLabel = new Label("     Kresge Library");
            welcomeLabel.setBounds(0, 0, 800, 100);
            welcomeLabel.setFont(font);
            welcomeLabel.setBackground(new Color(redBanner, greenBanner, blueBanner));
            welcomeLabel.setForeground(Color.BLACK);

            // Buttons (Create, Bound, & Action)
            Button backButton = new Button (" <--- Back");
            backButton.setBounds(50,150,80,30);
            backButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    //Close the Login Window and Go Back To Welcome Screen
                    dispose();
                }
            });

            Button bookReservations = new Button("Book Reservations");
            bookReservations.setBounds(50,200,120,80);
            bookReservations.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    // Opens up Book Reservation Window
                    new bookReservations();
                }
            });

            Button roomReservations = new Button("Room Reservations");
            roomReservations.setBounds(50,300,120,80);
            roomReservations.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    System.out.println("You are already in the Room Reservations Window");
                }
            });

            Button logOutButton = new Button("Log Out");
            logOutButton.setBounds(50,400,120,80);
            logOutButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    //Closes Program
                    System.exit(0);
                }
            });


            // Room Reservations Features Added
            add (welcomeLabel);
            add (roomReservationLabel);
            
            add(backButton);
            add(bookReservations);
            add(roomReservations);
            add(logOutButton);


            // Room Reservations Visible
            setVisible(true);

            addWindowListener(new java.awt.event.WindowAdapter() {
                public void windowClosing(java.awt.event.WindowEvent windowEvent){
                    dispose();
                }
            });
        }
    }



    // Run The Program
    public static void main(String[] args){
        new WindowsLibrary();
    }

}
