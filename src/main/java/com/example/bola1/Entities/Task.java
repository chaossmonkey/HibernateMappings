package com.example.bola1.Entities;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Task {

    @Id
    @GeneratedValue
    private Integer taskId;

    private String taskName;

    @ManyToOne
    @JoinColumn(name = "emp_id")
    private Employee employee;


}
