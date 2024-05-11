package com.example.bola1.controller;

import com.example.bola1.Entities.Address;
import com.example.bola1.Entities.Employee;
import com.example.bola1.Entities.Mission;
import com.example.bola1.Entities.Task;
import com.example.bola1.repo.AddEmp;
import com.example.bola1.repo.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

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

        Employee employee = new Employee();
        employee.setEmployeeName("GANU");

        Address address = new Address();
        address.setAddress("Magadi");

        employee.setAddress(address);
        address.setEmployee(employee);

        Task task = new Task();
        task.setTaskName("fast driving");
        task.setEmployee(employee);

        Task task1 = new Task();
        task1.setTaskName("body building");
        task1.setEmployee(employee);

        List<Task> taskList = new ArrayList<>();
        taskList.add(task1);
        taskList.add(task);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee);

        Mission mission = new Mission();
        mission.setEmployeeList(employeeList);
        mission.setMissionName("rash driving");

        Mission mission1 = new Mission();
        mission1.setEmployeeList(employeeList);
        mission.setMissionName("great donkey");

        List<Mission> missionList = new ArrayList<>();
        missionList.add(mission1);
        missionList.add(mission);

        employee.setMissionList(missionList);


        employee.setTaskList(taskList);

        empRepo.save(employee);



    }
}
