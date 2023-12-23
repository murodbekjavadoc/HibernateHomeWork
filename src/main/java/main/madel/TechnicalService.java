package main.madel;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
@Getter
@Setter
@Entity
@Table(name = "technical_service")
public class TechnicalService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "start_time")
    private LocalDate startTime; // boshlanish vaqti
    @Column(name = "end_time")
    private LocalDate endTime;   // Tugash vaqti
    @Column(name = "description")
    private String description;   // Sabablar

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "profile_id")
    private Profile profile;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "station_id")
    private Station station;




    // Profile id+
    // Station id +


}
