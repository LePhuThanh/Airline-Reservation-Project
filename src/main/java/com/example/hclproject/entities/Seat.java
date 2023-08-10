package com.example.hclproject.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Seat {
    @Id
    @GeneratedValue
    private Integer seatNumber;
    @ManyToOne
    @JoinColumn(name = "airlineNumber", referencedColumnName = "airlineNumber")
    private Airline airline;
    private String seatClass; //Or change to Enum Type
    private BigDecimal price;
    @OneToMany(mappedBy = "seat")
    @JsonIgnore
    private List<Ticket> ticketList;
}
