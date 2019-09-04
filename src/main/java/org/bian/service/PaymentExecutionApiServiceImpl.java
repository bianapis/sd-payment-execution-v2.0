/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class PaymentExecutionApiServiceImpl implements PaymentExecutionApiService {

	public SDPaymentExecutionActivateOutputModel activate(SDPaymentExecutionActivateInputModel request){
		return JsonReader.read("activate-SDPaymentExecutionActivateOutputModel.json",new TypeReference<SDPaymentExecutionActivateOutputModel>(){});
	}
	
	public SDPaymentExecutionConfigureOutputModel configure(String sdReferenceId, SDPaymentExecutionConfigureInputModel request){
		return JsonReader.read("configure-SDPaymentExecutionConfigureOutputModel.json",new TypeReference<SDPaymentExecutionConfigureOutputModel>(){});
	}
	
	public BQPaymentExecutionControlOutputModel controlPaymentexecution(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPaymentExecutionControlInputModel request){
		return JsonReader.read("control-BQPaymentExecutionControlOutputModel.json",new TypeReference<BQPaymentExecutionControlOutputModel>(){});
	}
	
	public SDPaymentExecutionFeedbackOutputModel feedback(String sdReferenceId, SDPaymentExecutionFeedbackInputModel request){
		return JsonReader.read("feedback-SDPaymentExecutionFeedbackOutputModel.json",new TypeReference<SDPaymentExecutionFeedbackOutputModel>(){});
	}
	
	public CRPaymentExecutionProcedureInitiateOutputModel initiate(String sdReferenceId, CRPaymentExecutionProcedureInitiateInputModel request){
		return JsonReader.read("initiate-CRPaymentExecutionProcedureInitiateOutputModel.json",new TypeReference<CRPaymentExecutionProcedureInitiateOutputModel>(){});
	}
	
	public CRPaymentExecutionProcedureRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRPaymentExecutionProcedureRetrieveOutputModel.json",new TypeReference<CRPaymentExecutionProcedureRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQPaymentExecutionRetrieveOutputModel retrievePaymentexecution(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQPaymentExecutionRetrieveOutputModel.json",new TypeReference<BQPaymentExecutionRetrieveOutputModel>(){});
	}
	
	public BQPaymentMechanismRetrieveOutputModel retrievePaymentmechanism(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQPaymentMechanismRetrieveOutputModel.json",new TypeReference<BQPaymentMechanismRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDPaymentExecutionRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDPaymentExecutionRetrieveOutputModel.json",new TypeReference<SDPaymentExecutionRetrieveOutputModel>(){});
	}
	
	public CRPaymentExecutionProcedureUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRPaymentExecutionProcedureUpdateInputModel request){
		return JsonReader.read("update-CRPaymentExecutionProcedureUpdateOutputModel.json",new TypeReference<CRPaymentExecutionProcedureUpdateOutputModel>(){});
	}
	
}
