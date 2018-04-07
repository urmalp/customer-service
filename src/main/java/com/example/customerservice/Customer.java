package com.example.customerservice;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Customer {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    public Customer(String name) {
        this.name = name;
    }
}
