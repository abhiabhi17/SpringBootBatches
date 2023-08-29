package com.ats.jparepo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ats.entity.TagMasterEntity;
import com.ats.entity.TagTransactionTriggerEntity;


public interface TagMasterRepository extends JpaRepository <TagMasterEntity,Serializable>{

	
	@Query(value="select userid from TagMasterEntity where tagid=:tagid")
	public Integer findByTagId(Long tagid);
}
