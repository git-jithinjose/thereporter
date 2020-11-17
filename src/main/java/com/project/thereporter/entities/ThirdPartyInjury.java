package com.project.thereporter.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "freporter", catalog = "freporter", name = "third_party_injury")
public class ThirdPartyInjury {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "reported_by")
	private Long reportedBy;

	@Column(name = "reported_on")
	private String reportedOn;

	@Column(name = "date_and_time_of_injury")
	private String dateAndTimeOfInjury;

	@Column(name = "location")
	private String location;

	@Column(name = "incident_type")
	private String incidentType;

	@Column(name = "description")
	private String description;

	@Column(name = "attachment")
	private String attachment;

	@Column(name = "reported_to")
	private String reportedTo;

	@Column(name = "emergency_responder_name")
	private String emergencyResponderName;

	@Column(name = "phone")
	private String phone;

	@Column(name = "report")
	private String report;

	@Column(name = "injured_party_name")
	private String partyName;

	@Column(name = "injured_party_email")
	private String partyEmail;

	@Column(name = "injured_party_address")
	private String partyAddress;

	@Column(name = "injured_party_phone_no")
	private String partyPhoneNo;

	@Column(name = "injured_party_driver_license")
	private String partyDriverLicense;

	@Column(name = "injured_party_birthday")
	private String partyBirthday;

	@Column(name = "injured_party_ssn")
	private String injuredPartySsn;

	@Column(name = "injured_party_other_information")
	private String partyOtherInformation;

	@Column(name = "injured_party_gender")
	private String partyGender;

	@Column(name = "injured_party_describe_injury")
	private String partyDescribeInjury;

	@Column(name = "injured_party_cause_of_injury")
	private String partyCauseOfInjury;

	@Column(name = "was_the_party_involved_in_treated")
	private String partyInvolvedInTreated;

	@Column(name = "witnesses")
	private String witnesses;

	public Long getId() {
		return id;
	}


	public String getReportedOn() {
		return reportedOn;
	}

	public String getDateAndTimeOfInjury() {
		return dateAndTimeOfInjury;
	}

	public String getLocation() {
		return location;
	}

	public String getIncidentType() {
		return incidentType;
	}

	public String getDescription() {
		return description;
	}

	public String getAttachment() {
		return attachment;
	}


	public String getEmergencyResponderName() {
		return emergencyResponderName;
	}

	public String getPhone() {
		return phone;
	}

	public String getReport() {
		return report;
	}

	public String getPartyName() {
		return partyName;
	}

	public String getPartyEmail() {
		return partyEmail;
	}

	public String getPartyAddress() {
		return partyAddress;
	}

	public String getPartyPhoneNo() {
		return partyPhoneNo;
	}

	public String getPartyDriverLicense() {
		return partyDriverLicense;
	}

	public String getPartyBirthday() {
		return partyBirthday;
	}

	public String getInjuredPartySsn() {
		return injuredPartySsn;
	}


	public String getPartyGender() {
		return partyGender;
	}

	public String getPartyDescribeInjury() {
		return partyDescribeInjury;
	}

	public String getPartyCauseOfInjury() {
		return partyCauseOfInjury;
	}

	public String getPartyInvolvedInTreated() {
		return partyInvolvedInTreated;
	}

	public String getWitnesses() {
		return witnesses;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public void setReportedOn(String reportedOn) {
		this.reportedOn = reportedOn;
	}

	public void setDateAndTimeOfInjury(String dateAndTimeOfInjury) {
		this.dateAndTimeOfInjury = dateAndTimeOfInjury;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setIncidentType(String incidentType) {
		this.incidentType = incidentType;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}

	public void setEmergencyResponderName(String emergencyResponderName) {
		this.emergencyResponderName = emergencyResponderName;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setReport(String report) {
		this.report = report;
	}

	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}

	public void setPartyEmail(String partyEmail) {
		this.partyEmail = partyEmail;
	}

	public void setPartyAddress(String partyAddress) {
		this.partyAddress = partyAddress;
	}

	public void setPartyPhoneNo(String partyPhoneNo) {
		this.partyPhoneNo = partyPhoneNo;
	}

	public void setPartyDriverLicense(String partyDriverLicense) {
		this.partyDriverLicense = partyDriverLicense;
	}

	public void setPartyBirthday(String partyBirthday) {
		this.partyBirthday = partyBirthday;
	}

	public void setInjuredPartySsn(String injuredPartySsn) {
		this.injuredPartySsn = injuredPartySsn;
	}

	public void setPartyGender(String partyGender) {
		this.partyGender = partyGender;
	}

	public void setPartyDescribeInjury(String partyDescribeInjury) {
		this.partyDescribeInjury = partyDescribeInjury;
	}

	public void setPartyCauseOfInjury(String partyCauseOfInjury) {
		this.partyCauseOfInjury = partyCauseOfInjury;
	}

	public void setPartyInvolvedInTreated(String partyInvolvedInTreated) {
		this.partyInvolvedInTreated = partyInvolvedInTreated;
	}

	public void setWitnesses(String witnesses) {
		this.witnesses = witnesses;
	}

	public String getReportedTo() {
		return reportedTo;
	}

	public void setReportedTo(String reportedTo) {
		this.reportedTo = reportedTo;
	}

	public String getPartyOtherInformation() {
		return partyOtherInformation;
	}

	public void setPartyOtherInformation(String partyOtherInformation) {
		this.partyOtherInformation = partyOtherInformation;
	}


	public Long getReportedBy() {
		return reportedBy;
	}


	public void setReportedBy(Long reportedBy) {
		this.reportedBy = reportedBy;
	}
	
	
}
