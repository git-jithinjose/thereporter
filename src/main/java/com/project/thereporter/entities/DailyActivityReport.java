package com.project.thereporter.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

	@Entity
	@Table(schema = "freporter", catalog = "freporter", name = "daily_activity_report")
	public class DailyActivityReport {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "id")
		private Long id;

		@Column(name = "reported_by")
		private Long reportedBy;

		@Column(name = "reported_on")
		private String reportedOn;

		@Column(name = "shift")
		private String shift;

		@Column(name = "location")
		private String location;

		@Column(name = "activities")
		private String activities;

		@Column(name = "property_manager_or_local_authorities")
		private String propertyManagerOrLocalAuthorities;

		@Column(name = "special_events")
		private String specialEvents;

		@Column(name = "property_contact_info")
		private String propertyContactInfo;

		@Column(name = "reason")
		private String reason;

		@Column(name = "approve_notifications")
		private String approveNotifications;

		public Long getId() {
			return id;
		}

		public String getReportedOn() {
			return reportedOn;
		}

		public String getShift() {
			return shift;
		}

		public String getLocation() {
			return location;
		}

		public String getActivities() {
			return activities;
		}

		public String getPropertyManagerOrLocalAuthorities() {
			return propertyManagerOrLocalAuthorities;
		}

		public String getSpecialEvents() {
			return specialEvents;
		}

		public String getPropertyContactInfo() {
			return propertyContactInfo;
		}

		public String getReason() {
			return reason;
		}

		public String getApproveNotifications() {
			return approveNotifications;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public void setReportedOn(String reportedOn) {
			this.reportedOn = reportedOn;
		}

		public void setShift(String shift) {
			this.shift = shift;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public void setActivities(String activities) {
			this.activities = activities;
		}

		public void setPropertyManagerOrLocalAuthorities(String propertyManagerOrLocalAuthorities) {
			this.propertyManagerOrLocalAuthorities = propertyManagerOrLocalAuthorities;
		}

		public void setSpecialEvents(String specialEvents) {
			this.specialEvents = specialEvents;
		}

		public void setPropertyContactInfo(String propertyContactInfo) {
			this.propertyContactInfo = propertyContactInfo;
		}

		public void setReason(String reason) {
			this.reason = reason;
		}

		public void setApproveNotifications(String approveNotifications) {
			this.approveNotifications = approveNotifications;
		}

		public Long getReportedBy() {
			return reportedBy;
		}

		public void setReportedBy(Long reportedBy) {
			this.reportedBy = reportedBy;
		}

		
}