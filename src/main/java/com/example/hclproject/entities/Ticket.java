package com.example.hclproject.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.text.DecimalFormat;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ticket {
    @Id
    @GeneratedValue
    private Integer ticketNumber;
    @ManyToOne
    @JoinColumn(name = "flightNumber", referencedColumnName = "flightNumber")
    private Flight flight;
    private BigDecimal price;
    @ManyToOne
    @JoinColumn(name = "seatNumber", referencedColumnName = "seatNumber")
    private Seat seat;
}
