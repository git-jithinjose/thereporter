package com.project.thereporter.entities.repositories;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.project.thereporter.entities.DailyActivityReport;
import com.project.thereporter.entities.ThirdPartyInjury;


public interface DailyActivityReportRepository extends JpaRepository<DailyActivityReport, Long> {

	List<DailyActivityReport> findAllByReportedBy(Long userId);

}
