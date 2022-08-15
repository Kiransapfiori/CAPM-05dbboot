package com.example.Service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.entity.Vendor;

@Component
public class vendorClass {
	
	@Autowired
    IVendorPersistence vendor;

	public List<Vendor> readallvendor() {
		
		 return vendor.findAll();

	}
//
//	public Vendor getSingleVendorById(String VendorCode) {
//		return (Vendor) vendors.get(VendorCode);
//
//	}
//
//	public Vendor changeVendor(Vendor vendor) {
//		return vendor;
//	}

	public Vendor CreateVendor(Vendor vendorobj) {

		return vendor.save(vendorobj);
	}
 public List<Vendor>searchbyCompany(String companycode)
 {
	return vendor.findByCompanyName(companycode);
 }
  
 public Optional<Vendor> getsingleVendor(Long id ) {
	 return vendor.findById(id);
 }
 public Vendor changevendor(Vendor payload) {
	 Optional<Vendor> searchresult = vendor.findById(payload.getId());
	 if(!searchresult.isPresent()) {
		return new Vendor((long)0,"","","","", null, null); 
		
	 }
	 return vendor.save( payload);
	 }


}
