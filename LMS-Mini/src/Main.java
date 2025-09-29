import Course.List.Course;
import STUDENT.Student;
import STUDENT_LIST.Student_list;

public class Main {
    public static void main(String[]args){
        Course.addcourse("Object Oriented Programming", "CS-352");
        Course.addcourse("Digital Logic Design", "CS-354");
        Course.addcourse("Linear Algebra", "CS-356");
        Course.addcourse("Discrete Structures", "CS-358");
        Course.addcourse("Communication and Presentation skills", "CS-360");
        Course.addcourse("Pakistan Studies", "CS-362");
        Course.addcourse("Programming Fundamentals", "CS-364");
        Course.addcourse("Physics", "CS-366");
        Course.addcourse("Calculus", "CS-368");
        Course.addcourse("Information and Communiation technology", "CS-370");
        Course.addcourse("Functional English", "CS-372");
        Course.addcourse("Islamic Studies", "CS-374");

        Course courses = new Course();
        System.out.println(courses);
//  -------------array's capacity is 10---------------
        Student_list S = new Student_list(10);
//  -------------creating students--------------------
        Student S1 = new Student("Manaal Saqib Khatri", "B24110006061 \n");
        Student S2 = new Student("Irna Khan", "B24110006045 \n");
        Student S3 = new Student("Mohammed Hussain", "B24110006059 \n");
        Student S4 = new Student("Fajar Khurram", "B24110006042 \n");
        Student S5 = new Student("Ayesha Azam", "B2411006032 \n");
        Student S6 = new Student("Mohammed Mahad", "B2411006056 \n");
        Student S7 = new Student("Yusra Saqib", "B2411006089 \n");
        Student S8 = new Student("Daniya Ali", "B2411006078 \n");
        Student S9 = new Student("Ifra Fawad", "B2411006087 \n");
        Student S10 = new Student("Warisha Rashid", "B2411006098 \n ");
//  ------array's capacity is 10 here it will resize itself----------------
        Student S11 = new Student("Rabia jawed", "B2411006067 \n");

        S1.enrollcourse(courses.getCourse(0));
        S1.enrollcourse(courses.getCourse(1));
        S1.enrollcourse(courses.getCourse(2));
        S1.enrollcourse(courses.getCourse(3));
        S1.enrollcourse(courses.getCourse(4));
        S1.enrollcourse(courses.getCourse(5));

        S2.enrollcourse(courses.getCourse(0));
        S2.enrollcourse(courses.getCourse(1));
        S2.enrollcourse(courses.getCourse(2));
        S2.enrollcourse(courses.getCourse(3));
        S2.enrollcourse(courses.getCourse(4));
        S2.enrollcourse(courses.getCourse(5));

        S3.enrollcourse(courses.getCourse(0));
        S3.enrollcourse(courses.getCourse(1));
        S3.enrollcourse(courses.getCourse(3));
        S3.enrollcourse(courses.getCourse(5));
        S3.enrollcourse(courses.getCourse(6));
        S3.enrollcourse(courses.getCourse(7));

        S4.enrollcourse(courses.getCourse(0));
        S4.enrollcourse(courses.getCourse(2));
        S4.enrollcourse(courses.getCourse(6));
        S4.enrollcourse(courses.getCourse(8));
        S4.enrollcourse(courses.getCourse(9));
        S4.enrollcourse(courses.getCourse(10));

        S5.enrollcourse(courses.getCourse(4));
        S5.enrollcourse(courses.getCourse(5));
        S5.enrollcourse(courses.getCourse(6));
        S5.enrollcourse(courses.getCourse(9));
        S5.enrollcourse(courses.getCourse(11));
        S5.enrollcourse(courses.getCourse(6));

        S6.enrollcourse(courses.getCourse(6));
        S6.enrollcourse(courses.getCourse(11));
        S6.enrollcourse(courses.getCourse(10));
        S6.enrollcourse(courses.getCourse(9));
        S6.enrollcourse(courses.getCourse(8));
        S6.enrollcourse(courses.getCourse(7));

        S7.enrollcourse(courses.getCourse(8));
        S7.enrollcourse(courses.getCourse(4));
        S7.enrollcourse(courses.getCourse(3));
        S7.enrollcourse(courses.getCourse(2));
        S7.enrollcourse(courses.getCourse(3));
        S7.enrollcourse(courses.getCourse(6));

        S8.enrollcourse(courses.getCourse(1));
        S8.enrollcourse(courses.getCourse(5));
        S8.enrollcourse(courses.getCourse(9));
        S8.enrollcourse(courses.getCourse(6));
        S8.enrollcourse(courses.getCourse(10));
        S8.enrollcourse(courses.getCourse(11));

        S9.enrollcourse(courses.getCourse(1));
        S9.enrollcourse(courses.getCourse(4));
        S9.enrollcourse(courses.getCourse(7));
        S9.enrollcourse(courses.getCourse(0));
        S9.enrollcourse(courses.getCourse(2));
        S9.enrollcourse(courses.getCourse(3));

        S10.enrollcourse(courses.getCourse(6));
        S10.enrollcourse(courses.getCourse(7));
        S10.enrollcourse(courses.getCourse(8));
        S10.enrollcourse(courses.getCourse(9));
        S10.enrollcourse(courses.getCourse(10));
        S10.enrollcourse(courses.getCourse(2));

        S11.enrollcourse(courses.getCourse(0));
        S11.enrollcourse(courses.getCourse(1));
        S11.enrollcourse(courses.getCourse(2));
        S11.enrollcourse(courses.getCourse(3));
        S11.enrollcourse(courses.getCourse(4));
        S11.enrollcourse(courses.getCourse(7));


        S.addstudent(S1);
        S.addstudent(S2);
        S.addstudent(S3);
        S.addstudent(S4);
        S.addstudent(S5);
        S.addstudent(S6);
        S.addstudent(S7);
        S.addstudent(S8);
        S.addstudent(S9);
        S.addstudent(S10);
        S.addstudent(S11);

        System.out.println(S);

//         --- Searching Example ---
        System.out.println("Search by Name: \n " + S.searchbyname("Manaal Saqib Khatri"));
        System.out.println("Search by seat no: \n" + S.searchbyseatno("B24110006061"));

//         --- Sorting Example ---
//        S.sortbyname();
//        System.out.println("Sorted by Name:\n" + S);
//        (my code is already sorted by name)

        S.sortbyseatno();
        System.out.println("Sorted by SeatNo:\n" + S);
    }
}







