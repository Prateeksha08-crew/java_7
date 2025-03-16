package student;

	import java.util.Scanner;

	public class Main {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        StudentDatabase db = new StudentDatabase();

	        while (true) {
	            System.out.println("\n1. Add Student\n2. Display All Students\n3. Find Student\n4. Display Sorted Students\n5. Remove Student\n6. Exit");
	            System.out.print("Choose an option: ");
	            int choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter ID: ");
	                    int id = sc.nextInt();
	                    sc.nextLine(); // Clear buffer
	                    System.out.print("Enter Name: ");
	                    String name = sc.nextLine();
	                    System.out.print("Enter Marks: ");
	                    double marks = sc.nextDouble();
	                    db.addStudent(new Student(id, name, marks));
	                    break;
	                case 2:
	                    db.displayStudents();
	                    break;
	                case 3:
	                    System.out.print("Enter Student ID to Find: ");
	                    int searchId = sc.nextInt();
	                    db.findStudent(searchId);
	                    break;
	                case 4:
	                    db.displaySortedStudents();
	                    break;
	                case 5:
	                    System.out.print("Enter Student ID to Remove: ");
	                    int removeId = sc.nextInt();
	                    db.removeStudent(removeId);
	                    break;
	                case 6:
	                    System.out.println("Exiting... Goodbye!");
	                    sc.close();
	                    System.exit(0);
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }
	    }
	}


