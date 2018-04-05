package practice11;

public class Klass {

    private int number;

    private Student leader;

    private Teacher teacher;

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

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getDisplayName() {
        return "Class " + number;
    }

    public void assignLeader(Student student) {
        if (isIn(student)) {
            setLeader(student);
            if (this.teacher != null) {
                System.out.print("I am "+ this.teacher.getName() +". I know "+ student.getName() +" become Leader of "+ this.getDisplayName() +".\n");
            }
        } else {
            System.out.print("It is not one of us.\n");
        }
    }

    public void appendMember(Student student) {
        student.setKlass(this);
        if (this.teacher != null) {
            System.out.print("I am "+ this.teacher.getName() +". I know "+ student.getName() +" has joined "+ this.getDisplayName() +".\n");
        }
    }

    public boolean isIn(Student student) {
        if (student.getKlass().getNumber() == this.number) {
            return true;
        }
        return false;
    }

}
