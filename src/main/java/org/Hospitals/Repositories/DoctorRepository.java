package org.Hospitals.Repositories;

import org.Hospitals.Entites.Doctor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends CrudRepository<Doctor,Long>{

	@Query("SELECT a FROM Doctor a WHERE doctorMail=?1 and doctorId=?2")
	public Doctor getdoctor(String mail,String id);
}
