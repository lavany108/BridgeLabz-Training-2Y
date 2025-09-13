package core_java.Constructors.Problems;

class Course {
    String courseName;
    int duration;
    double fee;
    static String instituteName = "** Institute";
    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }
    void displayCourseDetails() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " months, Fee: " + fee + ", Institute: " + instituteName);
    }
    static void updateInstituteName(String name) {
        instituteName = name;
    }
    public static void main(String[] args) {
        Course c1 = new Course("Java", 3, 15000);
        Course c2 = new Course("Python", 2, 12000);
        c1.displayCourseDetails();
        c2.displayCourseDetails();
        Course.updateInstituteName("__ Academy");
        System.out.println("Institute name updated!!\n");
        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
