package oo;

public class Student extends Person {

    public Student(int id, String name, int age) {
        super(id,name,age);
    }


    @Override
    public String introduce () {
        return "My name is " + this.getName() + ". I am " + this.getAge() + " years old."+ " I am a student.";
    }





}
