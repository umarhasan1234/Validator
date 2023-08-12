package com.validator.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.validator.entity.Registration;

public interface RegistrationRepository extends JpaRepository<Registration, Long> {

}
