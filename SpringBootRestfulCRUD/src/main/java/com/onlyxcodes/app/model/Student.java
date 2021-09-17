package com.onlyxcodes.app.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
@Entity
@Table(name = "tbl_student")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "student_id")
	private int id;
	
	@Column(name = "student_firstname")
	private String firstname;
	
	@Column(name = "student_lastname")
	private String lastname;
	
	@Column(name = "student_DOB")
	private Date DOB;
	
	@Column(name = "student_DOJ")
	private Date DOJ;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date DOB) {
		this.DOB = DOB;
	}
	
	public Date getDOJ() {
		return DOJ;
	}

	public void setDOJ(Date DOJ) {
		this.DOJ = DOJ;
	}
}
