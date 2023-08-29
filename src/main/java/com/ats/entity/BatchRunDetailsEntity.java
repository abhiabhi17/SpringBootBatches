package com.ats.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;



@Entity
@Table(name="BATCH_RUN_DTLS")
public class BatchRunDetailsEntity {

	@Id
	@Column(name="RUN_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "run_id_generator")
	@SequenceGenerator(name="run_id_generator",
	                   initialValue = 1,allocationSize = 1,
	  
	 
	                   sequenceName = "run_id_generator")
	private Integer runSeqId;
	
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
	public Integer getRunSeqId() {
		return runSeqId;
	}
	public void setRunSeqId(Integer runSeqId) {
		this.runSeqId = runSeqId;
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
		return "BatchRunDetailsEntity [runSeqId=" + runSeqId + ", batchname=" + batchname + ", startdate=" + startdate
				+ ", runstatus=" + runstatus + ", enddate=" + enddate + ", CreateDate=" + CreateDate + ", updateDate="
				+ updateDate + ", createdby=" + createdby + ", updatedby=" + updatedby + "]";
	}
	
	

}
