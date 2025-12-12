// Create your CollegeStudent class here
public class CollegeStudent{
    private static int nextStudentID = 1;
    private int studentID;
    private String name;
    private String courseTitle;
    private String courseNumber;
    private static int costPerCredit = 125;
    private int credits;
    private int courseFee;

    public CollegeStudent() {
        studentID = nextStudentID;
        nextStudentID++;
    }

    public CollegeStudent(String initName, String initCourseTitle, String initCourseNumber, int initCredits) {
        name = initName;
        courseTitle = initCourseTitle;
        courseNumber = initCourseNumber;
        credits = initCredits;
        courseFee = credits * costPerCredit;
        studentID = nextStudentID;
        nextStudentID++;
    }

    public void setName(String initName){
        name = initName;
    }

    public void setCourseTitle(String initcourseTitle){
        courseTitle = initcourseTitle;
    }

    public void setCourseNumber(String initCourseNumber){
        courseNumber = initCourseNumber;
    }

    public void setCredits(int initCredits){
        credits = initCredits;
        courseFee = credits * costPerCredit;
    }

    public String getName(){
        return name;
    }

    public String getCourseTitle(){
        return courseTitle;
    }

    public String getCourseNumber(){
        return courseNumber;
    }

    public int getCredits(){
        return credits;
    }

    public int getCourseFee(){
        return courseFee;
    }

    public int getStudentID(){
        return studentID;
    }

    public void print(){
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + studentID);
        System.out.println("Course Title: " + courseTitle);
        System.out.println("Course Number: " + courseNumber);
        System.out.println("Credits: " + credits);
        System.out.println("Course Fee: $" + courseFee);
    }



}
