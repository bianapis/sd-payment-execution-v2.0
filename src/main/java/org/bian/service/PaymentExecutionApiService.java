/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface PaymentExecutionApiService {

	SDPaymentExecutionActivateOutputModel activate(SDPaymentExecutionActivateInputModel request);
	
	SDPaymentExecutionConfigureOutputModel configure(String sdReferenceId, SDPaymentExecutionConfigureInputModel request);
	
	BQPaymentExecutionControlOutputModel controlPaymentexecution(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPaymentExecutionControlInputModel request);
	
	SDPaymentExecutionFeedbackOutputModel feedback(String sdReferenceId, SDPaymentExecutionFeedbackInputModel request);
	
	CRPaymentExecutionProcedureInitiateOutputModel initiate(String sdReferenceId, CRPaymentExecutionProcedureInitiateInputModel request);
	
	CRPaymentExecutionProcedureRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	BQPaymentExecutionRetrieveOutputModel retrievePaymentexecution(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQPaymentMechanismRetrieveOutputModel retrievePaymentmechanism(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDPaymentExecutionRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRPaymentExecutionProcedureUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRPaymentExecutionProcedureUpdateInputModel request);
	
}
