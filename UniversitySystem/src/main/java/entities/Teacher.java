package entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "teachers")
public class Teacher extends Person {
    private String email;
    @Column(name = "salary_per_hour")
    private double salaryPerHour;
    @OneToMany(mappedBy = "teacher")
    private Set<Course> courses;


    public Teacher() {

    }

    public Teacher(int id, String firstName, String lastName, String phoneNumber, String email, double salaryPerHour) {
        super(id, firstName, lastName, phoneNumber);
        this.email = email;
        this.salaryPerHour = salaryPerHour;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalaryPerHour() {
        return salaryPerHour;
    }

    public void setSalaryPerHour(double salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }


}
