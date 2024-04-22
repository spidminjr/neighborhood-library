package com.pluralsight;

import java.util.Scanner;

public class Main
{
    static final Scanner userInput = new Scanner(System.in);

    public static void main(String[] args)
    {
        Book[] library = {
                new Book(1, "970", "1984", false, ""),
                new Book(2, "971", "To Kill a Mockingbird", false, ""),
                new Book(3, "972", "The Catcher in the Rye", false, ""),
                new Book(4, "973", "Where the Wild Things Are", false, ""),
                new Book(5, "974", "Harry Potter and the Sorcerer's Stone", false, ""),
                new Book(6, "975", "Pride and Prejudice", false, ""),
                new Book(7, "976", "The Great Gatsby", false, ""),
                new Book(8, "977", "The Bell Jar", false, ""),
                new Book(9, "978", "The Hunger Games", false, ""),
                new Book(10, "979", "A Game of Thrones", false, ""),
                new Book(11, "980", "Harry Potter and the Chamber of Secrets", false, ""),
                new Book(12, "981", "Beloved", false, ""),
                new Book(13, "982", "Bridge to Terabithia", false, ""),
                new Book(14, "983", "Speak", false, ""),
                new Book(15, "984", "The Hobbit", false, ""),
                new Book(16, "985", "Harry Potter and the Prisoner of Azkaban", false, ""),
                new Book(17, "986", "Life of Pi", false, ""),
                new Book(18, "987", "The Alchemist", false, ""),
                new Book(19, "988", "Dune", false, ""),
                new Book(20, "989", "The Help", false, "")
        };

        int choice = 0;
        while(choice != 4)
        {
            choice = getHomeScreenSelection();

            switch(choice)
            {
                case 1:
                    showAll(library);
                    break;

                case 2:
                    showCheckedOut(library);
                    break;

                case 3:
                    showCheckedTo(library);

                case 4:
                    System.out.println();
                    System.out.println("Goodbye");
                    return;
                default:
                    System.out.println();
                    System.out.println("Please enter a valid choice");
                    break;
            }

            System.out.println();
            System.out.println("Press enter to continue...");
            userInput.nextLine();
        }
    }

    public static int getHomeScreenSelection()
    {
        System.out.println();
        System.out.println("Welcome to your local neighborhood library, what would you like to do?");
        System.out.println();
        System.out.println("1 - Show all available books");
        System.out.println("2 - Show all books that have been checked out");
        System.out.println("3 - Quit");
        System.out.println();
        System.out.print("Enter your choice: ");
        return Integer.parseInt(userInput.nextLine());
    }

    public static void showAll(Book[] library)
    {
        System.out.println();
        System.out.println("All available books: ");
        System.out.println("----------------------------------------");

        for (int i = 0; i < library.length; i++)
        {
            Book book = library[i];
            System.out.printf("Book Id: %d Book ISBN: %s  Book Title: %s\n", book.getId(), book.getIsbn(), book.getTitle());
        }

        System.out.println();
        System.out.println("1: Check out a book");
        System.out.println("2: Exit back to the main screen");
        System.out.print("Enter a valid choice between option 1 or 2: ");
        int choice = Integer.parseInt(userInput.nextLine());

        String name ="";
        switch (choice) {
            case 1:
                System.out.println();
                // ask for the book id that they want
                System.out.println("Enter book ID: ");
                int bookId = Integer.parseInt(userInput.nextLine());
                System.out.println("Please enter your name to check out a book: ");
                name = userInput.nextLine();

                for (int i = 0; i < library.length; i++) {
                    if(bookId == library[i].getId()) {
                        library[i].checkout(name);
                    }
                }
                // loop through all books and find the book id they selected
                // when you find the book, check it out
//                showCheckedOut(library);
                break;
            //case 2:
               // getHomeScreenSelection();
            default:
                if(choice > 1) {
                    System.out.println();
                    System.out.println("Invalid selection");
                }

        }
    }


    public static void CheckedOut(Book[] library)
    {
        System.out.println();
        System.out.println("Here's all the checked out books");
        System.out.println("----------------------------------------");
        //System.out.println("Enter book ID: ");
        //int bookId = Integer.parseInt(userInput.nextLine());

        for (int i = 0; i < library.length; i++)
        {
            Book book = library[i];

            if(book.getId() == book.getId()) {
                if(!book.getIsCheckedOut())
                {
                System.out.println("Book is not checked out yet");
                }
                else
                {
                    System.out.println("Book is already checked out");
                }
            }
        }

    }

    public static void showCheckedOut(Book[] library)
    {
        boolean foundCheckedOutBooks = false;
        System.out.println();
        System.out.println("Checked out books");
        System.out.println("-------------------------");

        for (int i = 0; i < library.length; i++) {
            if(library[i].getIsCheckedOut()) {
                System.out.println();
                System.out.printf("Id: %d Isbn: %s  Title: %s Checked out: %s \n", library[i].getId(), library[i].getIsbn(), library[i].getTitle(), library[i].getIsCheckedOut());
            }
        }
    }

    public static void showCheckedTo(Book[] library)
    {
        System.out.println("\n Enter book ID: ");
        int bookId = Integer.parseInt(userInput.nextLine());

        boolean isCheckedOut = false;
        for (int i = 0; i < library.length; i++)
        {
            if(library[i].getId() == bookId && library[i].getIsCheckedOut())
            {
                library[i].setIsCheckedOut(true);
                break;
            }
            if(library[i].getId() == bookId)
            {
                System.out.println("Book is already checked out");
            }
        }
    }
}