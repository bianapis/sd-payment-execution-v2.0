package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPaymentExecutionProcedureInitiateInputModelPaymentExecutionProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRPaymentExecutionProcedureInitiateInputModel
 */
public class CRPaymentExecutionProcedureInitiateInputModel   {
  private String paymentExecutionServicingSessionReference = null;

  private Object paymentExecutionProcedureInitiateActionRecord = null;

  private String paymentExecutionProcedureInstanceStatus = null;

  private CRPaymentExecutionProcedureInitiateInputModelPaymentExecutionProcedureInstanceRecord paymentExecutionProcedureInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return paymentExecutionServicingSessionReference
  **/

  public String getPaymentExecutionServicingSessionReference() {
    return paymentExecutionServicingSessionReference;
  }

  public void setPaymentExecutionServicingSessionReference(String paymentExecutionServicingSessionReference) {
    this.paymentExecutionServicingSessionReference = paymentExecutionServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return paymentExecutionProcedureInitiateActionRecord
  **/

  public Object getPaymentExecutionProcedureInitiateActionRecord() {
    return paymentExecutionProcedureInitiateActionRecord;
  }

  public void setPaymentExecutionProcedureInitiateActionRecord(Object paymentExecutionProcedureInitiateActionRecord) {
    this.paymentExecutionProcedureInitiateActionRecord = paymentExecutionProcedureInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Payment Execution Procedure instance (e.g. initialised, pending, active) 
   * @return paymentExecutionProcedureInstanceStatus
  **/

  public String getPaymentExecutionProcedureInstanceStatus() {
    return paymentExecutionProcedureInstanceStatus;
  }

  public void setPaymentExecutionProcedureInstanceStatus(String paymentExecutionProcedureInstanceStatus) {
    this.paymentExecutionProcedureInstanceStatus = paymentExecutionProcedureInstanceStatus;
  }


  /**
   * Get paymentExecutionProcedureInstanceRecord
   * @return paymentExecutionProcedureInstanceRecord
  **/

  public CRPaymentExecutionProcedureInitiateInputModelPaymentExecutionProcedureInstanceRecord getPaymentExecutionProcedureInstanceRecord() {
    return paymentExecutionProcedureInstanceRecord;
  }

  public void setPaymentExecutionProcedureInstanceRecord(CRPaymentExecutionProcedureInitiateInputModelPaymentExecutionProcedureInstanceRecord paymentExecutionProcedureInstanceRecord) {
    this.paymentExecutionProcedureInstanceRecord = paymentExecutionProcedureInstanceRecord;
  }


}

