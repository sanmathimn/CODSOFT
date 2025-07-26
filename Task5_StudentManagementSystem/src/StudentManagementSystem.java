import java.util.Scanner;

public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager manager = new StudentManager();
        int choice;

        do {
            System.out.println("\n Student Management System ");
            System.out.println("1 Add Student");
            System.out.println("2 Remove Student");
            System.out.println("3 Search Student");
            System.out.println("4 Display All Students");
            System.out.println("5 Exit");
            System.out.print("Enter your choice: ");
            while (!scanner.hasNextInt()) {
                System.out.println(" Enter valid number.");
                scanner.next();
            }
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    scanner.nextLine(); 
                    String name = scanner.nextLine();
                    System.out.print("Enter roll number: ");
                    int roll = scanner.nextInt();
                    System.out.print("Enter grade: ");
                    scanner.nextLine(); 
                    String grade = scanner.nextLine();
                    manager.addStudent(new Student(name, roll, grade));
                    break;
                case 2:
                    System.out.print("Enter roll number to remove: ");
                    int rollToRemove = scanner.nextInt();
                    manager.removeStudent(rollToRemove);
                    break;
                case 3:
                    System.out.print("Enter roll number to search: ");
                    int rollToSearch = scanner.nextInt();
                    manager.searchStudent(rollToSearch);
                    break;
                case 4:
                    manager.displayAllStudents();
                    break;
                case 5:
                    System.out.println(" Exiting... Goodbye!");
                    break;
                default:
                    System.out.println(" Invalid choice! Try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}

