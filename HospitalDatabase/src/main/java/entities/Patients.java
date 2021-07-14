package entities;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "patients")
public class Patients {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "first_name", length = 50)
    private String firstName;
    @Column(name = "last_name", length = 50)
    private String lastName;
    private String address;
    @Column(length = 100)
    private String email;
    @Column(name = "birth_date")
    private Date birthDate;
    private String picture;
    @Column(name = "is_insurance")
    private boolean isInsurance;
    @OneToMany
    private Set<Visitation> visitations;
    @ManyToMany
    private Set<Diagnose> diagnoses;
    @ManyToMany
    private Set<Medicament> medicaments;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Set<Visitation> getVisitations() {
        return visitations;
    }

    public void setVisitations(Set<Visitation> visitations) {
        this.visitations = visitations;
    }

    public Set<Diagnose> getDiagnoses() {
        return diagnoses;
    }

    public void setDiagnoses(Set<Diagnose> diagnoses) {
        this.diagnoses = diagnoses;
    }

    public Set<Medicament> getMedicaments() {
        return medicaments;
    }

    public void setMedicaments(Set<Medicament> medicaments) {
        this.medicaments = medicaments;
    }

    public Patients(String firstName, String lastName, String address, String email, Date birthDate, String picture, boolean isInsurance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.birthDate = birthDate;
        this.picture = picture;
        this.isInsurance = isInsurance;
    }

    public Patients() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public boolean isInsurance() {
        return isInsurance;
    }

    public void setInsurance(boolean insurance) {
        isInsurance = insurance;
    }
}
