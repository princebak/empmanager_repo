package com.blh.empmanager.restrepositories;

import com.blh.empmanager.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:3000")
@RepositoryRestResource(collectionResourceRel = "employees",path = "employees")
public interface EmployeeRestRepository extends JpaRepository<Employee, Long> {
    //Boolean getEmployeesByFnamemp(String fnamemp);
    Boolean existsByFnamemp(String fnamemp);
}
