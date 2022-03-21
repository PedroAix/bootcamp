package com.example.domains.contracts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.domains.entities.Staff;
import com.example.domains.entities.projections.EmpleadoProjection;

@RepositoryRestResource(path="empleados", itemResourceRel="empleado", 
	collectionResourceRel="empleados", excerptProjection = EmpleadoProjection.class)
public interface StaffRepository extends JpaRepository<Staff, Integer> {

}
