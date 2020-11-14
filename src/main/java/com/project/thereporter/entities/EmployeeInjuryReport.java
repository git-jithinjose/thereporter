package com.project.thereporter.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "freporter", catalog = "freporter", name = "employee_injury_report")
public class EmployeeInjuryReport {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "reported_by")
	private String reportedBy;

	@Column(name = "reported_on")
	private String reportedOn;
	
	@Column(name = "incident_id")
	private String incidentId;
	
	@Column(name = "injured_employee_name")
	private String injuredEmployeeName;
	
	@Column(name = "job_title")
	private String jobTitle;
	
	@Column(name = "super_visors_name")
	private String superVisorsName;
	
	@Column(name = "was_the_supervisor_informed")
	private String wasTheSupervisorInformed;
	
	@Column(name = "date_and_time_of_injury")
	private String dateAndTimeOfInjury;
	
	@Column(name = "witness_names")
	private String witnessNames;
	
	@Column(name = "where_exactly_did_it_happen")
	private String whereExactlyDidItHappen;
	
	@Column(name = "what_was_the_employee_doing_at_that_time")
	private String whatWasTheEmployeeDoingAtThatTime;
	
	@Column(name = "what_could_have_been_done_to_prevent_this_injury")
	private String whatCouldHaveBeenDoneToPreventThisInjury;
	
	@Column(name = "what_body_parts_were_injured")
	private String whatBodyPartsWereInjured;
	
	@Column(name = "was_a_doctor_consulted")
	private String wasADoctorConsulted;
	
	@Column(name = "has_the_part_of_your_body_been_injured_before")
	private String hasThePartOfYourBodyBeenInjuredBefore;
	
	@Column(name = "your_signature")
	private String yourSignature;
	
	@Column(name = "incident_location")
	private String incidentLocation;
	
	@Column(name = "attachments")
	private String attachments;
	
	@Column(name = "notes")
	private String notes;

	public Long getId() {
		return id;
	}

	public String getReportedBy() {
		return reportedBy;
	}

	public String getReportedOn() {
		return reportedOn;
	}

	public String getIncidentId() {
		return incidentId;
	}

	public String getInjuredEmployeeName() {
		return injuredEmployeeName;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public String getSuperVisorsName() {
		return superVisorsName;
	}

	public String getWasTheSupervisorInformed() {
		return wasTheSupervisorInformed;
	}

	public String getDateAndTimeOfInjury() {
		return dateAndTimeOfInjury;
	}

	public String getWitnessNames() {
		return witnessNames;
	}

	public String getWhereExactlyDidItHappen() {
		return whereExactlyDidItHappen;
	}

	public String getWhatWasTheEmployeeDoingAtThatTime() {
		return whatWasTheEmployeeDoingAtThatTime;
	}

	public String getWhatCouldHaveBeenDoneToPreventThisInjury() {
		return whatCouldHaveBeenDoneToPreventThisInjury;
	}

	public String getWhatBodyPartsWereInjured() {
		return whatBodyPartsWereInjured;
	}

	public String getWasADoctorConsulted() {
		return wasADoctorConsulted;
	}

	public String getHasThePartOfYourBodyBeenInjuredBefore() {
		return hasThePartOfYourBodyBeenInjuredBefore;
	}

	public String getYourSignature() {
		return yourSignature;
	}

	public String getIncidentLocation() {
		return incidentLocation;
	}

	public String getAttachments() {
		return attachments;
	}

	public String getNotes() {
		return notes;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setReportedBy(String reportedBy) {
		this.reportedBy = reportedBy;
	}

	public void setReportedOn(String reportedOn) {
		this.reportedOn = reportedOn;
	}

	public void setIncidentId(String incidentId) {
		this.incidentId = incidentId;
	}

	public void setInjuredEmployeeName(String injuredEmployeeName) {
		this.injuredEmployeeName = injuredEmployeeName;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public void setSuperVisorsName(String superVisorsName) {
		this.superVisorsName = superVisorsName;
	}

	public void setWasTheSupervisorInformed(String wasTheSupervisorInformed) {
		this.wasTheSupervisorInformed = wasTheSupervisorInformed;
	}

	public void setDateAndTimeOfInjury(String dateAndTimeOfInjury) {
		this.dateAndTimeOfInjury = dateAndTimeOfInjury;
	}

	public void setWitnessNames(String witnessNames) {
		this.witnessNames = witnessNames;
	}

	public void setWhereExactlyDidItHappen(String whereExactlyDidItHappen) {
		this.whereExactlyDidItHappen = whereExactlyDidItHappen;
	}

	public void setWhatWasTheEmployeeDoingAtThatTime(String whatWasTheEmployeeDoingAtThatTime) {
		this.whatWasTheEmployeeDoingAtThatTime = whatWasTheEmployeeDoingAtThatTime;
	}

	public void setWhatCouldHaveBeenDoneToPreventThisInjury(String whatCouldHaveBeenDoneToPreventThisInjury) {
		this.whatCouldHaveBeenDoneToPreventThisInjury = whatCouldHaveBeenDoneToPreventThisInjury;
	}

	public void setWhatBodyPartsWereInjured(String whatBodyPartsWereInjured) {
		this.whatBodyPartsWereInjured = whatBodyPartsWereInjured;
	}

	public void setWasADoctorConsulted(String wasADoctorConsulted) {
		this.wasADoctorConsulted = wasADoctorConsulted;
	}

	public void setHasThePartOfYourBodyBeenInjuredBefore(String hasThePartOfYourBodyBeenInjuredBefore) {
		this.hasThePartOfYourBodyBeenInjuredBefore = hasThePartOfYourBodyBeenInjuredBefore;
	}

	public void setYourSignature(String yourSignature) {
		this.yourSignature = yourSignature;
	}

	public void setIncidentLocation(String incidentLocation) {
		this.incidentLocation = incidentLocation;
	}

	public void setAttachments(String attachments) {
		this.attachments = attachments;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}
	
}
