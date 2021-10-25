package com.multi_signing.multi_user_signing.repository;

import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.multi_signing.multi_user_signing.model.User;

@Repository
public interface UserRepository extends JpaRepository <User , Long>{

	Optional<User> findByUsername(String username);

	boolean existsByUsername(String username);

	boolean existsByEmail(String email);
}
