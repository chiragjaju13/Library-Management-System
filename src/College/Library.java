package College;

import java.util.*;

public class Library {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("********************Chirag's to the GFG Library!********************");
        System.out.println("                  Select From The Following Options:               ");
        System.out.println("**********************************************************************");

        books ob = new books();
        students obStudent = new students();

        int choice;
        int searchChoice;

        choice = -1;   // initialize to enter loop

        while (choice != 0) {

            ob.dispMenu();
            choice = input.nextInt();

            switch (choice) {

                case 1:
                    book b = new book();
                    ob.addBook(b);
                    break;

                case 2:
                    ob.upgradeBookQty();
                    break;

                case 3:
                    System.out.println("Press 1 to Search with Book Serial No.");
                    System.out.println("Press 2 to Search with Book's Author Name.");
                    searchChoice = input.nextInt();

                    switch (searchChoice) {
                        case 1:
                            ob.searchBySno();
                            break;
                        case 2:
                            ob.searchByAuthorName();
                            break;
                        default:
                            System.out.println("Invalid search choice");
                    }
                    break;

                case 4:
                    ob.showAllBooks();
                    break;

                case 5:
                    Student s = new Student();
                    obStudent.addStudent(s);
                    break;

                case 6:
                    obStudent.showAllStudents();
                    break;

                case 7:
                    obStudent.checkOutBook(ob);
                    break;

                case 8:
                    obStudent.checkInBook(ob);
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("ENTER BETWEEN 0 TO 8.");
            }
        }

    }
}