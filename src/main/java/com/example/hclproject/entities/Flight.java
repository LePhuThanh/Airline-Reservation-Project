package com.example.hclproject.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Flight {
    @Id
    private String flightNumber;
    private String destination;
    private String departure;
    private LocalDateTime departureDate;
    private LocalDateTime  arrivalDate;
    @ManyToOne
    @JoinColumn(name = "airlineNumber", referencedColumnName = "airlineNumber")
    private Airline airline;
    @OneToMany(mappedBy = "flight")
    @JsonIgnore
    private List<Ticket> ticketList;
}
