package org.Hospitals.Controller;

import java.util.List;

import org.Hospitals.Entites.Doctorauth;
import org.Hospitals.Repositories.AuthenticationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {
	@Autowired
	AuthenticationRepo authrepo;
	@RequestMapping("/authorizeddoctors")
public ResponseEntity<List<Doctorauth>> authorizeddoctors(){
		List<Doctorauth> authorizeddoctors = authrepo.getalldoctors(); 
		return new ResponseEntity<List<Doctorauth>>(authorizeddoctors,HttpStatus.OK);
	}
}
