package com.multi_signing.multi_user_signing.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.multi_signing.multi_user_signing.model.ERoles;
import com.multi_signing.multi_user_signing.model.Roles;

public interface RoleRepository extends JpaRepository <Roles , Long> {
	Optional<Roles> findByName(ERoles name);
}
