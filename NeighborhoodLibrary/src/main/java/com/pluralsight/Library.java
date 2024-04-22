package com.pluralsight;

public class Library {
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedTo;

    public Library(int id, String isbn, String title, boolean isCheckedOut, String checkedTo)
    {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = isCheckedOut;
        this.checkedTo = checkedTo;
    }

    public int getid()
    {
        return id;
    }

    public void setid(int id)
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
}
