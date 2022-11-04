package it.develhope;
public class Teacher {
    public String teacherName;
    public Teacher(String name) {
        this.teacherName = name;
        System.out.println("Teacher is created");
    }
    public void assignGrade(Student alum, int finalGrade) {
        alum.grade = finalGrade;
    }
}