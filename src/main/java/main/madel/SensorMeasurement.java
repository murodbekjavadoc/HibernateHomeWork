package main.madel;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "sensor_measurement")
public class SensorMeasurement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "quantity")
    private Double quantity;
    @Column(name = "measuredDate")
    private LocalDateTime measuredDate;

    @OneToOne
    @JoinColumn(name = "sensor_id")
    private Sensor sensor;


    //Sensor id

}
