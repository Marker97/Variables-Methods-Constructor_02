package it.develhope;
public class Test {
    public static void main(String[] args) {
        Student student1 = new Student("Marcus ");
        Student student2 = new Student("Paolo ");
        Teacher teacher = new Teacher("Sara");
        teacher.assignGrade(student1, 7);
        teacher.assignGrade(student2, 8);
        student1.getStudentDetails();
        student2.getStudentDetails();
    }
}
