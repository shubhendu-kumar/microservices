package com.spde.department.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departmentId;
    @Column(name = "department_name", nullable = false, length = 64)
    private String departmentName;
    @Column(name = "department_address", nullable = false, length = 128)
    private String departmentAddress;
    @Column(name = "department_code", nullable = false, length = 16)
    private String departmentCode;
}
