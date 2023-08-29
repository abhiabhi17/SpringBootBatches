package com.ats.batches;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ats.entity.BatchRunDetailsEntity;
import com.ats.entity.BatchRunSummaryEntity;
import com.ats.entity.TagTransactionTriggerEntity;
import com.ats.entity.UserMasterEntity;
import com.ats.jparepo.BatchRunEntityRepository;
import com.ats.jparepo.BatchRunSummaryRepository;
import com.ats.jparepo.TagMasterRepository;
import com.ats.jparepo.TagTransactionRepository;
import com.ats.jparepo.UserMasterRepository;


@Component
public class LowBalanceReminder implements Batch {
	
	private static final String  BATCH_NAME="LWBL_RMNDER";
	private static Integer SUCC_CNT=0;
	private static Integer FAIL_CNT=0;
	private static Integer TOTAL_CNT=0;
	@Autowired
	private BatchRunEntityRepository runDtlsRepo;
	
	@Autowired
	private BatchRunSummaryRepository summaryRepo;
	
	@Autowired
	private UserMasterRepository userMasterRepo;
	
	@Autowired
	private TagTransactionRepository tagtxRepo;
	
	@Autowired
	private TagMasterRepository tagMasterRepo;
	
	@Autowired
	private LowBalanceReminderHelper helper;

	@Override
	public void preprocess() {
		// TODO Logic to insert record to BATCH_RUN_DTLS
		
		BatchRunDetailsEntity entity=new BatchRunDetailsEntity();
		                   entity.setBatchname("BATCH_NAME");
		                   entity.setRunstatus("ST");
		                   entity.setStartdate(new Date());
		                  entity.setCreatedby("BATCH_NAME");
		                  
		                  
		  BatchRunDetailsEntity savedEntity = runDtlsRepo.save(entity);
		            Integer runSeqId  = savedEntity.getRunSeqId();
		 
		            
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		Date d =new Date();
		java.sql.Date date=new java.sql.Date(d.getTime());
	List<TagTransactionTriggerEntity>pendingTxTrgs=tagtxRepo.findAllPendingTriggers("Failed","LOW_BAL",  date, "p");
	        TOTAL_CNT=  pendingTxTrgs.size();
	        pendingTxTrgs.forEach(pendingTrgEntity ->{
	        	
	        	
	        Long tagid=	pendingTrgEntity.getTagid();
	        
	      Long trgId=  pendingTrgEntity.getTrgid();
	      Integer userId=tagMasterRepo.findByTagId(tagid);
	      
	      
	     Optional<UserMasterEntity> optional=userMasterRepo.findById(userId);
	     
	     if(optional.isPresent())
	      
	     {
	    	UserMasterEntity userEntity= optional.get();
	    	process(userEntity.getPhonum(),userEntity.getEmail(),trgId);
	     }
	        	
	        }
	        );
	        
	        
	  }

	@Override
	public void process(Long phno,String email,Long trgId) {
		// TODO Auto-generated method stub
		
		try {
			helper.sendMobileMsg(phno);
			helper.sendEmail(email);
		
			tagtxRepo.updateTriggerAsCompleted("BATCH_NAME", trgId);
			SUCC_CNT++;
		}
		catch(Exception e)
		
		{
			FAIL_CNT++;
		}
	}

	@Override
	public void postprocess(Integer runSeqId) {
		// TODO Auto-generated method stub
		
		
		
		BatchRunSummaryEntity entity=new BatchRunSummaryEntity();
		              entity.setCreatedby("BATCH_NAME");
		              String msg="TOT_CNT= "+TOTAL_CNT+", SUCC_CNT= "+SUCC_CNT+", FAIL_CNT= "+FAIL_CNT;
		          entity.setSummarydtls(msg);
		          entity.setBatchname("LOW_BAL_REMAINDER_BATCH_NAME");
		      summaryRepo.save(entity);
		      helper.updateBatchRunDtls(runSeqId);
		
		
	}

	public void test() {
	preprocess();
	start();

	
		
	}

	



}
