package com.tsystems.ecrono.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tsystems.ecrono.domain.DorsalEntity;
import com.tsystems.ecrono.domain.RunnerEntity;

public interface DorsalRepository extends JpaRepository<DorsalEntity, Long> {

    DorsalEntity findByRaceIdAndRunner(Long raceId, RunnerEntity runner);

    // Me bajo a HQL, y con la etiqueta de @Query obligo a que Spring ejecute la
    // query que yo quiero
    @Query(value = "FROM DorsalEntity d LEFT JOIN FETCH d.runner WHERE d.raceId = ?1")
    List<DorsalEntity> findByRaceId(Long raceId);

    @Query("FROM DorsalEntity d LEFT JOIN d.runner r WHERE (d.raceId=?1 AND r.id=?2)")
    DorsalEntity findByRaceIdAndRunnerId(Long raceId, Long runnerId);

    // deletes
    void deleteByRaceIdAndRunner(Long raceId, RunnerEntity runner);

    @Query(value = "DELETE FROM dorsals d WHERE (d.id=?1 AND d.id=?2)", nativeQuery = true)
    void deleteByRaceIdAndRunner(Long raceId, Long runnerId);
}
