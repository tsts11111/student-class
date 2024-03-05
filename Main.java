import java.util.Scanner;  
  
public class Main {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
  
        while (true) {  
            System.out.print("Enter student ID (or 'quit' to exit): ");  
            String studentID = scanner.nextLine();  

            
  
            if (studentID.equalsIgnoreCase("quit")) {  
                break;  
            }  
  
            System.out.print("Enter student name: ");  
            String studentName = scanner.nextLine();  
  
            System.out.print("Enter number of extra activities: ");  
            int numberOfExtraActivities = scanner.nextInt();  
            scanner.nextLine(); // Consume the newline left after nextInt()  
  
            student student = new student(studentID, studentName, numberOfExtraActivities);  
  
            for (int i = 0; i < numberOfExtraActivities; i++) {  
                System.out.print("Enter extra activity " + (i + 1) + ": ");  
                String activity = scanner.nextLine();  
                student.addExtraActivity(i, activity);  
            }  
  
            System.out.println(student.toString());  
        }  
  
        scanner.close();  
    }  
}

