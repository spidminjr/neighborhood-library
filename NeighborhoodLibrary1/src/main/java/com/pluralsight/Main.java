package com.pluralsight;

import java.util.Scanner;

public class Main
{
    static final Scanner userInput = new Scanner(System.in);

    public static void main(String[] args)
    {
        Library[] library = {
                new Library(1, "970", "1984", false, ""),
                new Library(2, "971", "To Kill a Mockingbird", false, ""),
                new Library(3, "972", "The Catcher in the Rye", false, ""),
                new Library(4, "973", "Where the Wild Things Are", false, ""),
                new Library(5, "974", "Harry Potter and the Sorcerer's Stone", false, ""),
                new Library(6, "975", "Pride and Prejudice", false, ""),
                new Library(7, "976", "The Great Gatsby", false, ""),
                new Library(8, "977", "The Bell Jar", false, ""),
                new Library(9, "978", "The Hunger Games", false, ""),
                new Library(10, "979", "A Game of Thrones", false, ""),
                new Library(11, "980", "Harry Potter and the Chamber of Secrets", false, ""),
                new Library(12, "981", "Beloved", false, ""),
                new Library(13, "982", "Bridge to Terabithia", false, ""),
                new Library(14, "983", "Speak", false, ""),
                new Library(15, "984", "The Hobbit", false, ""),
                new Library(16, "985", "Harry Potter and the Prisoner of Azkaban", false, ""),
                new Library(17, "986", "Life of Pi", false, ""),
                new Library(18, "987", "The Alchemist", false, ""),
                new Library(19, "988", "Dune", false, ""),
                new Library(20, "989", "The Help", false, "")
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

    public static void showAll(Library[] library)
    {
        System.out.println();
        System.out.println("All available books: ");
        System.out.println("----------------------------------------");

        for (int i = 0; i < library.length; i++)
        {
            Library libraryItem = library[i];
            System.out.printf("Book Id: %d Book ISBN: %s  Book Title: %s\n", libraryItem.getId(), libraryItem.getIsbn(), libraryItem.getTitle());
        }
    }

    public static void showCheckedOut(Library[] library)
    {
        System.out.println();
        System.out.println("Here's all the checked out books");
        System.out.println("----------------------------------------");
        System.out.println("Enter book ID: ");
        int bookId = Integer.parseInt(userInput.nextLine());

        for (int i = 0; i < library.length; i++)
        {
            Library libraryItem = library[i];

            if(libraryItem.getId() == bookId) {
                if(!libraryItem.getIsCheckedOut())
                {
                System.out.println("Enter your name");
                String name = userInput.nextLine();
                }
                else
                {
                    System.out.println("Book is already checked out");
                }
            }
        }

    }

    public static void showCheckedTo(Library[] library)
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