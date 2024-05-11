package com.example.bola1.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Mission {

    @Id
    @GeneratedValue
    private Integer missionId;
    private String missionName;

    @ManyToMany(mappedBy = "missionList")
    List<Employee> employeeList;

}
