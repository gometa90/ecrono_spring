package com.tsystems.ecrono.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "machines")
@Data
@EqualsAndHashCode(of = "id")
public class MachineEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "INT")
    private Long id;
    @Column(name = "machine_code", unique = true, nullable = false)
    private String machineCode;

    // relacion maquina-marca
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "machineId")
    private List<TimeStampEntity> timeStamp;
}
