package com.glx.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Servic {
	@Autowired
	private PatientDAO patDAO;
	
	public void save(Patient p)
	{
		patDAO.save(p);
	}
	
	public Patient check(int pid,String password)
	{
		return patDAO.check(pid,password);
	}

	public List<Patient> getUsers(int id) {
		
		return patDAO.getUsers(id);
	}
	
}
