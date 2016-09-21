package org.Hospitals.Entites;


import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ailmentsrelation database table.
 * 
 */
@Entity
public class Ailmentsrelation implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="ailment_")
	private String ailment;

	@Column(name="general_department")
	private String generalDepartment;

	public Ailmentsrelation() {
	}

	public String getAilment() {
		return this.ailment;
	}

	public void setAilment(String ailment) {
		this.ailment = ailment;
	}

	public String getGeneralDepartment() {
		return this.generalDepartment;
	}

	public void setGeneralDepartment(String generalDepartment) {
		this.generalDepartment = generalDepartment;
	}

}