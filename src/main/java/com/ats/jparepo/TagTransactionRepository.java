package com.ats.jparepo;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.ats.entity.TagTransactionTriggerEntity;

public interface TagTransactionRepository extends JpaRepository <TagTransactionTriggerEntity,Serializable>{

	
	@Query(value="select from TagTransactionEntity where txStatus=:status and txfailurereason=:reason and  CreateDate=:date and remindermsgsw=:remindersw")
	List<TagTransactionTriggerEntity> findAllPendingTriggers(String status,String reason,java.sql.Date date,String remindersw);

	
	@Modifying
	@Transactional
	@Query(value="update TagTransactionTriggerEntity set remindermsgsw='c', updateby=:updateby where trgid=:trgId")
	public void updateTriggerAsCompleted(String updateby,Long trgId);




}
