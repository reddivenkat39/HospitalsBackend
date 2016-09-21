package org.Hospitals.Repositories;

import java.util.List;

import org.Hospitals.Entites.Ailmentsrelation;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface AilmentsrelationRepo extends CrudRepository<Ailmentsrelation,Long>{
	@Query("SELECT ailment FROM Ailmentsrelation a WHERE generalDepartment=?1")
	public List<String> ailmentsrelated(String gendepartment);
}
