package entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "students")
public class Student extends Person {
    @Column(name = "average_grade")
    private double averageGrade;
    private int attendance;
    @ManyToMany
    private Set<Course> courses;


    public Student(int id, String firstName, String lastName, String phoneNumber, double averageGrade, int attendance) {
        super(id, firstName, lastName, phoneNumber);
        this.averageGrade = averageGrade;
        this.attendance = attendance;
    }

    public Student() {

    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courseSet) {
        this.courses = courseSet;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    public int getAttendance() {
        return attendance;
    }

    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }
}
