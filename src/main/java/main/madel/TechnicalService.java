package main.madel;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "technical_service")
public class TechnicalService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "start_time")
    private LocalDate startTime;
    @Column(name = "end_time")
    private LocalDate endTime;
    @Column(name = "description")
    private String description;

    @OneToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @OneToOne
    @JoinColumn(name = "station_id")
    private Station station;

    @OneToOne
    @JoinColumn(name = "employee_id")
    private Employee pes;


    // Employee id+
    // Station id +


}
