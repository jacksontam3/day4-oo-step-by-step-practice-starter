package oo;

public class Student extends Person {

    public static final String OCCUPATION = "student";

    private Klass klass;

    public Student(int id, String name, int age) {
        super(id,name,age);
    }


    @Override
    public String introduce () {
        return String.format("My name is %s. I am %d years old. I am a %s.",getName(), getAge(), OCCUPATION);
    }

    public Klass getKlass() {
        return klass;
    }

    public void join(Klass klass) {
        this.klass = klass;
    }

    public boolean isIn (Klass klass){
        if(klass != null) return klass == this.klass;
        return false;
    }





}
