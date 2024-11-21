package oo;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {

    public static final String OCCUPATION = "teacher";
    private List<Klass> klass;

    public Teacher(int id, String name, int age) {
        super(id,name,age);
        klass = new ArrayList<Klass>();
    }

    @Override
    public String introduce () {
        return String.format("My name is %s. I am %d years old. I am a %s.",getName(), getAge(), OCCUPATION);
    }

    public void assignTo(Klass klass) {
        this.klass.add(klass);
    }

    public boolean belongsTo(Klass klass) {
        if (this.klass == null)return false;
        return this.klass.contains(klass);
    }
}
