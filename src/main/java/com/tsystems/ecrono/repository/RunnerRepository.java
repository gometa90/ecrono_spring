package com.tsystems.ecrono.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tsystems.ecrono.domain.RunnerEntity;

public interface RunnerRepository extends JpaRepository<RunnerEntity, Long> {

    public List<RunnerEntity> findByFullNameContains(String subString);
}
