package com.glx.app;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;




@Repository
public class PatientDAOImpl implements PatientDAO {

	@Autowired
	private SessionFactory sf;
	
	@Override
	public void save(Patient p) {
		Session session=sf.openSession();
		session.beginTransaction();
		session.save(p);
	
	    session.getTransaction().commit();
	    session.clear();
	    session.close();
	}

	@Override
	public Patient check(int pid, String password) {
		Session session=sf.openSession();
		Query query=session.createQuery("from Patient where pid =:u");
		query.setInteger("u", pid);
		List<Patient> pat=query.list();
		session.close();
			for(int i=0;i<pat.size();i++){
			if(pat.get(i).getPassword().equals(password))
				return pat.get(i);
		}
			return null;
	
		
	}

	@Override
	public List<Patient> getUsers(int id) {
		Session session=sf.openSession();
		Query query=session.createSQLQuery("select * from patient_medicine where medicines_mid="+id);
	List<Object[]> pat=query.list();
		List<Patient> patient=new ArrayList<Patient>();
		for(Object[] p:pat)
		{
			int pid=Integer.parseInt(p[0].toString());
			System.out.println(pid);
			patient.add(session.get(Patient.class, pid));
			
		}
		return patient;
	}

}
