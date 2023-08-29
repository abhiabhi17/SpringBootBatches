package com.ats.entity;




import java.util.Date;
import java.util.Optional;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import org.hibernate.annotations.UpdateTimestamp;



@Entity
@Table(name="USER_MASTER")

public class UserMasterEntity {

	@Id
	@Column(name="USER_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "reg_id_generator")
	@SequenceGenerator(name="reg_id_generator",
	                   initialValue = 1,allocationSize = 1,
	 
	                  sequenceName = "reg_id_seq")
	private Integer userid;
	private String firstname;
	private String lastname;
	private String email;
	
  
    
	private Long phonum;
	private Date dob;
	private String gender;
	private String role;
	
	@Column(name="lock_status")
	private String lockstatus;
	
	@Column(name="active_status")
	private String activestatus;
	
	@Column(name="createDate",updatable = false)
	@CreationTimestamp
	private Date CreateDate;
	
	@Column(name="updateDate")
	@UpdateTimestamp
	private Date updateDate;

	
	private String createdby;
	private String updatedby;
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getPhonum() {
		return phonum;
	}
	public void setPhonum(Long phonum) {
		this.phonum = phonum;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getLockstatus() {
		return lockstatus;
	}
	public void setLockstatus(String lockstatus) {
		this.lockstatus = lockstatus;
	}
	public String getActivestatus() {
		return activestatus;
	}
	public void setActivestatus(String activestatus) {
		this.activestatus = activestatus;
	}
	public Date getCreateDate() {
		return CreateDate;
	}
	public void setCreateDate(Date createDate) {
		CreateDate = createDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public String getCreatedby() {
		return createdby;
	}
	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}
	public String getUpdatedby() {
		return updatedby;
	}
	public void setUpdatedby(String updatedby) {
		this.updatedby = updatedby;
	}
	@Override
	public String toString() {
		return "UserMasterEntity [userid=" + userid + ", firstname=" + firstname + ", lastname=" + lastname + ", email="
				+ email + ", phonum=" + phonum + ", dob=" + dob + ", gender=" + gender + ", role=" + role
				+ ", lockstatus=" + lockstatus + ", activestatus=" + activestatus + ", CreateDate=" + CreateDate
				+ ", updateDate=" + updateDate + ", createdby=" + createdby + ", updatedby=" + updatedby + "]";
	}


}
