package com.fullstackextra.fullstackextra.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fullstackextra.fullstackextra.entities.Problem;

public interface Repositories extends JpaRepository<Problem, Integer> {

}
