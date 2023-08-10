package com.example.hclproject.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Passenger {
    @Id
    @GeneratedValue
    private Integer passengerId;
    private String passport;
    private String paymentCardNumber;
    @OneToOne
    @JoinColumn(name = "userId", referencedColumnName = "userId")
    private User user;
}
