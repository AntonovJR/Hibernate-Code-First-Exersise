package entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private Double quantity;

    private BigDecimal price;

    @OneToMany(mappedBy = "product", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private Set<Sale> sales;

    public Product(int id, String name, Double quantity, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.sales = new HashSet<>();
    }

    public Product() {
        this.sales = new HashSet<>();
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

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Set<Sale> getSales() {
        return sales;
    }

    public void setSales(Set<Sale> sales) {
        this.sales = sales;
    }
}
