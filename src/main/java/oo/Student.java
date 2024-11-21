package oo;

public class Student extends Person {

    public static final String OCCUPATION = "student";

    public Student(int id, String name, int age) {
        super(id,name,age);
    }


    @Override
    public String introduce () {
        return String.format("My name is %s. I am %d years old. I am a %s.",getName(), getAge(), OCCUPATION);
    }





}
