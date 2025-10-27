import Course.List.Course;
import STUDENT.Student;
import STUDENT_LIST.Student_list;
public class Main {
    static void main(String[] args){
//        a new semester has started consisting of 12 subjects
        Course.addcourse("Object-Oriented Programming", "CS-352");
        Course.addcourse("Digital Logic Design", "CS-354");
        Course.addcourse("Linear Algebra", "CS-356");
        Course.addcourse("Discrete Structures", "CS-358");
        Course.addcourse("Communication and Presentation skills", "CS-360");
        Course.addcourse("Pakistan Studies", "CS-362");
        Course.addcourse("Programming Fundamentals", "CS-364");
        Course.addcourse("Physics", "CS-366");
        Course.addcourse("Calculus", "CS-368");
        Course.addcourse("Information and Communcation technology", "CS-370");
        Course.addcourse("Functional English", "CS-372");
        Course.addcourse("Islamic Studies", "CS-374");
        Course courses = new Course();

//      A single class contains 10 students
        Student_list S = new Student_list(10);
        Student S1 = new Student("Manaal Saqib Khatri", "B24110006061");
        Student S2 = new Student("Irna Khan", "B24110006062");
        Student S3 = new Student("Mohammed Hussain", "B24110006063");
        Student S4 = new Student("Fajar Khurram", "B24110006064");
        Student S5 = new Student("Ayesha Azam", "B24110006065");
        Student S6 = new Student("Mohammed Mahad", "B24110006066");
        Student S7 = new Student("Yusra Saqib", "B24110006067");
        Student S8 = new Student("Daniya Ali", "B24110006068");
        Student S9 = new Student("Ifra Fawad", "B24110006069");
        Student S10 = new Student("Warisha Rashid", "B24110006070");
//      each student enrolled in 6 subjects of their choice
        S1.enrollcourse(Course.getCourse(0));
        S1.enrollcourse(Course.getCourse(1));
        S1.enrollcourse(Course.getCourse(2));
        S1.enrollcourse(Course.getCourse(3));
        S1.enrollcourse(Course.getCourse(4));
        S1.enrollcourse(Course.getCourse(5));

        S2.enrollcourse(Course.getCourse(0));
        S2.enrollcourse(Course.getCourse(1));
        S2.enrollcourse(Course.getCourse(2));
        S2.enrollcourse(Course.getCourse(3));
        S2.enrollcourse(Course.getCourse(4));
        S2.enrollcourse(Course.getCourse(5));

        S3.enrollcourse(Course.getCourse(0));
        S3.enrollcourse(Course.getCourse(1));
        S3.enrollcourse(Course.getCourse(3));
        S3.enrollcourse(Course.getCourse(5));
        S3.enrollcourse(Course.getCourse(6));
        S3.enrollcourse(Course.getCourse(7));

        S4.enrollcourse(Course.getCourse(0));
        S4.enrollcourse(Course.getCourse(2));
        S4.enrollcourse(Course.getCourse(6));
        S4.enrollcourse(Course.getCourse(8));
        S4.enrollcourse(Course.getCourse(9));
        S4.enrollcourse(Course.getCourse(10));

        S5.enrollcourse(Course.getCourse(4));
        S5.enrollcourse(Course.getCourse(5));
        S5.enrollcourse(Course.getCourse(6));
        S5.enrollcourse(Course.getCourse(9));
        S5.enrollcourse(Course.getCourse(11));
        S5.enrollcourse(Course.getCourse(6));

        S6.enrollcourse(Course.getCourse(6));
        S6.enrollcourse(Course.getCourse(11));
        S6.enrollcourse(Course.getCourse(10));
        S6.enrollcourse(Course.getCourse(9));
        S6.enrollcourse(Course.getCourse(8));
        S6.enrollcourse(Course.getCourse(7));

        S7.enrollcourse(Course.getCourse(8));
        S7.enrollcourse(Course.getCourse(4));
        S7.enrollcourse(Course.getCourse(3));
        S7.enrollcourse(Course.getCourse(2));
        S7.enrollcourse(Course.getCourse(3));
        S7.enrollcourse(Course.getCourse(6));

        S8.enrollcourse(Course.getCourse(1));
        S8.enrollcourse(Course.getCourse(5));
        S8.enrollcourse(Course.getCourse(9));
        S8.enrollcourse(Course.getCourse(6));
        S8.enrollcourse(Course.getCourse(10));
        S8.enrollcourse(Course.getCourse(11));

        S9.enrollcourse(Course.getCourse(1));
        S9.enrollcourse(Course.getCourse(4));
        S9.enrollcourse(Course.getCourse(7));
        S9.enrollcourse(Course.getCourse(0));
        S9.enrollcourse(Course.getCourse(2));
        S9.enrollcourse(Course.getCourse(3));

        S10.enrollcourse(Course.getCourse(6));
        S10.enrollcourse(Course.getCourse(7));
        S10.enrollcourse(Course.getCourse(8));
        S10.enrollcourse(Course.getCourse(9));
        S10.enrollcourse(Course.getCourse(10));
        S10.enrollcourse(Course.getCourse(2));

//      All of them were added to the Student list
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
///        a student named Fariha joined in the middle of the semester
        Student S12 = new Student("Fariha Shabbir", "B24110006072");
///        as the list is sorted alphabetically we need to place her at index 3
        S.addstudentidx(S12, 3);
///        Fariha enrolled in 6 subjects of her choice
        S12.enrollcourse(Course.getCourse(2));
        S12.enrollcourse(Course.getCourse(3));
        S12.enrollcourse(Course.getCourse(4));
        S12.enrollcourse(Course.getCourse(5));
        S12.enrollcourse(Course.getCourse(6));
        S12.enrollcourse(Course.getCourse(7));

///  Mohammed Mahad left the semester in the middle so he was removed from the list
        S.removestudentbyname("Mohammed Mahad");
///    just as Mahad left another student name abiha joined the semester
        Student S13 = new Student("Abiha Fatima", "B24110006073");
        S.addstudent(S13);
        S13.enrollcourse(Course.getCourse(10));
        S13.enrollcourse(Course.getCourse(5));
        S13.enrollcourse(Course.getCourse(9));
        S13.enrollcourse(Course.getCourse(8));
        S13.enrollcourse(Course.getCourse(7));
        S13.enrollcourse(Course.getCourse(6));
///  abiha was given the seat no of Mahad
          S13.setseat_no("B24110006066");
          S.replacebyseatno(S13, "B24110006066");
          S.replacebyidx(4 , S13);

///   The department needs the info of Irna Khan to check her subjects on which her fees would be based on
        S.searchbyname("Irna Khan");
///   The department needs the student list to be sorted by seat_no
        S.sortbyseatno();


        System.out.println(S);


    }
}










