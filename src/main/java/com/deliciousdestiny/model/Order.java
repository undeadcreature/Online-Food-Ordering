package com.deliciousdestiny.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name= "orders")

public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private user customer;

    @JsonIgnore
    @ManyToOne
    private Restaurant restaurant;

    private Long totalAmounts;

    private String orderStatus;

    private Date createdAt;

    @ManyToOne
    private  Address deliveryAddress;

    @OneToMany
    private List<OrderItem> items;

    private int totalItem;

    private  int totalPrice;


}
