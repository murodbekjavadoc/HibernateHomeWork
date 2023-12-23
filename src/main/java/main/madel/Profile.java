package main.madel;

import lombok.Getter;
import lombok.Setter;
import main.enums.Role;
import org.hibernate.engine.spi.Mapping;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "employee")

public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "ssn",nullable = false,unique = true)
    private String ssn;
    @Column(name = "name",columnDefinition = "varchar(50)")
    private String name;
    @Column(name = "creat_date")
    private LocalDate createdDate;
    @Column(name = "phone", columnDefinition = "varchar(15)")
    private String phone;
    @Column(name = "email")
    private String email;                       // email
    @Column(name = "certificate_num")
    private String certificateNumber;          // Diplom raqami
    @Enumerated(EnumType.STRING)               // Enum uchun default xolatda int turadi
    @Column(name = "role")
    private Role role;


    @OneToMany(mappedBy = "profile") //
    private Set<Vocation> vocation;

}
