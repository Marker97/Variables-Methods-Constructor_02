package it.develhope;
public class Student {
    public String name;
    public int grade;
    public Student(String studentName){
        this.name=studentName;
        System.out.println("Object Student is created");
    }
    public void getStudentDetails(){
        System.out.println("Student " + this.name + grade);
    }
}
