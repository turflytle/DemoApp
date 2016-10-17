package com.glx.app;



import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;





@Entity
public class Patient {
	@Id
	@NotNull(message="Id Should Not be Empty")
	
private int pid;
	@NotEmpty(message="Name Field Should Not Be Empty")
	@Size(min=5 ,max=20,message="Name Length should be 5-20")
private String pname;
	@Pattern(regexp="((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})",message="Password length between 8-15")
private String password;
	@NotEmpty(message="Disease field should not be empty")
	@Size(min=5 ,max=20,message=" Length should be 5-20")
private String disease;
@Transient
@NotEmpty(message="Medicines field should not be empty")
private String medicins;


@ManyToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)

private List<Medicine> medicines;

public String getMedicins() {
	return medicins;
}
public void setMedicins(String medicins) {
	this.medicins = medicins;
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getDisease() {
	return disease;
}
public void setDisease(String disease) {
	this.disease = disease;
}

public List<Medicine> getMedicines() {
	return medicines;
}
public void setMedicines(List<Medicine> medicines) {
	this.medicines = medicines;
}
}
