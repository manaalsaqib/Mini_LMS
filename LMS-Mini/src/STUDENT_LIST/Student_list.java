package STUDENT_LIST;
import STUDENT.*;

public class Student_list {
    private Student[] student;
    private int size;

    public Student_list(int capacity) {
        student = new Student[capacity];
        size = 0;
    }

    public void resize() {
        Student[] newArray = new Student[student.length * 2];
        for (int i = 0; i < size; i++) {
            newArray[i] = student[i];
        }
        student = newArray;
    }

    //    Adding student
    public void addstudent(Student s) {
        if (size == student.length) {
            resize();
        }
        student[size] = s;
        size++;
    }

    //    Remove student by index
    public void removestudent(int index) {
        if (index <= 0 && index < size) {
            for (int i = index; i < size - 1; i++) {
                student[i] = student[i + 1];
            }
            student[size - 1] = null;
            size--;
        } else {
            System.out.println("Invalid index");
        }
    }

    //    Replace student
    public void replacestudent(int index, Student newstudent) {
        if (index <= 0 && index < size) {
            student[index] = newstudent;
        }
    }

    //    search student by name
    public Student searchbyname(String name) {
        for (int i = 0; i < size; i++) {
            if (student[i].getName().equalsIgnoreCase(name)) {
                return student[i];
            }
        }
        return null;
    }
//    search student by seat no
    public Student searchbyseatno(String seat_no){
        for(int i = 0; i < size; i++){
            if (student[i].getSeat_no().equalsIgnoreCase(seat_no)) {
                return student[i];
            }
        }

        return null;
    }
//    sorting students by name
    public void sortbyname(){
        for(int i = 0; i < size - 1; i++){
            for(int j = i + 1 ; j < size; j++ ){
                if(student[i].getName().compareToIgnoreCase(student[j].getName()) > 0){
                    Student SN = student[i];
                    student[i] = student[j];
                    student[j] = SN;

                }
            }
        }

    }
//    sorting students by seatno
    public void sortbyseatno(){
        for(int i = 0; i < size - 1; i++){
            for(int j = i + 1; j < size; j++){
                if(student[i].getSeat_no().compareToIgnoreCase(student[j].getSeat_no()) > 0){
                    Student SS = student[i];
                    student[i] = student[j];
                    student[j] = SS;
                }
            }
        }
    }

    @Override
    public String toString() {
//        to make sure List is always sorted by name
        sortbyname();
        String result = "STUDENT LIST \n";
        for(int i = 0; i < size; i++){
        result += student[i] + "\n";
        }
        return result;
    }
}
