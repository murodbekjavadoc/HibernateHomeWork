package main.madel;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "employee")

public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name", nullable = false, columnDefinition = "varchar(50)")
    private String name;
    @Column(name = "creat_date", nullable = false)
    private LocalDate localDate;
    @Column(name = "phone", columnDefinition = "varchar(15)")
    private String phone;
    @Column(name = "email")
    private String email;
    @Column(name = "certificate_num", nullable = false)
    private String certificateNumber;

    @OneToOne
    @JoinColumn(name = "role")
    private Role role;

    // Role role+
}
