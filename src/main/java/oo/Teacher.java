package oo;

public class Teacher extends Person {

    public static final String OCCUPATION = "teacher";
    private Klass klass;

    public Teacher(int id, String name, int age) {
        super(id,name,age);
    }

    @Override
    public String introduce () {
        return String.format("My name is %s. I am %d years old. I am a %s.",getName(), getAge(), OCCUPATION);
    }

    public void assignTo(Klass klass) {
        this.klass = klass;
    }

    public boolean belongsTo(Klass klass) {
        if (this.klass == null)return false;
        return this.klass.equals(klass);
    }
}
