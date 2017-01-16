package com.tsystems.ecrono.domain.component;

import java.io.Serializable;

import javax.persistence.Column;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class DorsalPK implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "dorsal_umber")
    private int dorsalNumber;
    @Column(name = "race_id")
    private Long raceId;
}
