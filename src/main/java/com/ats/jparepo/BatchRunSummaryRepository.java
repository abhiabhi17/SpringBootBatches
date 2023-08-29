package com.ats.jparepo;

import java.io.Serializable;


import org.springframework.data.jpa.repository.JpaRepository;

import com.ats.entity.BatchRunSummaryEntity;


public interface BatchRunSummaryRepository extends JpaRepository <BatchRunSummaryEntity,Serializable>{

}
