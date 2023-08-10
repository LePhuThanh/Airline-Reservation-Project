package com.example.hclproject.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue
    private Integer employeeId;
    private BigDecimal salary;
    @OneToOne
    @JoinColumn(name = "userId", referencedColumnName = "userId")
    private User user;
}
