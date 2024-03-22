package com.nis.Client.entity;

import jakarta.persistence.*;
import lombok.Data;
@Entity
@Table(name = "student")
@Data
public class Student {
	
	@Id
	private Long id;
	private String name;
	@ManyToOne
	@JoinColumn(name = "college_id", referencedColumnName = "id")
	private College college;
	private Long roll;
	private String course;
	private int year;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "certificate_id", referencedColumnName ="id" )
	private Certificate certificate;
	private Long hallTicketNo;
	
}
