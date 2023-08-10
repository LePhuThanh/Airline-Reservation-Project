package com.example.hclproject.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightAndSeat {
    @Id
    @GeneratedValue
    private Integer flightAndSeatId;
    @ManyToOne
    @JoinColumn(name = "flightNumber", referencedColumnName = "flightNumber")
    private Flight flight;
    @ManyToOne
    @JoinColumn(name = "seatNumber", referencedColumnName = "seatNumber")
    private Seat seat;
}
