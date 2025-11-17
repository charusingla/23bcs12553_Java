import java.util.*;

class StudentNotFoundException extends Exception {
  public StudentNotFoundException(String message) {
    super(message);
  }
}

class StudentNames {
  private ArrayList<String> students = new ArrayList<>();

  public void addStudent(String name) {
    students.add(name);
    System.out.println(name + " has been added.");
  }

  public void removeStudent(String name) throws StudentNotFoundException {
    if (students.isEmpty()) {
      throw new StudentNotFoundException("Error: Student list is empty!");
    }
    if (students.remove(name)) {
      System.out.println(name + " has been removed.");
    } else {
      System.out.println("No student named '" + name + "' found to remove.");
    }
  }

  public void displayStudents() throws StudentNotFoundException {
    if (students.isEmpty()) {
      throw new StudentNotFoundException("Error: Student list is empty!");
    }
    Collections.sort(students);
    System.out.println("Student Names (Alphabetical Order):");
    for (String s : students) {
      System.out.println(s);
    }
  }
}

class AverageCalculator {
  private ArrayList<Integer> numbers = new ArrayList<>();

  public void addNumbers(Scanner sc) {
    numbers.clear();
    System.out.println("Enter numbers (type 'done' to finish):");
    while (true) {
      String input = sc.next();
      if (input.equalsIgnoreCase("done")) {
        break;
      }
      try {
        int num = Integer.parseInt(input);
        numbers.add(num);
      } catch (NumberFormatException e) {
        System.out.println("Error: Invalid input, please enter a valid integer.");
      }
    }
  }

  public void calculateAverage() {
    try {
      if (numbers.isEmpty()) {
        throw new ArithmeticException("Error: Cannot calculate average of empty list.");
      }
      double sum = 0;
      for (int n : numbers) {
        sum += n;
      }
      double avg = sum / numbers.size();
      System.out.println("Average: " + avg);
    } catch (ArithmeticException e) {
      System.out.println(e.getMessage());
    }
  }
}

public class java_lab_mst {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StudentNames studentNames = new StudentNames();
    AverageCalculator avgCalc = new AverageCalculator();

    while (true) {
      System.out.println("\nChoose an option:");
      System.out.println("1. Manage Student Names (Add, Remove, Display)");
      System.out.println("2. Calculate Average of Numbers");
      System.out.print("Your choice: ");

      int choice;
      try {
        choice = sc.nextInt();
      } catch (InputMismatchException e) {
        System.out.println("Invalid input! Please enter a number.");
        sc.nextLine(); 
        continue;
      }

      switch (choice) {
        case 1:
          System.out.print("Enter the student name to add: ");
          sc.nextLine();
          String nameToAdd = sc.nextLine();
          studentNames.addStudent(nameToAdd);

          System.out.print("Enter the student name to remove: ");
          String nameToRemove = sc.nextLine();
          try {
            studentNames.removeStudent(nameToAdd);
          } catch (StudentNotFoundException e) {
            System.out.println(e.getMessage());
          }

          try {
            studentNames.displayStudents();
          } catch (StudentNotFoundException e) {
            System.out.println(e.getMessage());
          }
          break;

        case 2:
          avgCalc.addNumbers(sc);
          avgCalc.calculateAverage();
          break;

        default:
          System.out.println("Please enter a valid choice: 1 or 2.");
      }
    }
  }
}
