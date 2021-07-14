package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "credit_card")
public class CreditCard extends BillingDetails {

    @Column(name = "card_type")
    private String cardType;
    @Column(name = "expiration_month")
    private int expirationMonth;
    @Column(name = "expiration_year")
    private int expirationYear;

    public CreditCard(int id, User user, String cardType, int expirationMonth, int expirationYear) {
        super(id, user);
        this.cardType = cardType;
        this.expirationMonth = expirationMonth;
        this.expirationYear = expirationYear;
    }

    public CreditCard() {

    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public int getExpirationMonth() {
        return expirationMonth;
    }

    public void setExpirationMonth(int expirationMonth) {
        this.expirationMonth = expirationMonth;
    }

    public int getExpirationYear() {
        return expirationYear;
    }

    public void setExpirationYear(int expirationYear) {
        this.expirationYear = expirationYear;
    }
}
