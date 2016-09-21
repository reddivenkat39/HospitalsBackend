package org.Hospitals.Security;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.Hospitals.Entites.Doctor;
import org.Hospitals.Entites.Doctorauth;
import org.Hospitals.Entites.Patient;
import org.Hospitals.Repositories.AilmentsrelationRepo;
import org.Hospitals.Repositories.AuthenticationRepo;
import org.Hospitals.Repositories.DoctorRepository;
import org.Hospitals.Repositories.PatientsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class DoctorsLogin {
	@Autowired
	AuthenticationRepo docauthrepo;
	@Autowired
	PatientsRepository patientrepo;
	@Autowired
	DoctorRepository doctorrepo;
	@Autowired 
	AilmentsrelationRepo ailmentrepo;
@RequestMapping("/doctorslogin")
public String doctorslogin(@RequestParam("dctname") String doctorname,@RequestParam("dctpassword") String Password,Model model){
	
	List<Patient> patients =new ArrayList<Patient>();
	Doctorauth doctorauthorization = docauthrepo.getauthorizedDoctor(doctorname, Password);
	if(doctorauthorization!=null){
	Doctor doctor = doctorrepo.getdoctor(doctorauthorization.getDoctorEmail(),doctorauthorization.getDoctorId());
	String docgeneral = doctor.getGeneralDepartment();
	List<String> ailments = ailmentrepo.ailmentsrelated(docgeneral);
	Iterator<String> it = ailments.iterator();
	while(it.hasNext()){
		patients.addAll(patientrepo.getpatientbyailment(it.next()));
	}
	model.addAttribute("patients",patients);
	return "doctorpersonalpage";
	}
	else 
		return "errorinlogin";
		
}
}
