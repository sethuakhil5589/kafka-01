package com.akhil.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.akhil.Entity.Cricketer;
import com.akhil.service.CricketerServiceImpl;

@RestController
public class CricketerRestController {
	
	@Autowired
	private CricketerServiceImpl service;
	
	@PostMapping("/save")
	public ResponseEntity<String> savingData(@RequestBody Cricketer cric){
		
		return new ResponseEntity<String>(service.saveData(cric),HttpStatus.OK);
	}
	@PostMapping("/add")
	public String addingTopic(Cricketer crick) {
		 String msg = service.addMsg(crick);
		 System.out.println(msg);
		 return msg;
	}
}
