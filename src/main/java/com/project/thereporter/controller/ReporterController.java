package com.project.thereporter.controller;

import javax.validation.constraints.Past;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.thereporter.entities.DailyActivityReport;
import com.project.thereporter.entities.ThirdPartyInjury;
import com.project.thereporter.entities.repositories.DailyActivityReportRepository;
import com.project.thereporter.entities.repositories.ThirdPartyInjuryRepository;
import com.project.thereporter.utility.CustomHttpStatus;

@RestController
@RequestMapping("api")
@Scope("prototype")
public class ReporterController {
	
	@Autowired
	ThirdPartyInjuryRepository thirdPartyInjuryRepository;
	@Autowired
	DailyActivityReportRepository dailyActivityReportRepository;
	
	@PostMapping("/saveThirdPartyInjury")
	public ResponseEntity<Object> saveThirdPartyInjury(@RequestBody ThirdPartyInjury thirdPartyInjury) {
		if (thirdPartyInjury == null) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		} else {
			ThirdPartyInjury flag = thirdPartyInjuryRepository.save(thirdPartyInjury);
			if (flag.getId()!=null && flag.getId()>0) {
				return ResponseEntity.status(HttpStatus.OK)
						.body(CustomHttpStatus.OK);
			}else {
				return ResponseEntity.status(HttpStatus.ALREADY_REPORTED)
						.body(CustomHttpStatus.ALREADY_REPORTED);
			}	
		}
	}
	@PostMapping("/saveDailyActivityReport")
	public ResponseEntity<Object> saveDailyActivityReport(@RequestBody DailyActivityReport dailyActivityReport) {
		if (dailyActivityReport == null) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		} else {
			DailyActivityReport flag = dailyActivityReportRepository.save(dailyActivityReport);
			if (flag.getId()!=null && flag.getId()>0) {
				return ResponseEntity.status(HttpStatus.OK)
						.body(CustomHttpStatus.OK);
			}else {
				return ResponseEntity.status(HttpStatus.ALREADY_REPORTED)
						.body(CustomHttpStatus.ALREADY_REPORTED);
			}	
		}
	}
}
