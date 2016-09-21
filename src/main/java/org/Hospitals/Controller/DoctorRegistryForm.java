package org.Hospitals.Controller;
import org.Hospitals.Entites.Doctor;
import org.Hospitals.Entites.Doctorauth;
import org.Hospitals.Repositories.AuthenticationRepo;
import org.Hospitals.Repositories.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class DoctorRegistryForm {
	@Autowired
	DoctorRepository docrepo;
	@Autowired
	AuthenticationRepo docauthrepo;
@RequestMapping("/doctorregistryform")
public String doctorregistryform(@RequestParam("general-department") String generaldep,@RequestParam("incominghours") String incominghours,
		@RequestParam("outgoinghours") String outgoinghours,@RequestParam("speciality") String speciality ,@RequestParam("fees") String fees,
		@RequestParam("doctorpassword") String password,@RequestParam("doctorname") String docname,@RequestParam("doctormail") String docmail,
		@RequestParam("DoctorRole") String doctorrole){
		
		Doctor doc = new Doctor();
		Doctorauth docauth = new Doctorauth();
		java.sql.Time incoming = java.sql.Time.valueOf(incominghours);
		java.sql.Time outgoing = java.sql.Time.valueOf(outgoinghours);
		doc.setDoctorName(docname);
		doc.setDoctorMail(docmail);
		doc.setDoctorFees(Integer.valueOf(fees));
		doc.setGeneralDepartment(generaldep);
		doc.setSpecialityDepartment(speciality);
		doc.setIncomingHours(incoming);
		doc.setOutgoingHours(outgoing);
		docrepo.save(doc);
		docauth.setDoctorId(doc.getDoctorId());
		docauth.setDoctorEmail(doc.getDoctorMail());
		docauth.setDoctorPassword(password);
		docauth.setAuthRole(doctorrole);
		docauthrepo.save(docauth);
		return "redirect:http://localhost:9000/";
}
}
