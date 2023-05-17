package com.SpringBoot.MyString.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "mycustomers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;
    @Column(nullable = false)
    private String customerName;
    @Column(nullable = false)
    private String productType;
    @Column(nullable = false)
    private String customerAddress;
    @Column(nullable = false)
    private String customerEmail;
}
