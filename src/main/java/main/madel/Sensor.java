package main.madel;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "sensor")
public class Sensor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name")
    private String name;


    @ManyToOne (fetch=FetchType.LAZY)
    @JoinColumn(name = "station_id")
    private Station station;


    @ManyToOne (fetch=FetchType.LAZY)
    @JoinColumn(name = "substance_id")
    private Substance substance;

}
