package com.spde.user.valueobjects;

import com.spde.user.entities.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDepartmentAssociation {
    private User user;
    private Department department;
}
