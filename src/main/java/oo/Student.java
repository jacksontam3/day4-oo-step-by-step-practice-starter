package oo;

public class Student extends Person {

    public static final String OCCUPATION = "student";

    private Klass klass;

    public Student(int id, String name, int age) {
        super(id, name, age);
    }


    @Override
    public String introduce() {
        String introduction = String.format("My name is %s. I am %d years old. I am a student.", getName(), getAge());
        if (klass != null) {
            introduction += klass.isLeader(this)
                    ? String.format(" I am the leader of class %d.", klass.getNumber())
                    : String.format(" I am in class %d.", klass.getNumber());
        }
        return introduction;
    }

    public Klass getKlass() {
        return klass;
    }

    public void join(Klass klass) {
        this.klass = klass;
        klass.attach(this);
    }

    public boolean isIn(Klass klass) {
        if (klass != null) return klass == this.klass;
        return false;
    }


}
