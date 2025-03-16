package student;


import java.util.*;

public class StudentDatabase {
    private ArrayList<Student> studentList = new ArrayList<>();
    private HashMap<Integer, Student> studentMap = new HashMap<>();
    private HashSet<Integer> studentIDs = new HashSet<>();
    private LinkedList<Student> studentLinkedList = new LinkedList<>();
    private TreeSet<Student> sortedStudents = new TreeSet<>();

    public void addStudent(Student student) {
        if (studentIDs.contains(student.id)) {
            System.out.println("Student with ID " + student.id + " already exists.");
            return;
        }
        studentList.add(student);
        studentMap.put(student.id, student);
        studentIDs.add(student.id);
        studentLinkedList.add(student);
        sortedStudents.add(student);
    }
    public void displayStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No students available.");
        } else {
            System.out.println("\nStudent List:");
            for (Student s : studentList) {
                System.out.println(s);
            }
        }
    }
    public void findStudent(int id) {
        Student student = studentMap.get(id);
        if (student != null) {
            System.out.println("Found Student: " + student);
        } else {
            System.out.println("Student with ID " + id + " not found.");
        }
    }
    public void displaySortedStudents() {
        if (sortedStudents.isEmpty()) {
            System.out.println("No students available for sorting.");
        } else {
            System.out.println("\nSorted Student List:");
            for (Student s : sortedStudents) {
                System.out.println(s);
            }
        }
    }
    public void removeStudent(int id) {
        Student student = studentMap.get(id);
        if (student != null) {
            studentList.remove(student);
            studentMap.remove(id);
            studentIDs.remove(id);
            studentLinkedList.remove(student);
            sortedStudents.remove(student);
            System.out.println("Student with ID " + id + " removed successfully.");
        } else {
            System.out.println("Student with ID " + id + " not found.");
        }
    }
}

