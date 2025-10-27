package STUDENT;
import Courses.courses;

public class Student {
    private String name;
    private String seat_no;
    private courses[] enrolledcourses;
    private int coursecount;


    public Student(String name, String seat_no) {
        this.name = name;
        this.seat_no = seat_no;
        this.enrolledcourses = new courses[6];     // each student can have 6 courses
        this.coursecount = 0;                //starts from 0
    }

    //    no of enrolled courses using course's object
    public void enrollcourse(courses c) {
        if (coursecount < enrolledcourses.length) {
            enrolledcourses[coursecount] = c;
            coursecount++;
        }else {
            System.out.println("Cant choose more courses");
        }
    }
    public void setname(String name){
        this.name = name;
    }

    public void setseat_no(String seat_no){
        this.seat_no = seat_no;
    }
    public String getName(){
        return name;
    }
    public String getSeat_no(){
        return seat_no;
    }
    @Override
    public String toString() {
        String result = "Student Name :" + name
                + "\n Seat no : " + seat_no;
        for(int i = 0; i < coursecount; i++){
            result += " - " + enrolledcourses[i] + "\n";
        }
        return result;
    }
}
