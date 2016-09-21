package org.Hospitals.Repositories;

import java.util.List;

import org.Hospitals.Entites.Doctorauth;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface  AuthenticationRepo  extends CrudRepository<Doctorauth,Long>{
	@Query("SELECT a FROM Doctorauth a")
	public List<Doctorauth> getalldoctors();
	@Query("SELECT a FROM Doctorauth a WHERE doctorEmail=?1 and doctorPassword=?2")
	public Doctorauth getauthorizedDoctor(String email, String password);
}
