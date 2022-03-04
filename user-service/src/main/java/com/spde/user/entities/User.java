package com.spde.user.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;
    @Column(name = "first_name", nullable = false, length = 16)
    private String firstName;
    @Column(name = "last_name", nullable = false, length = 16)
    private String lastName;
    @Column(name = "email", nullable = false, length = 32)
    private String email;
    @Column(name = "departmentId")
    private Long departmentId;
}
