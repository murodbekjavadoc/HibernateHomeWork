package main.madel;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "vocation")
public class Vocation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "start_time")
    private LocalDate startTime;
    @Column(name = "end_time")
    private LocalDate endTime;

    @OneToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

// Employee id +

}
