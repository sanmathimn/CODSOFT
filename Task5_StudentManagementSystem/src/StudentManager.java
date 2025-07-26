import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
        System.out.println(" Student added successfully.");
    }

    public void removeStudent(int rollNumber) {
        Student toRemove = null;
        for (Student s : students) {
            if (s.getRollNumber() == rollNumber) {
                toRemove = s;
                break;
            }
        }
        if (toRemove != null) {
            students.remove(toRemove);
            System.out.println(" Student removed successfully.");
        } else {
            System.out.println(" Student not found.");
        }
    }

    public void searchStudent(int rollNumber) {
        for (Student s : students) {
            if (s.getRollNumber() == rollNumber) {
                System.out.println(" Found: " + s);
                return;
            }
        }
        System.out.println(" Student not found.");
    }

    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println(" No students to display.");
            return;
        }
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
        System.out.println(" Student added successfully.");
    }

    public void removeStudent(int rollNumber) {
        Student toRemove = null;
        for (Student s : students) {
            if (s.getRollNumber() == rollNumber) {
                toRemove = s;
                break;
            }
        }
        if (toRemove != null) {
            students.remove(toRemove);
            System.out.println(" Student removed successfully.");
        } else {
            System.out.println(" Student not found.");
        }
    }

    public void searchStudent(int rollNumber) {
        for (Student s : students) {
            if (s.getRollNumber() == rollNumber) {
                System.out.println(" Found: " + s);
                return;
            }
        }
        System.out.println(" Student not found.");
    }

    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println(" No students to display.");
            return;
        }
        for (Student s : students) {
            System.out.println(s);
        }
    }
}


