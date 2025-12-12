import java.util.Scanner;

class Main {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    
    // write a while loop to create and display CollegeStudents using the below method
    String moreStudents = "Y";
    while(moreStudents.equals("Y")){
      CollegeStudent S1 = createStudent(scan);
      S1.print();
      System.out.println("Would you like to make another student? (Y/N)");
      moreStudents = scan.nextLine();

      }
      scan.close();
    }

  private static CollegeStudent createStudent(Scanner scan) {
    // complete this method to create a CollegeStudent object with details provided by the user
    System.out.println("What is the students name? ");
    String newName = scan.nextLine();
    System.out.println("What class is the student taking? ");
    String newCourseTitle = scan.nextLine();
    System.out.println("What number is this class? ");
    String newCourseNumber = scan.nextLine();
    System.out.println("How many credits is this course?");
    int newCredits = scan.nextInt();
    return new CollegeStudent(newName, newCourseTitle, newCourseNumber, newCredits);
  }
    
}
