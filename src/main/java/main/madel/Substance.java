package main.madel;

import javax.persistence.*;

@Entity
@Table(name = "substance")
public class Substance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name")
    private String name;

    @Column(name = "description", columnDefinition = "test")
    private String description;
    @Column(name = "m_unit")
    private String unit;
    @Column(name = "course", columnDefinition = "test")
    private String course;
}
