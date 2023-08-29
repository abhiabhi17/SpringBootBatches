package com.ats.jparepo;

import java.io.Serializable;
import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.ats.entity.BatchRunDetailsEntity;



public interface BatchRunEntityRepository extends JpaRepository <BatchRunDetailsEntity,Serializable>{
	
	
	@Transactional
	@Modifying
	@Query("update BatchRunDetailsEntity be set be.runstatus=:status,be.enddate=:endDt,be.updatedby=:updateBy where be.runSeqId=:runSeqId")
	public void updateBatchRunDtlsStatus(String status,Date endDt,String updateBy,Integer runSeqId);

	
}
