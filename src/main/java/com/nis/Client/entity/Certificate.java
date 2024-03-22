package com.nis.Client.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "certificate")
public class Certificate {
    @Id
    private Long id;
    private int year;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "college_id", referencedColumnName ="id" )
    private College college;
}
