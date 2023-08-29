package com.ats.batches;

public interface Batch {

	
	public void preprocess();
	public void start();
	public void process(Long phno, String email, Long txnId);
	public void postprocess(Integer runSeqId);

	
	
}
