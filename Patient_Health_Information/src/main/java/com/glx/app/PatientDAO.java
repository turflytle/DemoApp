package com.glx.app;

import java.util.List;

public interface PatientDAO {
public void save(Patient p);
public Patient check(int pid,String password);
public List<Patient>  getUsers(int id); 
	

}
