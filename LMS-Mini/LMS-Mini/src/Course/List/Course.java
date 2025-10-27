package Course.List;
import Courses.courses;
public class Course{
    static courses[] course = new courses[12];     // 12 courses
    static int count = 0;                          // initialized from zero

    public static void addcourse(String coursename, String coursecode) {
        if (count < course.length) {
            course[count] = new courses(coursename, coursecode);
            count++;
        } else {
            System.out.println("A semester cannot have more than 6 courses");
        }
    }
    public static courses getCourse(int index) {
        if (index >= 0 && index < count) {
            return course[index];   // array ka ek element return karega
        } else {
            System.out.println("Invalid course index!");
            return null;
        }
    }

    @Override
    public String toString() {
        String result = "Courses of 2nd Semester are: \n \n";
        for (int i = 0; i < count; i++) {
            result += course[i] + "\n";
        }
        return result;
    }
}