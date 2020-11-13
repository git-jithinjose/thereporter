package com.project.thereporter.entities.repositories;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.project.thereporter.entities.ThirdPartyInjury;


public interface ThirdPartyInjuryRepository extends JpaRepository<ThirdPartyInjury, Long> {

}
