package main.madel;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
@Getter
@Setter
@Entity
@Table(name = "vocation")
public class Vocation {  // Tatil vaqti
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "profile_id")
    private Profile profile;

    @Column(name = "start_time")
    private LocalDate startDate;
    @Column(name = "end_time")
    private LocalDate endDate;

}
