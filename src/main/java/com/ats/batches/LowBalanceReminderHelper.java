package com.ats.batches;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ats.jparepo.BatchRunEntityRepository;
import com.ats.jparepo.TagTransactionRepository;

@Service
public class LowBalanceReminderHelper {
	
	@Autowired
	private BatchRunEntityRepository runDtlsRepo; 

	public void sendMobileMsg(Long phno) {
		// TODO Auto-generated method stub
		
	}

	public void sendEmail(String email) {
		// TODO Auto-generated method stub
		
	}
	
	public void updateTrgAsCompleted(Integer trgid)
	{
		
	}

	
	public void updateBatchRunDtls(Integer runSeqId)
	{
		runDtlsRepo.updateBatchRunDtlsStatus("EN", new Date(), "Low_BAL", runSeqId);
	}

	public void updateTrgAsCompleted(Long l, String string) {
		// TODO Auto-generated method stub
		
		
		
	}
}
