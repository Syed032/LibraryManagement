package com.librarymanagement;

import java.util.ArrayList;

public class Library 
{
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Student> students = new ArrayList<>();

    // Constructor to add some default students
    public Library() 
    {
        students.add(new Student(1, "Alice", "Computer Science", 2));
        students.add(new Student(2, "Bob", "Electronics", 3));
        students.add(new Student(3, "Charlie", "Mechanical", 1));
    }

    // Add Book
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully.");
    }

    // Remove Book
    public void removeBook(int bookId) {
        boolean found = false;
        for (Book b : books) {
            if (b.getBookId() == bookId) {
                books.remove(b);
                System.out.println("Book removed successfully.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Book ID not found.");
        }
    }

    // Display Books
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            System.out.println("--- Book List ---");
            for (Book b : books) 
            {
                b.displayBook();
            }
        }
    }

    // Display Students
    public void displayStudents() {
        System.out.println("--- Student List ---");
        for (Student s : students) {
            s.displayStudent();
        }
    }

    // Search Student by Name
    public void searchStudentByName(String name) {
        boolean found = false;
        for (Student s : students) {
            if (s.getName().equalsIgnoreCase(name)) {
                System.out.println("--- Student Details ---");
                s.displayStudent();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student not found.");
        }
    }
}
