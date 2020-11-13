package com.project.thereporter.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(schema = "freporter", catalog = "freporter", name = "user_setup")
public class UserSetup {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_Id")
	private Long userId;

	@Column(name = "user_Name")
	private String userName;

	@Column(name = "gender")
	private String gender;

	@Column(name = "mobile_No")
	private String mobileNo;

	@Column(name = "email_Id")
	private String emailId;

	@Column(name = "password")
	private String password;

	@Column(name = "type")
	private String type;

	@Column(name = "inst_Name")
	private String instName;

	@Column(name = "inst_Type")
	private String instType;

	@Column(name = "inst_Reg_No")
	private String instRegNo;

	@Column(name = "address")
	private String address; 

	@Column(name = "pincode")
	private String pincode;

	@Column(name = "submitted_On")
	private Date submittedOn;

	@Column(name = "active_Status")
	private String activeStatus;

	@Column(name = "admin_Status")
	private String adminStatus;

	@Column(name = "deactivated_On")
	private Date deactivatedOn;

	public Long getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}

	public String getGender() {
		return gender;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public String getPassword() {
		return password;
	}

	public String getType() {
		return type;
	}

	public String getInstName() {
		return instName;
	}

	public String getInstType() {
		return instType;
	}

	public String getInstRegNo() {
		return instRegNo;
	}

	public String getAddress() {
		return address;
	}

	public String getPincode() {
		return pincode;
	}

	public Date getSubmittedOn() {
		return submittedOn;
	}

	public String getActiveStatus() {
		return activeStatus;
	}

	public String getAdminStatus() {
		return adminStatus;
	}

	public Date getDeactivatedOn() {
		return deactivatedOn;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setInstName(String instName) {
		this.instName = instName;
	}

	public void setInstType(String instType) {
		this.instType = instType;
	}

	public void setInstRegNo(String instRegNo) {
		this.instRegNo = instRegNo;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public void setSubmittedOn(Date submittedOn) {
		this.submittedOn = submittedOn;
	}

	public void setActiveStatus(String activeStatus) {
		this.activeStatus = activeStatus;
	}

	public void setAdminStatus(String adminStatus) {
		this.adminStatus = adminStatus;
	}

	public void setDeactivatedOn(Date deactivatedOn) {
		this.deactivatedOn = deactivatedOn;
	}
	
}
