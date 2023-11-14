package com.example.springjwtrolebased.repository;

import com.example.springjwtrolebased.entity.Role;
import com.example.springjwtrolebased.enums.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRoleRepository extends JpaRepository<Role,Integer> {
    Role findByRoleName(RoleName roleName);
}