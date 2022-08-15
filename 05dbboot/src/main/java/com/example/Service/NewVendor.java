package com.example.Service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.entity.Vendor;
@RepositoryRestResource(collectionResourceRel = "Vendor", path="newVendor")
public interface NewVendor extends JpaRepository<Vendor, Long> {
 
	
}
