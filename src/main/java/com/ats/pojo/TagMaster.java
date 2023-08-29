package com.ats.pojo;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.ats.entity.UserMasterEntity;

public class TagMaster {


	@Id
	@Column(name="TAG_SEQ")
	
	private Integer id;
	
	
	  @Column(name="TAG_ID")
		private  Integer tagid;
	   
	   @Column(name="VEHICLE_REG_NUM")
		private String regNo;
		
		@Column(name="VEHICLE_TYPE")
		private String type;
	   
	   private Integer tagbalance;
	   
	   private Date startdate;
	   private Date expirydate;
	   
		
		
		
		@Column(name="USER_ID")
		private Integer userid;

		
		@Column(name="createDate",updatable = false)
		@CreationTimestamp
		private Date CreateDate;
		
		@Column(name="updateDate")
		@UpdateTimestamp
		private Date updateDate;
	  
		private String createdby;
		private String updatedby;
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public Integer getTagid() {
			return tagid;
		}
		public void setTagid(Integer tagid) {
			this.tagid = tagid;
		}
		public String getRegNo() {
			return regNo;
		}
		public void setRegNo(String regNo) {
			this.regNo = regNo;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public Integer getTagbalance() {
			return tagbalance;
		}
		public void setTagbalance(Integer tagbalance) {
			this.tagbalance = tagbalance;
		}
		public Date getStartdate() {
			return startdate;
		}
		public void setStartdate(Date startdate) {
			this.startdate = startdate;
		}
		public Date getExpirydate() {
			return expirydate;
		}
		public void setExpirydate(Date expirydate) {
			this.expirydate = expirydate;
		}
		public Integer getUserid() {
			return userid;
		}
		public void setUserid(Integer userid) {
			this.userid = userid;
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
			return "TagMaster [id=" + id + ", tagid=" + tagid + ", regNo=" + regNo + ", type=" + type + ", tagbalance="
					+ tagbalance + ", startdate=" + startdate + ", expirydate=" + expirydate + ", userid=" + userid
					+ ", CreateDate=" + CreateDate + ", updateDate=" + updateDate + ", createdby=" + createdby
					+ ", updatedby=" + updatedby + "]";
		}
		
		
}
