package com.example.bola1.controller;

import com.example.bola1.Entities.Address;
import com.example.bola1.Entities.Employee;
import com.example.bola1.repo.AddEmp;
import com.example.bola1.repo.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {


    private EmpRepo empRepo;
    private AddEmp addEmp;

    @Autowired
    public DemoController(EmpRepo empRepo, AddEmp addEmp) {
        this.empRepo = empRepo;
        this.addEmp = addEmp;
    }



    @GetMapping("/hi")
    public void hello()
    {
        Employee employee=new Employee();
        employee.setEmployeeName("raki");

        Address address=new Address();
        address.setAddress("nagarbhavi");

        address.setEmployee(employee);
        employee.setAddress(address);




        addEmp.save(address);



    }
}
