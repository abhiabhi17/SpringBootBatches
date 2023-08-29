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
@Table(name="TAG_TX_TRIGGER")
public class TagTransactionTriggerEntity {

	@Id
	@Column(name="TRG_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tag_tx_id_generator")
	@SequenceGenerator(name="tag_tx_id_generator",
	                   initialValue = 1,allocationSize = 1,
	 
	                  sequenceName = "tag_tx_id_generator")
	
	private Long trgid;
	@Column(name="TAG_ID")
	private Long tagid;
	
	@Column(name="VEHICLE_REG_NUM")
	private String vehicleregno;
	
	
	@Column(name="TAG_PLAZA_ID")
	private Integer tagplazaid;
	
	@Column(name="TOLL_AMT")
	private Integer tollamount;
	
	@Column(name="TX_STATUS")
	private String txstatus;
	
	@Column(name="TX_FAILURE_RS")
	 private String txfailurereason;
	
	@Column(name="REMINDER_MSG_SW")
	private String remindermsgsw;
	
	   @Column(name="createDate",updatable = false)
		@CreationTimestamp
		private Date CreateDate;
		
		@Column(name="updateDate")
		@UpdateTimestamp
		private Date updateDate;
	  
		private String createdby;
		private String updatedby;
		public Long getTrgid() {
			return trgid;
		}
		public void setTrgid(Long trgid) {
			this.trgid = trgid;
		}
		public Long getTagid() {
			return tagid;
		}
		public void setTagid(Long tagid) {
			this.tagid = tagid;
		}
		public String getVehicleregno() {
			return vehicleregno;
		}
		public void setVehicleregno(String vehicleregno) {
			this.vehicleregno = vehicleregno;
		}
		public Integer getTagplazaid() {
			return tagplazaid;
		}
		public void setTagplazaid(Integer tagplazaid) {
			this.tagplazaid = tagplazaid;
		}
		public Integer getTollamount() {
			return tollamount;
		}
		public void setTollamount(Integer tollamount) {
			this.tollamount = tollamount;
		}
		public String getTxstatus() {
			return txstatus;
		}
		public void setTxstatus(String txstatus) {
			this.txstatus = txstatus;
		}
		public String getTxfailurereason() {
			return txfailurereason;
		}
		public void setTxfailurereason(String txfailurereason) {
			this.txfailurereason = txfailurereason;
		}
		public String getRemindermsgsw() {
			return remindermsgsw;
		}
		public void setRemindermsgsw(String remindermsgsw) {
			this.remindermsgsw = remindermsgsw;
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
			return "TagTransactionTriggerEntity [trgid=" + trgid + ", tagid=" + tagid + ", vehicleregno=" + vehicleregno
					+ ", tagplazaid=" + tagplazaid + ", tollamount=" + tollamount + ", txstatus=" + txstatus
					+ ", txfailurereason=" + txfailurereason + ", remindermsgsw=" + remindermsgsw + ", CreateDate="
					+ CreateDate + ", updateDate=" + updateDate + ", createdby=" + createdby + ", updatedby="
					+ updatedby + "]";
		}
		
	
}
