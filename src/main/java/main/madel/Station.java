package main.madel;

import clojure.lang.IFn;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "station")
public class Station {
    @Id
    private int id;
    @Column(name = "latitude")
    private Double latitude;
    @Column(name = "latitude")
    private Double longitude;
}
