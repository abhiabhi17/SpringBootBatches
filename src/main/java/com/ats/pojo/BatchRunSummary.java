package com.ats.pojo;

import java.util.Date;

import javax.persistence.Column;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;



public class BatchRunSummary {

	@Column(name="SUMMARY_ID")
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
			return "BatchRunSummary [id=" + id + ", batchname=" + batchname + ", summarydtls=" + summarydtls
					+ ", CreateDate=" + CreateDate + ", updateDate=" + updateDate + ", createdby=" + createdby
					+ ", updatedby=" + updatedby + "]";
		}
		
}
