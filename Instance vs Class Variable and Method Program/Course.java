public class Course{
    private String courseName;
    private int duration;
    private int fee;
    private static String instituteName = "GLA University";

    public Course(String courseName, int duration, int fee){
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public String getCourseName(){
        System.out.println("Course Name is : " + this.courseName);
        return this.courseName;
    }

    public void setCourseName(String newCourseName){
        this.courseName = newCourseName;
    } 

    public int getCourseDuration(){
        System.out.println("Course Duration is : " + this.duration);
        return this.duration;
    }

    public void setCourseDuration(int newCourseDuration){
        this.duration = newCourseDuration;
    } 

    public int getCourseFee(){
        System.out.println("Course Fee is : " + this.fee);
        return this.fee;
    }

    public void setCourseName(int newCourseFee){
        this.fee = newCourseFee;
    } 

    public void displayCourseDetails(){
        System.out.println("Course Details : ");
        System.out.println("Name = " + this.courseName);
        System.out.println("Duration = " + this.duration);
        System.out.println("Fees = " + this.fee);
        System.out.println();
    }

    public String getInstituteName(){
        System.out.println("Institute Name is : " + this.instituteName);
        return this.instituteName;
    }

    public static void updateInstituteName(String newInstituteName){
        instituteName = newInstituteName;
    }

}

class Main{
    public static void main(String []args){
        Course course1 = new Course("Graphic Designing", 6, 10000);
        course1.displayCourseDetails();

        Course course2 = new Course("AI/ML", 2, 8999);
        course2.displayCourseDetails();

        Course course3 = new Course("SpringBoot", 12, 1599);
        course3.displayCourseDetails();

        course1.getInstituteName();
        course2.getInstituteName();
    }
}