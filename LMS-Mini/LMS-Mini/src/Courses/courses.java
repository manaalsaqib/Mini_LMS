package Courses;

public class courses {
    private String coursename;
    private String coursecode;

    public courses(String coursename , String coursecode) {
        this.coursename = coursename;
        this.coursecode = coursecode;
    }

    public String getCourseName() {
        return coursename;
    }

    public String getCourseCode() {
        return coursecode;
    }

    @Override
    public String toString() {
        return coursename + " ( " + coursecode + " ) ";
    }
}
