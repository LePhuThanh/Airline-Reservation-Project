package com.example.hclproject.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Airline {
    @Id
    @GeneratedValue
    private Integer airlineNumber;
    private Boolean reservationAvailable;
    private Integer totalSeat;

    @OneToMany(mappedBy = "airline")
    @JsonIgnore
    private List<Seat> seatList;
    @OneToMany(mappedBy = "airline")
    @JsonIgnore
    private List<Flight> flightList;
}
