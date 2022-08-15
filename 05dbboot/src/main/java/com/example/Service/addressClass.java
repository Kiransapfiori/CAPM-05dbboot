package com.example.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.entity.*;
@Component
public class addressClass {
@Autowired
IaddressPresistence add;


public List<address> getaddress(){
	
	return add.findAll();
	
}

public address createAddress(address payload){
	return  add.save(payload); 	 	
}
}
