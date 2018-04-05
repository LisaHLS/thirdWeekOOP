package practice11;

public class Student extends Person{
    private Klass klass;

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public String introduce() {
        if (klass.getLeader() != null &&  klass.getLeader().getId() == super.getId()) {
            return super.introduce() + " I am a Student. I am Leader of " + klass.getDisplayName() + ".";
        }
        return super.introduce() + " I am a Student. I am at " + klass.getDisplayName() + ".";
    }
}
