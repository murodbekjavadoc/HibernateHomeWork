package main.madel;

import javax.persistence.*;

@Entity
@Table(name = "sensor")
public class Sensor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name")
    private String name;


    @OneToOne
    @JoinColumn(name = "station")
    private Station station;


    @OneToOne
    @JoinColumn(name = "substance")
    private Substance substance;

    //Station id
    //Substance id


}
