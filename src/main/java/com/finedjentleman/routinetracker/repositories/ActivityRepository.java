package com.finedjentleman.routinetracker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finedjentleman.routinetracker.models.Activity;

public interface ActivityRepository extends JpaRepository<Activity, Long> {

}
