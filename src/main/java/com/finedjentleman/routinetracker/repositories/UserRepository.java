package com.finedjentleman.routinetracker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finedjentleman.routinetracker.models.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
