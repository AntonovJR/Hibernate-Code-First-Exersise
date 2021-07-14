package entities;

import javax.persistence.*;

@Entity
@Table(name = "billing_details")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class BillingDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private User user;

    public BillingDetails(int id, User user) {
        this.id = id;
        this.user = user;
    }

    public BillingDetails() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
