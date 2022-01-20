package com.sunglowsys.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "order_tab")
public class Order implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "order_id")
    private Long id ;

    @Column(name = "order_name", nullable = false)
    private String orderName ;

    @Column(name = "brand", nullable = false)
    private String brand ;

    @Column(name = "category")
    private String category ;

    @Column(name = "price", nullable = false)
    private String price ;

    @Column(name = "order_details", nullable = false)
    private String details ;

    public Order(){}

    public Order(String orderName, String brand, String category, String price, String details) {
        this.orderName = orderName;
        this.brand = brand;
        this.category = category;
        this.price = price;
        this.details = details;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(id, order.id) && Objects.equals(orderName, order.orderName) && Objects.equals(brand, order.brand) && Objects.equals(category, order.category) && Objects.equals(price, order.price) && Objects.equals(details, order.details);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, orderName, brand, category, price, details);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderName='" + orderName + '\'' +
                ", brand='" + brand + '\'' +
                ", category='" + category + '\'' +
                ", price='" + price + '\'' +
                ", details='" + details + '\'' +
                '}';
    }
}
