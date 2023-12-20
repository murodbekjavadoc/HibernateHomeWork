package main.madel;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "report")
public class Report {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(name = "publish_date")
    private LocalDate publishDate;

    @OneToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;


    // Employee id
}
