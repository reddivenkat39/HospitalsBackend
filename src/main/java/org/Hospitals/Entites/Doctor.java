package org.Hospitals.Entites;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;


/**
 * The persistent class for the doctors database table.
 * 
 */
@Entity
public class Doctor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="doctor_fees")
	private int doctorFees;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="doctor_id")
	private String doctorId;

	@Column(name="doctor_mail")
	private String doctorMail;

	@Column(name="doctor_name")
	private String doctorName;

	@Column(name="general_department")
	private String generalDepartment;

	@Column(name="incoming_hours")
	private Time incomingHours;

	@Column(name="outgoing_hours")
	private Time outgoingHours;

	@Column(name="speciality_department")
	private String specialityDepartment;

	public Doctor() {
	}

	public int getDoctorFees() {
		return this.doctorFees;
	}

	public void setDoctorFees(int doctorFees) {
		this.doctorFees = doctorFees;
	}

	public String getDoctorId() {
		return this.doctorId;
	}

	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public String getDoctorMail() {
		return this.doctorMail;
	}

	public void setDoctorMail(String doctorMail) {
		this.doctorMail = doctorMail;
	}

	public String getDoctorName() {
		return this.doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getGeneralDepartment() {
		return this.generalDepartment;
	}

	public void setGeneralDepartment(String generalDepartment) {
		this.generalDepartment = generalDepartment;
	}

	public Time getIncomingHours() {
		return this.incomingHours;
	}

	public void setIncomingHours(Time incomingHours) {
		this.incomingHours = incomingHours;
	}

	public Time getOutgoingHours() {
		return this.outgoingHours;
	}

	public void setOutgoingHours(Time outgoingHours) {
		this.outgoingHours = outgoingHours;
	}

	public String getSpecialityDepartment() {
		return this.specialityDepartment;
	}

	public void setSpecialityDepartment(String specialityDepartment) {
		this.specialityDepartment = specialityDepartment;
	}

}
