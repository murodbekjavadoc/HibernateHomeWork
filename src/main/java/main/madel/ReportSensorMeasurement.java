package main.madel;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Getter
@Setter
@Entity
@Table(name = "Report_Sensor_Measurement")
public class ReportSensorMeasurement {  // report bilan sensorni ulaydi
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)// true
    @JoinColumn(name = "report_id")
    private Report report;
    @ManyToOne(fetch = FetchType.LAZY)   // true
    @JoinColumn(name = "sensor_measurement")
    private SensorMeasurement sensorMeasurement;


}
