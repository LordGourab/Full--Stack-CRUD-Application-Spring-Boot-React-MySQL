package com.gourabcodes.fullstack_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gourabcodes.fullstack_backend.model.User;

public interface UserRepository extends JpaRepository<User,Long> {

}
