package com.nis.Client.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
@Entity
@Table(name = "placement")
@Data
public class Placement {

    @Id
    private Long id;
    private String name;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "college_id", referencedColumnName ="id" )
    private College college;
    private LocalDate date;
    private String qualification;
    private int year;

}
