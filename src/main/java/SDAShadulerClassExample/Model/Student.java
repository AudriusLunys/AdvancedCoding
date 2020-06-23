package SDAShadulerClassExample.Model;

import java.time.LocalDate;

public class Student extends Person {
    private  boolean hasPreviousJavaKnowledge;

    public Student (){

    }

    public Student(String firstName, String lastName, LocalDate dateOfBirth, boolean hasPreviousJavaKnowledge) {
        super(firstName, lastName, dateOfBirth);
        this.hasPreviousJavaKnowledge = hasPreviousJavaKnowledge;
    }

    public boolean isHasPreviousJavaKnowledge() {
        return hasPreviousJavaKnowledge;
    }

    public void setHasPreviousJavaKnowledge(boolean hasPreviousJavaKnowledge) {
        this.hasPreviousJavaKnowledge = hasPreviousJavaKnowledge;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString()+
                "hasPreviousJavaKnowledge=" + hasPreviousJavaKnowledge +
                '}';
    }
}
