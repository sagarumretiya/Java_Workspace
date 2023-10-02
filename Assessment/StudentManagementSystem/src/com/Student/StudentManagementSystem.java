package com.Student;

import java.util.*;

class Student {
    private int serialNumber;
	static int marks;
    private String firstName,lastName,contactNumber,subject;
    private double fees;

    public Student(int serialNumber, String firstName, String lastName, String contactNumber, String subject, int marks, double fees) {
        this.serialNumber = serialNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactNumber = contactNumber;
        this.subject = subject;
        Student.marks = marks;
        this.fees = fees;
    }

    // Getters and setters (if needed)

    @Override
    public String toString() {
        return "ID: " + serialNumber + ", Name: " + firstName + " " + lastName + ", Contact: " + contactNumber +
                ", Subject: " + subject + ", Marks: " + marks + ", Fees: " + fees;
    }

	public int getSerialNumber() 
	{
		return serialNumber;
	}

	public String getSubject() {
		return subject;
	}

	public int getMarks() {
		return marks;
	}

}

public class StudentManagementSystem {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Counsellor");
            System.out.println("2. Faculty");
            System.out.println("3. Student");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    counsellorMenu(students, scanner);
                    break;
                case 2:
                    facultyMenu(students, scanner);
                    break;
                case 3:
                    studentMenu(students);
                    break;
                case 4:
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }

    private static void counsellorMenu(ArrayList<Student> students, Scanner scanner) {
        while (true) {
            System.out.println("\nCounsellor Menu:");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. View All Students");
            System.out.println("4. View Specific Student");
            System.out.println("5. Back to Main Menu");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    addStudent(students, scanner);
                    break;
                case 2:
                    removeStudent(students, scanner);
                    break;
                case 3:
                    viewAllStudents(students);
                    break;
                case 4:
                    viewSpecificStudent(students, scanner);
                    break;
                case 5:
                    return; // Return to the main menu
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }

    private static void addStudent(ArrayList<Student> students, Scanner scanner) {
        // Get student details from the user
        System.out.print("Enter Serial Number: ");
        int serialNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter Contact Number: ");
        String contactNumber = scanner.nextLine();

        // Validate contact number (only digits allowed)
        if (!contactNumber.matches("\\d+")) {
            System.out.println("Invalid contact number. Please enter only digits.");
            return;
        }

        System.out.print("Enter Subject: ");
        String subject = scanner.nextLine();
        System.out.print("Enter Marks: ");
        int marks = scanner.nextInt();
        System.out.print("Enter Fees: ");
        double fees = scanner.nextDouble();

        // Create a new student object and add it to the list
        Student student = new Student(serialNumber, firstName, lastName, contactNumber, subject, marks, fees);
        students.add(student);

        System.out.println("Student added successfully.");
    }

    private static void removeStudent(ArrayList<Student> students, Scanner scanner) {
        System.out.print("Enter Student ID to remove: ");
        int idToRemove = scanner.nextInt();

        // Find the student with the specified ID
        Student studentToRemove = null;
        for (Student student : students) {
            if (student.getSerialNumber() == idToRemove) {
                studentToRemove = student;
                break;
            }
        }

        if (studentToRemove != null) {
            System.out.println("Are you sure you want to remove the following student?");
            System.out.println(studentToRemove);
            System.out.print("Enter 'Y' to confirm or 'N' to cancel: ");
            char confirmation = scanner.next().charAt(0);

            if (confirmation == 'Y' || confirmation == 'y') {
                students.remove(studentToRemove);
                System.out.println("Student removed successfully.");
            } else {
                System.out.println("Removal canceled.");
            }
        } else {
            System.out.println("Student with ID " + idToRemove + " does not exist.");
        }
    }

    private static void viewAllStudents(ArrayList<Student> students) {
        System.out.println("\nAll Students:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    private static void viewSpecificStudent(ArrayList<Student> students, Scanner scanner) {
        System.out.print("Enter Student ID to view: ");
        int idToView = scanner.nextInt();

        // Find the student with the specified ID
        Student specificStudent = null;
        for (Student student : students) {
            if (student.getSerialNumber() == idToView) {
                specificStudent = student;
                break;
            }
        }

        if (specificStudent != null) {
            System.out.println("\nStudent Details:");
            System.out.println(specificStudent);
        } else {
            System.out.println("Student with ID " + idToView + " does not exist.");
        }
    }

    private static void facultyMenu(ArrayList<Student> students, Scanner scanner) {
        while (true) {
            System.out.println("\nFaculty Menu:");
            System.out.println("1. Add Marks to Students");
            System.out.println("2. View All Students");
            System.out.println("3. Back to Main Menu");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    addMarksToStudents(students, scanner);
                    break;
                case 2:
                    viewAllStudents(students);
                    break;
                case 3:
                    return; // Return to the main menu
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }

    private static void addMarksToStudents(ArrayList<Student> students, Scanner scanner) {
        System.out.print("Enter Student ID to add marks: ");
        int idToAddMarks = scanner.nextInt();

        // Find the student with the specified ID
        Student studentToAddMarks = null;
        for (Student student : students) {
            if (student.getSerialNumber() == idToAddMarks) {
                studentToAddMarks = student;
                break;
            }
        }

        if (studentToAddMarks != null) {
            // Check if the subject is Java or Python
            if ("Java".equalsIgnoreCase(studentToAddMarks.getSubject()) || "Python".equalsIgnoreCase(studentToAddMarks.getSubject())) {
                System.out.print("Enter Marks to add: ");
                int marksToAdd = scanner.nextInt();

                // Update student's marks
                Student.marks = marksToAdd;
                System.out.println("Marks added successfully.");
            } else {
                System.out.println("Faculty can only add marks for students in Java or Python subjects.");
            }
        } else {
            System.out.println("Student with ID " + idToAddMarks + " does not exist.");
        }
    }

    private static void studentMenu(ArrayList<Student> students) {
        // Student menu (read-only)
        System.out.println("\nStudent Menu:");
        System.out.println("1. View Your Details");
        System.out.println("2. Back to Main Menu");
    }
}
