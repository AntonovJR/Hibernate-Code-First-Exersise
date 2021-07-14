package entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "bank_account")
public class BankAccount extends BillingDetails {
    private String name;
    private String swift;

    public BankAccount(int id, User user, String name, String swift) {
        super(id, user);
        this.name = name;
        this.swift = swift;
    }

    public BankAccount() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSwift() {
        return swift;
    }

    public void setSwift(String swift) {
        this.swift = swift;
    }
}
