package com.aryan.orderservice.model;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity // this class is a JPA entity
@Table(name = "t_orders")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String orderNumber;
    @OneToMany(cascade = CascadeType.ALL) // relationship between Order and OrderLineItems
    private List<OrderLineItems> orderLineItemsList;
}
