package main.madel;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
@Getter
@Setter
@Entity
@Table(name = "sensor_measurement")
public class SensorMeasurement {   // sensorning Hisobot davri
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "quantity")
    private Double quantity;         // olchov miqdori
    @Column(name = "measuredDate")
    private LocalDateTime measuredDate;    //hisobot yozildan davri

    @ManyToOne
    @JoinColumn(name = "sensor_id")
    private Sensor sensor;

}
