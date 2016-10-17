package com.glx.app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;


@Entity
public class Medicine {
	@Id
	private int mid;
public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
private String mname;
@ManyToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)

private List<Patient> patients;

public String getMname() {
	return mname;
}
public void setMname(String mname) {
	this.mname = mname;
}
public List<Patient> getPatients() {
	return patients;
}
public void setPatients(List<Patient> patients) {
	this.patients = patients;
}
}
