package com.project.thereporter.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "freporter", catalog = "freporter", name = "dangerous_situation")
public class DangerousSituation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "reported_by")
	private Long reportedBy;

	@Column(name = "reported_on")
	private String reportedOn;
	
	@Column(name = "unique_identifier")
	private String uniqueIdentifier;
	
	@Column(name = "emergency")
	private String emergency;
	
	@Column(name = "situation_details")
	private String situationDetails;
	
	@Column(name = "attachments")
	private String attachments;
	
	@Column(name = "incident_location")
	private String incidentLocation;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "follow")
	private String follow;
	
	@Column(name = "conditions")
	private String conditions;

	public Long getId() {
		return id;
	}

	public String getReportedOn() {
		return reportedOn;
	}

	public String getUniqueIdentifier() {
		return uniqueIdentifier;
	}

	public String getEmergency() {
		return emergency;
	}

	public String getSituationDetails() {
		return situationDetails;
	}

	public String getAttachments() {
		return attachments;
	}

	public String getIncidentLocation() {
		return incidentLocation;
	}

	public String getStatus() {
		return status;
	}

	public String getFollow() {
		return follow;
	}

	public String getConditions() {
		return conditions;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setReportedOn(String reportedOn) {
		this.reportedOn = reportedOn;
	}

	public void setUniqueIdentifier(String uniqueIdentifier) {
		this.uniqueIdentifier = uniqueIdentifier;
	}

	public void setEmergency(String emergency) {
		this.emergency = emergency;
	}

	public void setSituationDetails(String situationDetails) {
		this.situationDetails = situationDetails;
	}

	public void setAttachments(String attachments) {
		this.attachments = attachments;
	}

	public void setIncidentLocation(String incidentLocation) {
		this.incidentLocation = incidentLocation;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setFollow(String follow) {
		this.follow = follow;
	}

	public void setConditions(String conditions) {
		this.conditions = conditions;
	}

	public Long getReportedBy() {
		return reportedBy;
	}

	public void setReportedBy(Long reportedBy) {
		this.reportedBy = reportedBy;
	}
	
	
}
