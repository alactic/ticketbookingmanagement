package com.example.demo.ticketPackage;

import javax.persistence.*;
import java.util.Date;
/**
 * Created by user on 11/14/2017.
 */

@Entity
@Table(name = "ticket")
public class ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "tickt_id")
    private Integer ticketId;

    @Column (name = "passenger_name", nullable = false)
    private String passengerValue;

    @Column (name = "bbooking_date")
    private Date bookingDate;
}
