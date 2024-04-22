package com.pluralsight;

public class Book {
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedTo;

    public Book(int id, String isbn, String title, boolean isCheckedOut, String checkedTo)
    {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = isCheckedOut;
        this.checkedTo = checkedTo;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getIsbn()
    {
        return isbn;
    }

    public void setIsbn(String isbn)
    {
        this.isbn = isbn;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public boolean getIsCheckedOut()
    {
        return isCheckedOut;
    }

    public void setIsCheckedOut(boolean isCheckedOut)
    {
        this.isCheckedOut = isCheckedOut;
    }

    public String getCheckedTo()
    {
        return checkedTo;
    }

    public void setCheckedTo(String checkedTo)
    {
        this.checkedTo = checkedTo;
    }

    public void checkout(String name)
    {
        this.isCheckedOut = true;
        this.checkedTo = name;
        System.out.println();
        System.out.println(this.title + " is checked out to " + this.checkedTo);

    }

    public void checkIn() {
        System.out.println(this.getIsCheckedOut() + " checked in " + this.getTitle());
        this.isCheckedOut = false;
        this.checkedTo = "";
    }
}
