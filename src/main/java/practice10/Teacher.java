package practice10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class Teacher extends Person{

    private Set<Klass> classes;

    public Set<Klass> getClasses() {
        return classes;
    }

    public void setClasses(Set<Klass> classes) {
        this.classes = classes;
    }

    public Teacher(int id, String name, int age, Set<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public String introduce() {
        StringBuilder introduceInfo = new StringBuilder();
        introduceInfo.append(super.introduce()).append(" I am a Teacher. I teach ");

        if (classes == null || classes.size() == 0) {
            return introduceInfo.append("No Class.").toString();
        }

        List<Integer> classesNumber = new ArrayList<>();
        introduceInfo.append("Class ");
        for (Klass klass: classes) {
            classesNumber.add(klass.getNumber());
        }

        Collections.sort(classesNumber);
        for (int i = 0; i < classesNumber.size(); i++) {
            introduceInfo.append(classesNumber.get(i));
            if (i != classesNumber.size() - 1) {
                introduceInfo.append(", ");
            } else {
                introduceInfo.append(".");
            }
        }

        return introduceInfo.toString();
    }

    public boolean isTeaching(Student student) {
        for (Klass klass: classes) {
            if (student.getKlass().equals(klass)) {
                return true;
            }
        }
        return false;
    }

    public String introduceWith(Student student) {
        if (isTeaching(student)) {
            return super.introduce() + " I am a Teacher. I teach " + student.getName() + ".";
        }
        return super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";
    }
}
