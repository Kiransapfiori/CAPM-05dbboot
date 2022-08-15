package com.example.Controller;

import java.util.HashMap;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Vendor;
import com.example.Service.vendorClass;

@RestController

public class VendorController {
	
@Autowired
vendorClass vendorClass;

//@RequestMapping(method = RequestMethod.PUT, value = "/Changevendor")
// public Vendor updateVendor(@RequestBody Vendor vendor ) {
//	return vendorClass.changeVendor(vendor);
//	
//}

@RequestMapping("/Vendor")
public List <Vendor> getvendors(){
	return vendorClass.readallvendor();
	
}
//@RequestMapping("/Vendor/{vendorcode}")
//public Vendor getVendorById(@PathVariable("vendorcode") String code ) {
//	return vendorClass.getSingleVendorById(code);
//	
//}
@PostMapping("/Vendor")
public Vendor createvendor(@RequestBody Vendor mypostbody ) {
	return vendorClass.CreateVendor(mypostbody);
} 

@RequestMapping("/Vendor/search")
public List<Vendor> searchByCompany(@RequestParam String companycode){
  return vendorClass.searchbyCompany(companycode);	
}
@RequestMapping("/Vendor/{VendorCode}")
public Vendor getbysinglevendor(@PathVariable("vendorcode")Long code) {
	Optional <Vendor> searchresult =  vendorClass.getsingleVendor(code);
	return searchresult.get();
	
}
@RequestMapping(method =RequestMethod.PUT,value="/Vendor")
public Vendor updatevendor(@RequestBody Vendor vendor) {
	return vendorClass.changevendor(vendor);
}
}
