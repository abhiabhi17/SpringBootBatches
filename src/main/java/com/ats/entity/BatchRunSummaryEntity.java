package com.ats.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class BatchRunSummaryEntity {

	@Id
	@Column(name="SUMMARY_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "summary_id_generator")
	@SequenceGenerator(name="summary_id_generator",
	                   initialValue = 1,allocationSize = 1,
	  
	 
	                   sequenceName = "summary_id_generator")
	private Integer id;
	private String batchname;
	 private String summarydtls;
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
		public String getSummarydtls() {
			return summarydtls;
		}
		public void setSummarydtls(String summarydtls) {
			this.summarydtls = summarydtls;
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
			return "BatchRunSummaryEntity [id=" + id + ", batchname=" + batchname + ", summarydtls=" + summarydtls
					+ ", CreateDate=" + CreateDate + ", updateDate=" + updateDate + ", createdby=" + createdby
					+ ", updatedby=" + updatedby + "]";
		}
		
}
