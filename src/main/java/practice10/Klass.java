package practice10;

public class Klass {

    private int number;

    private Student leader;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Student getLeader() {
        return leader;
    }

    public void setLeader(Student leader) {
        this.leader = leader;
    }

    public Klass(int number) {
        this.number = number;
    }

    public String getDisplayName() {
        return "Class " + number;
    }

    public void assignLeader(Student student) {
        if (isIn(student)) {
            setLeader(student);
        } else {
            System.out.print("It is not one of us.\n");
        }
    }

    public void appendMember(Student student) {
        student.setKlass(this);
    }

    public boolean isIn(Student student) {
        if (student.getKlass().getNumber() == this.number) {
            return true;
        }
        return false;
    }
}





