package com.example.hclproject.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PassengerAndTicket {
    @Id
    @GeneratedValue
    private Integer passengerAndTicketId;
    @ManyToOne
    @JoinColumn(name = "userId", referencedColumnName = "userId")
    private User user;
    @ManyToOne
    @JoinColumn(name = "ticketNumber", referencedColumnName = "ticketNumber")
    private Ticket ticket;
}
