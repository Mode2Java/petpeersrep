package com.security.pet.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.security.pet.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
