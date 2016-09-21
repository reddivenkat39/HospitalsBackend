package org.Hospitals.Entites;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the doctorauth database table.
 * 
 */
@Entity
public class Doctorauth implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="auth_role")
	private String authRole;

	@Column(name="doctor_email")
	private String doctorEmail;
	@Id
	@Column(name="doctor_id")
	private String doctorId;

	@Column(name="doctor_password")
	private String doctorPassword;

	public Doctorauth() {
	}

	public String getAuthRole() {
		return this.authRole;
	}

	public void setAuthRole(String authRole) {
		this.authRole = authRole;
	}

	public String getDoctorEmail() {
		return this.doctorEmail;
	}

	public void setDoctorEmail(String doctorEmail) {
		this.doctorEmail = doctorEmail;
	}

	public String getDoctorId() {
		return this.doctorId;
	}

	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public String getDoctorPassword() {
		return this.doctorPassword;
	}

	public void setDoctorPassword(String doctorPassword) {
		this.doctorPassword = doctorPassword;
	}

}