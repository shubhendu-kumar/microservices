package com.spde.user.valueobjects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department implements Serializable {
    private Long departmentId;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;
}
