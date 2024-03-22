package com.nis.Client.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="college")
@Data
public class College {
	
	@Id
	private long id;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id",referencedColumnName = "id")
	private User collegeAdmin;

	private String collegeName;
	private String location;

}
