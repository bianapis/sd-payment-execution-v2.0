package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPaymentExecutionProcedureUpdateInputModelPaymentExecutionProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRPaymentExecutionProcedureUpdateInputModel
 */
public class CRPaymentExecutionProcedureUpdateInputModel   {
  private String paymentExecutionServicingSessionReference = null;

  private String paymentExecutionProcedureInstanceReference = null;

  private CRPaymentExecutionProcedureUpdateInputModelPaymentExecutionProcedureInstanceRecord paymentExecutionProcedureInstanceRecord = null;

  private Object paymentExecutionProcedureUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Payment Execution Procedure instance 
   * @return paymentExecutionProcedureInstanceReference
  **/

  public String getPaymentExecutionProcedureInstanceReference() {
    return paymentExecutionProcedureInstanceReference;
  }

  public void setPaymentExecutionProcedureInstanceReference(String paymentExecutionProcedureInstanceReference) {
    this.paymentExecutionProcedureInstanceReference = paymentExecutionProcedureInstanceReference;
  }


  /**
   * Get paymentExecutionProcedureInstanceRecord
   * @return paymentExecutionProcedureInstanceRecord
  **/

  public CRPaymentExecutionProcedureUpdateInputModelPaymentExecutionProcedureInstanceRecord getPaymentExecutionProcedureInstanceRecord() {
    return paymentExecutionProcedureInstanceRecord;
  }

  public void setPaymentExecutionProcedureInstanceRecord(CRPaymentExecutionProcedureUpdateInputModelPaymentExecutionProcedureInstanceRecord paymentExecutionProcedureInstanceRecord) {
    this.paymentExecutionProcedureInstanceRecord = paymentExecutionProcedureInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return paymentExecutionProcedureUpdateActionTaskRecord
  **/

  public Object getPaymentExecutionProcedureUpdateActionTaskRecord() {
    return paymentExecutionProcedureUpdateActionTaskRecord;
  }

  public void setPaymentExecutionProcedureUpdateActionTaskRecord(Object paymentExecutionProcedureUpdateActionTaskRecord) {
    this.paymentExecutionProcedureUpdateActionTaskRecord = paymentExecutionProcedureUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

