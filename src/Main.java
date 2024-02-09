import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        Scanner cin = new Scanner(System.in);
        int choice;

        do {
            System.out.println("✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨");
            System.out.println("________________Manage Students__________________");
            System.out.println("1. Add students");
            System.out.println("2. Modify  student information");
            System.out.println("3. Delete a student");
            System.out.println("4. Display the list of students");
            System.out.println("5. Search for a student ");
            System.out.println("✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨");
            System.out.println("________________Manage School Classes_____________");
            System.out.println("6. Add a new class");
            System.out.println("7. Modify a class");
            System.out.println("8. Delete a class");
            System.out.println("9. Display the list of classes");
            System.out.println("10. Filter students by class");
            System.out.println("0. Quit");
            System.out.println("✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨");
            choice = cin.nextInt();

            switch (choice)
            {
                case 1:
                    Administrator.addStudent();
                    break;
                case 2:
                    Administrator.modifyStudentInfo();
                    break;
                case 3:
                    Administrator.DeleteStudent();
                    break;
                case 4:
                    Administrator.displayStudentList();
                    break;
                case 5:
                    Administrator.searchStudent();
                    break;
                case 6:
                    Administrator.addClass();
                    break;
                case 7:
                    Administrator.modifyClass();
                    break;
                case 8:
                    Administrator.DeleteClass();
                    break;
                case 9:
                    Administrator.displayClassList();
                    break;
                case 10:
                    Administrator.filterClass();
                    break;
                case 0:
                    System.out.println("Goodbye!\uD83D\uDC4B\uD83D\uDE80");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please choose a valid option.");
            }

        } while (choice != 0);
    }





}
