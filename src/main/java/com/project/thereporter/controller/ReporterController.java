package com.project.thereporter.controller;

import java.util.List;

import javax.validation.constraints.Past;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.thereporter.entities.DailyActivityReport;
import com.project.thereporter.entities.DangerousSituation;
import com.project.thereporter.entities.EmployeeInjuryReport;
import com.project.thereporter.entities.ThirdPartyInjury;
import com.project.thereporter.entities.repositories.DailyActivityReportRepository;
import com.project.thereporter.entities.repositories.DangerousSituationRepository;
import com.project.thereporter.entities.repositories.EmployeeInjuryReportRepository;
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
	@Autowired
	DangerousSituationRepository  dangerousSituationRepository;
	@Autowired
	EmployeeInjuryReportRepository employeeInjuryReportRepository;
	
	//ThirdPartyInjury
	
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
	@GetMapping("/getThirdPartyInjuryListByUser")
	public ResponseEntity<Object> getThirdPartyInjuryListByUser(@RequestParam Long userId) {
		if (userId == null) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		} else {
			List<ThirdPartyInjury> flag = thirdPartyInjuryRepository.findAllByReportedBy(userId);
			if (flag!=null && flag.size()>0) {
				return ResponseEntity.status(HttpStatus.OK)
						.body(flag);
			}else {
				return ResponseEntity.status(HttpStatus.ALREADY_REPORTED)
						.body(CustomHttpStatus.ALREADY_REPORTED);
			}	
		}
	}
	
	//DailyActivityReport
	
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
	@GetMapping("/getDailyActivityReportListByUser")
	public ResponseEntity<Object> getDailyActivityReportListByUser(@RequestParam Long userId) {
		if (userId == null) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		} else {
			List<DailyActivityReport> flag = dailyActivityReportRepository.findAllByReportedBy(userId);
			if (flag!=null && flag.size()>0) {
				return ResponseEntity.status(HttpStatus.OK)
						.body(flag);
			}else {
				return ResponseEntity.status(HttpStatus.ALREADY_REPORTED)
						.body(CustomHttpStatus.ALREADY_REPORTED);
			}	
		}
	}
	
	//DangerousSituation
	
	@PostMapping("/saveDangerousSituation")
	public ResponseEntity<Object> saveDangerousSituationReport(@RequestBody DangerousSituation dangerousSituation) {
		if (dangerousSituation == null) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		} else {
			DangerousSituation flag = dangerousSituationRepository.save(dangerousSituation);
			if (flag.getId()!=null && flag.getId()>0) {
				return ResponseEntity.status(HttpStatus.OK)
						.body(CustomHttpStatus.OK);
			}else {
				return ResponseEntity.status(HttpStatus.ALREADY_REPORTED)
						.body(CustomHttpStatus.ALREADY_REPORTED);
			}	
		}
	}
	
	@GetMapping("/getDangerousSituationListByUser")
	public ResponseEntity<Object> getDangerousSituationListByUser(@RequestParam Long userId) {
		if (userId == null) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		} else {
			List<DangerousSituation> flag = dangerousSituationRepository.findAllByReportedBy(userId);
			if (flag!=null && flag.size()>0) {
				return ResponseEntity.status(HttpStatus.OK)
						.body(flag);
			}else {
				return ResponseEntity.status(HttpStatus.ALREADY_REPORTED)
						.body(CustomHttpStatus.ALREADY_REPORTED);
			}	
		}
	}
	
	//EmployeeInjuryReport
	
	@PostMapping("/saveEmployeeInjuryReport")
	public ResponseEntity<Object> saveEmployeeInjuryReport(@RequestBody EmployeeInjuryReport employeeInjuryReport) {
		if (employeeInjuryReport == null) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		} else {
			EmployeeInjuryReport flag = employeeInjuryReportRepository.save(employeeInjuryReport);
			if (flag.getId()!=null && flag.getId()>0) {
				return ResponseEntity.status(HttpStatus.OK)
						.body(CustomHttpStatus.OK);
			}else {
				return ResponseEntity.status(HttpStatus.ALREADY_REPORTED)
						.body(CustomHttpStatus.ALREADY_REPORTED);
			}	
		}
	}
	
	@GetMapping("/getEmployeeInjuryReportListByUser")
	public ResponseEntity<Object> getEmployeeInjuryReportListByUser(@RequestParam Long userId) {
		if (userId == null) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		} else {
			List<EmployeeInjuryReport> flag = employeeInjuryReportRepository.findAllByReportedBy(userId);
			if (flag!=null && flag.size()>0) {
				return ResponseEntity.status(HttpStatus.OK)
						.body(flag);
			}else {
				return ResponseEntity.status(HttpStatus.ALREADY_REPORTED)
						.body(CustomHttpStatus.ALREADY_REPORTED);
			}	
		}
	}
}
