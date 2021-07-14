package entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "visitations")
public class Visitation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date visitationDate;
    @Column(length = 1000)
    private String comments;

    public Visitation(Date visitationDate, String comments) {
        this.visitationDate = visitationDate;
        this.comments = comments;
    }

    public Visitation() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getVisitationDate() {
        return visitationDate;
    }

    public void setVisitationDate(Date visitationDate) {
        this.visitationDate = visitationDate;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

}
