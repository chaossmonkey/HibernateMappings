package com.example.bola1.Entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Cascade;

import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Employee {

    @Id
    @GeneratedValue
    private Integer employeeId;

    private String employeeName;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "address_id",referencedColumnName = "addressId")
    private Address address;


    @OneToMany(cascade = CascadeType.PERSIST,mappedBy = "employee",fetch = FetchType.EAGER)
    private List<Task> taskList;

}
