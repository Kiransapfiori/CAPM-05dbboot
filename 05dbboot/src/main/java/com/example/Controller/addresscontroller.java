package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.Service.addressClass;
import com.example.entity.address;
@RestController
public class addresscontroller {
	@Autowired
	addressClass add;
	@RequestMapping("/address")
	public List<address> getaddress(){
		return add.getaddress();
		
	}
	
	@PostMapping("/address")
	public address createAddress(@RequestBody address payload){
		return  add.createAddress(payload); 	 	 	 	
	}
}
