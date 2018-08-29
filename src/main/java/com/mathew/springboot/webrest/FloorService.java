package com.mathew.springboot.webrest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/floor")
public class FloorService {

	@Autowired
	ComponentOrService compOrServce;

	@GetMapping("/office1")
	public ResponseEntity<?> enterOffice1() {
		return new ResponseEntity<>(compOrServce.getOffice1Msg(), HttpStatus.OK);
	}

	@GetMapping("/office2")
	public ResponseEntity<?> enterOffice2() {
		return new ResponseEntity<>(compOrServce.getOffice2Msg(), HttpStatus.OK);
	}

	@GetMapping("/signup")
	public String signUp() {
		return "Please Sign up";
	}
	@GetMapping("/signupnew")
	public String signupnew() {
		return "Please Sign upNew----->";
	}

}
