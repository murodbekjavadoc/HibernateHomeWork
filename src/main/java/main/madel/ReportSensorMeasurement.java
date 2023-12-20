package main.madel;

import javax.persistence.*;

@Entity
@Table(name = "Report_Sensor_Measurement")
public class ReportSensorMeasurement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    @JoinColumn(name = "report_id")
    private Report report;
    @OneToOne
    @JoinColumn(name = "sensor_measurement")
    private SensorMeasurement sensorMeasurement;


    // Report id
    // SensorMeasurement id
}
