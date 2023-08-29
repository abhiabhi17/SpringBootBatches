package com.ats.pojo;

import java.util.Date;

import javax.persistence.Column;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

public class BatchRunDetails {
	
	@Column(name="RUN_ID")
	private Integer id;
	private String batchname;
	private Date startdate;
	private String runstatus;
	private Date enddate;
	
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
	public String getBatchname() {
		return batchname;
	}
	public void setBatchname(String batchname) {
		this.batchname = batchname;
	}
	public Date getStartdate() {
		return startdate;
	}
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}
	public String getRunstatus() {
		return runstatus;
	}
	public void setRunstatus(String runstatus) {
		this.runstatus = runstatus;
	}
	public Date getEnddate() {
		return enddate;
	}
	public void setEnddate(Date enddate) {
		this.enddate = enddate;
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
		return "BatchRunDetails [id=" + id + ", batchname=" + batchname + ", startdate=" + startdate + ", runstatus="
				+ runstatus + ", enddate=" + enddate + ", CreateDate=" + CreateDate + ", updateDate=" + updateDate
				+ ", createdby=" + createdby + ", updatedby=" + updatedby + "]";
	}
	
	

}
