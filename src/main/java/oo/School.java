package oo;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Teacher> teacherslist;
    private List<Student> studentslist;

    public School() {
        this.teacherslist = new ArrayList<>();
        this.studentslist = new ArrayList<>();
    }

    public void attach(Teacher teacher) {
        teacherslist.add(teacher);
    }

    public void attach(Student student) {
        studentslist.add(student);
    }

    public void startSchool() {
        for (Teacher teacher : teacherslist) {
            System.out.print(teacher.introduce()+"\n");
        }
        for (Student student : studentslist) {
            System.out.print(student.introduce()+"\n");
        }
    }
}