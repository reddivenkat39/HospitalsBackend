package org.Hospitals.Entites;


import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the patients database table.
 * 
 */
@Entity
@Table(name="patients")
@NamedQuery(name="Patient.findAll", query="SELECT p FROM Patient p")
public class Patient implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="age_")
	private int age;

	@Column(name="ailment_")
	private String ailment;

	@Column(name="financial_status")
	private String financialStatus;

	@Column(name="location_")
	private int location;

	@Column(name="patient_email")
	private String patientEmail;

	@Column(name="patient_fname")
	private String patientFname;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="patient_id")
	private String patientId;

	@Column(name="patient_lname")
	private String patientLname;

	@Column(name="sex_")
	private String sex;

	public Patient() {
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAilment() {
		return this.ailment;
	}

	public void setAilment(String ailment) {
		this.ailment = ailment;
	}

	public String getFinancialStatus() {
		return this.financialStatus;
	}

	public void setFinancialStatus(String financialStatus) {
		this.financialStatus = financialStatus;
	}

	public int getLocation() {
		return this.location;
	}

	public void setLocation(int location) {
		this.location = location;
	}

	public String getPatientEmail() {
		return this.patientEmail;
	}

	public void setPatientEmail(String patientEmail) {
		this.patientEmail = patientEmail;
	}

	public String getPatientFname() {
		return this.patientFname;
	}

	public void setPatientFname(String patientFname) {
		this.patientFname = patientFname;
	}

	public String getPatientId() {
		return this.patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public String getPatientLname() {
		return this.patientLname;
	}

	public void setPatientLname(String patientLname) {
		this.patientLname = patientLname;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

}