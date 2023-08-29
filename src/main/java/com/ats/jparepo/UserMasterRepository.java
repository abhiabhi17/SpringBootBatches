package com.ats.jparepo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ats.entity.UserMasterEntity;


public interface UserMasterRepository extends JpaRepository <UserMasterEntity,Serializable>{

}
