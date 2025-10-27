package STUDENT_LIST;
import STUDENT.*;

public class Student_list {
    private Student[] student;
    private int size;
    private int capacity;

    public Student_list(int capacity) { // passed capacity because we need a new empty arraylist
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

    //    adding student at a specific index
    public void addstudentidx(Student newStudent, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid Index");
        }
        if (size == student.length) {
            resize();
        }
        for (int i = size - 1; i >= index; i--) {
            student[i + 1] = student[i];
        }
        student[index] = newStudent;
        size++;

    }
//    ---------REMOVING STUDENTS FROM THE LIST----------

   //removing by index
    public void removestudentidx(int index) {
        if (index >= 0 && index < size) {    // checking if the index really exists
            for (int i = index; i < size - 1; i++) {
                student[i] = student[i + 1];
            }
            student[size - 1] = null;
            size--;
        }
        System.out.println("Student at index " + index + " removed successfully");
    }
    // checking if the student with a certain name exists
    public boolean studentexist(String name){
        for(int i = 0; i < size; i++){
            if(student[i].getName().equalsIgnoreCase(name)){
                return true;
            }
        }
        return false;

    }

    // checking if the student with a particular seatno exists
    public boolean seatnoexist(String seat_no) {
        for(int i = 0; i < size; i++){
            if(student[i].getSeat_no().equalsIgnoreCase(seat_no)){
                return true;
            }
        }
        return false;
    }

    //removing by name
    public void removestudentbyname(String name) {
        if(!studentexist(name)){
            System.out.println("Student with name " + name + " not found");
            return;
        }
        for (int i = 0; i < size; i++) {
            if (student[i].getName().equalsIgnoreCase(name)) {
                for (int j = i; j < size - 1; j++) {
                    student[j] = student[j + 1];
                }
                student[size - 1] = null;
                size--;
                System.out.println("Student with name " + name + " removed successfully");
                return;
            }
        }

    }
    //removing by seat.no
    public void removestudentbyseatno(String seat_no){
        if (!seatnoexist(seat_no)) {
            System.out.println("Student with seat.no " + seat_no + " not found");
            return;
        }
        for(int i = 0; i < size ; i++) {
            if (student[i].getSeat_no().equalsIgnoreCase(seat_no)) {
                for (int j = i; j < size - 1; j++) {
                    student[j] = student[j + 1];
                }
                student[size - 1] = null;
                size--;
                System.out.println("student with seat no " + seat_no + " removed successfully");
                return;
            }
        }
    }
//    -----------REPLACING STUDENTS IN THE LIST------
    public void replacebyname(Student newstudent , String name){
        if(!studentexist(name)){
            System.out.println("Student not found");
            return;
        }
        for(int i = 0; i < size; i++){
            if(student[i].getName().equalsIgnoreCase(name)){
                student[i] = newstudent;
                System.out.println("Student with name " + name + " has been replaced successfully");
                return;
            }
        }

    }

    // Replace by seat.no
    public void replacebyseatno(Student newStudent, String seat_no){
        if(!seatnoexist(seat_no)){
            System.out.println("Seat.no not found");
            return;
        }
        for(int i = 0; i < size; i++){
            if(student[i].getSeat_no().equalsIgnoreCase(seat_no)){
                student[i] = newStudent;
                System.out.println("student with seat.no " + seat_no + " has been replaced successully ");
            }
        }
    }

    // replace by index
    public void replacebyidx(int index , Student newstudent){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Invalid Index");
        }
        student[index] = newstudent;
        System.out.println("Student at index " + index + " has been replaced successfully");
    }

//    -------SEARCHING STUDENTS---------

    public void searchbyname(String name) {
        if(!studentexist(name)){
            System.out.println("Student not found");
            return;
        }
        for (int i = 0; i < size; i++) {
            if (student[i].getName().equalsIgnoreCase(name)) {
             System.out.println("Student with name " + name + " found");
             System.out.println(student[i]);
             return;
            }
        }

    }
    //    search student by seat no
    public void  searchbyseatno(String seat_no){
        if(!seatnoexist(seat_no)){
            System.out.println("seat no not found");
            return;
        }
        for(int i = 0; i < size; i++){
            if (student[i].getSeat_no().equalsIgnoreCase(seat_no)) {
                System.out.println("Student with seat no " + seat_no + " found");
                System.out.println(student[i]);
                return;
            }
        }
    }

//    ----------SORTING STUDENTS--------

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
        System.out.println("student List is sorted by name");
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
        String result = "STUDENT LIST \n";
        for(int i = 0; i < size; i++){
            result += student[i] + "\n";
        }
        return result;
    }



}
