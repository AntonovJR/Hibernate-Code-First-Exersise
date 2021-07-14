package entities;


import javax.persistence.*;

@Entity
@Table(name = "diagnoses")
public class Diagnose {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 50)
    private String name;
    @Column(length = 1000)
    private String comments;

    public Diagnose(String name, String comments) {
        this.name = name;
        this.comments = comments;
    }

    public Diagnose() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
