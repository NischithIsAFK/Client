package com.nis.Client.entity;

import jakarta.persistence.*;
import lombok.Data;
@Entity
@Table(name = "student")
@Data
public class Student {
	
	@Id
	private long id;
	private String name;
	@ManyToOne
	@JoinColumn(name = "college_id", referencedColumnName = "id")
	private College college;
	private long roll;
	private String course;
	private int year;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "certificate_id", referencedColumnName ="id" )
	private Certificate certificate;
	private long hallTicketNo;
	
}
