package college;

import java.util.Scanner;

public class Student {

    public int booksCount = 0;
    String studentName;
    String regNum;
    book[] borrowedBooks = new book[3];
    Scanner input = new Scanner(System.in);

    public Student() {
        System.out.println("Enter Student Name:");
        this.studentName = input.nextLine();

        System.out.println("Enter Registration Number:");
        this.regNum = input.nextLine();
    }
}