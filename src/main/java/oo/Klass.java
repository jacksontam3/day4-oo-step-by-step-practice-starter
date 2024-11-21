package oo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Klass {
    private int number;
    private List<Student> studentslist;
    private Student leader;

    public Klass(int number) {
        this.number = number;
        this.studentslist = new ArrayList<>();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Klass klass = (Klass) o;
        return number == klass.number;
    }

    public void addStudent(Student student) {
        studentslist.add(student);
    }

    public void assignLeader(Student student) {
        if (studentslist.contains(student)) {
            this.leader = student;
        } else {
            System.out.println("It is not one of us.");
        }
    }

    public boolean isLeader(Student student) {
        return this.leader != null && this.leader.equals(student);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(number);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
