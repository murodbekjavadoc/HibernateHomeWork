package main.madel;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Getter
@Setter
@Entity
@Table(name = "substance")
public class Substance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;                                   // moddaning id
    @Column(name = "name")
    private String name;                                  // moddaning nomi
    @Column(name = "description",columnDefinition = "text")
    private String description;                           // Kelip chiqish sababi
    @Column(name = "commit")
    private String unit;                                   // olchov birligi
    @Column(name = "course",columnDefinition = "text")
    private String course;                                // kelip chiqish sababi
}
