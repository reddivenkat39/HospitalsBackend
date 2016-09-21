package org.Hospitals.Repositories;

import java.util.List;

import org.Hospitals.Entites.Patient;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PatientsRepository extends CrudRepository<Patient,Long>{

	@Query("SELECT a FROM Patient a")
	public List<Patient> getallpatients();
	
	@Query("SELECt a FROM Patient a WHERE ailment=?1")
	public List<Patient> getpatientbyailment(String ailment);
}
